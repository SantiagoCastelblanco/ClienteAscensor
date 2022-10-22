
package presentacion;

import javax.swing.JOptionPane;


public class Modelo {
    
    private AsOut ventana;
    
    
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
        //do{
        try{
        int Id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la ID del cliente(ID NUMERICA)"));
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "!!ID no valida!!");
            
        }
        //}while();
    }
    
    void mostrarMensajeUP() {
        //do{
        try{
        int personasSubiendo = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas personas subiran?"));
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "!!Dato invalido!!");
            
        }
        //}while();
    }
        
}
