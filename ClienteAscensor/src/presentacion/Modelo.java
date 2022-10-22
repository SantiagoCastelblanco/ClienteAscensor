
package presentacion;

import javax.swing.JOptionPane;


public class Modelo {
    
    private AsOut ventana;
    private int Id;
    
    
    public void iniciar(){
        
        getVentana().setSize(800,800);
        getVentana().setVisible(true);
        mostrarMensajeID();
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
                int personasSubiendo = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas personas subiran?"));
                verificar=true;
            }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "!!Dato invalido!!");
            }
        }
    }
    
    
    
    public void actualizarPisolbl(){
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
        
}
