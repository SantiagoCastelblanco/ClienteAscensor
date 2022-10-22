package presentacion;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Controlador {
    
    private final AsOut ventana;
    private final Modelo modelo;

    public Controlador(AsOut aThis) {
        ventana = aThis;
        modelo = ventana.getModelo();
    }
    
    @Override
    public void actionPerfomed(ActionEvent e){
        JButton boton;
        if (e.getSource() instanceof JButton) {
            
        }
    }
    
}
