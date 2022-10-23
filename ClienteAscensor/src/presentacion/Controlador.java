package presentacion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Controlador implements ActionListener {
    
    private final AsOut ventana;
    private final Modelo modelo;


    public Controlador(AsOut aThis) {
        ventana = aThis;
        modelo = ventana.getModelo();
    }
    
    
 

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton;
        if (e.getSource() instanceof JButton) {
            boton=(JButton)e.getSource();
            if (boton.equals(ventana.getBtnUp())) {
                ventana.getBtnUp().setBackground(Color.ORANGE);
                modelo.mostrarMensaje();
                ventana.mostrarIn();
            }
            if(boton.equals(ventana.getBtnDown())){
                ventana.getBtnDown().setBackground(Color.ORANGE);
                modelo.mostrarMensaje();
                ventana.mostrarIn();
            }if (boton.equals(ventana.getBotnCerrado())){
                ventana.getBotnCerrado().setBackground(Color.ORANGE);
                ventana.getBtnNumeros().setBackground(Color.BITMASK);

            }
            
            for (int i = 0; i < 10; i++) {
                if (boton.equals(ventana.getBtnNumeros()[i])) {
                    ventana.getBtnNumeros()[i].setBackground(Color.ORANGE);
                    modelo.pisoSeleccionado(i);
                    
                }
            }
        }
    }
    

    
}
