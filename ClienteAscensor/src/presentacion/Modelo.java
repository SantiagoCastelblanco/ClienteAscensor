
package presentacion;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Modelo {
    static boolean sobrepeso; 
    private AsOut ventana;
    private int Id;
    private int pisosOp[];
    int personasSubiendo;
    
    public void iniciar(){
        
        getVentana().setSize(800,800);
        getVentana().setVisible(true);
        mostrarMensajeID();
        pisosOp = new int[10];
    }
     
    public AsOut getVentana(){
        if(ventana==null){
            ventana = new AsOut(this);
        }
        return ventana;
    }
    
    
    void mostrarMensajeID() {
        boolean verificar = false;
        while(verificar==false){
            try {
                Id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la ID del cliente(ID NUMERICA)"));
                verificar = true;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "!!ID no valida!!");
            }
        }
        
    }
    
    void mostrarMensaje() {
        boolean verificar = false;
        while(verificar==false){
             try{
                personasSubiendo = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas personas subiran?"));
                verificar=true;
            }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "!!Dato invalido!!");
            }
        }
    }

    

    
    public void actualizarPisolbl(){
        
    }
    boolean  sobrepeso(int personasSub){
        personasSubiendo = personasSub;
        if (personasSub > 10){
            sobrepeso = true;
        }if(personasSub <= 10){
            sobrepeso = false;
        }return sobrepeso;
    }
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    void pisoSeleccionado(int i) {
        pisosOp[i]= 1;
        System.out.println(pisosOp[i]+" Tiene "+ i);
    }

    public int getPersonasSubiendo() {
        return personasSubiendo;
    }

    public int[] getPisosOp() {
        return pisosOp;
    }
    

        
}
