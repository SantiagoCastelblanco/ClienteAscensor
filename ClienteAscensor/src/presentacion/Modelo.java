package presentacion;

import Logica.SocketCliente;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Modelo implements Runnable{

    private static boolean sobrepeso;
    private Ventana ventana;
    private int internalID;
    private int pisosOp[];
    int personasSubiendo;
    private SocketCliente elSocket;

    public void iniciar() {
        getVentana().setSize(800, 800);
        getVentana().setVisible(true);
        mostrarMensajeID();
        elSocket = new SocketCliente(internalID);
        pisosOp = new int[10];
        run();
    }

    public Ventana getVentana() {
        if (ventana == null) {
            ventana = new Ventana(this);
        }
        return ventana;
    }
    
    @Override
    public void run() {
        boolean activo = true;
        while(activo){
            System.out.println("activo");
            if(elSocket.tieneMensaje()){
                int pisoActual = elSocket.getPisoAscensor();
                String piso="";
                if(pisoActual>=0&&pisoActual<3){
                    piso = "S"+(3-pisoActual);
                }
                else{
                    piso =String.valueOf(pisoActual-2);
                }
                getVentana().getLblPisoActual().setText(piso);
            }
        }
    }

    void mostrarMensajeID() {
        boolean verificar = false;
        while (verificar == false) {
            try {
                internalID = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la ID del cliente(ID NUMERICA)"));
                if (internalID >= 0 && internalID <= 10) {
                    verificar = true;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "!!ID no valida!!");
            }
        }

    }

    void mostrarMensaje() {
        boolean verificar = false;
        while (verificar == false) {
            try {
                personasSubiendo = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas personas subiran?"));
                verificar = true;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "!!Dato invalido!!");
            }
        }
    }

    public void actualizarPisolbl() {

    }

    boolean sobrepeso(int personasSub) {
        personasSubiendo = personasSub;
        if (personasSub > 10) {
            sobrepeso = true;
        }
        if (personasSub <= 10) {
            sobrepeso = false;
        }
        return sobrepeso;
    }

    public int getId() {
        return internalID;
    }

    public void setId(int Id) {
        this.internalID = Id;
    }

    void pisoSeleccionado(int i) {
        pisosOp[i] = 1;
        System.out.println(pisosOp[i] + " Tiene " + i);
    }

    public int getPersonasSubiendo() {
        return personasSubiendo;
    }

    public int[] getPisosOp() {
        return pisosOp;
    }
}
