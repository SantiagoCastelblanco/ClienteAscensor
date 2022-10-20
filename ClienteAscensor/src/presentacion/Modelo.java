
package presentacion;


public class Modelo {
    
    private MensajeID ventana;
    
    
    public void iniciar(){
        
        getVentana().setSize(800,800);
        getVentana().setVisible(true);
    }
    
        public MensajeID getVentana(){
        if(ventana==null){
            ventana = new MensajeID(this);
        }
        return ventana;
    }
}
