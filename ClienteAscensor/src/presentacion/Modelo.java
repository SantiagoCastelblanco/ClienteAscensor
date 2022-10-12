
package presentacion;


public class Modelo {
    
    private Vista ventana;
    
    
    public void iniciar(){
        
        getVentana().setSize(800,800);
        getVentana().setVisible(true);
    }
    
    public Vista getVentana(){
        if(ventana==null){
            ventana = new Vista(this);
        }
        return ventana;
    }
}
