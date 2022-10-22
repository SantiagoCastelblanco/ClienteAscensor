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
    
    /*public Controlador(AsIn aThis) {
        ventana2 = aThis;
        modelo = ventana2.getModelo2();
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton;
        if (e.getSource() instanceof JButton) {
            boton=(JButton)e.getSource();
            if (boton.equals(ventana.getBtnUp())) {
                ventana.getBtnUp().setBackground(Color.ORANGE);
                modelo.mostrarMensaje();
                modelo.iniciar2();
            }
            if(boton.equals(ventana.getBtnDown())){
                //ventana.getBtnDown().setBackground(Color.ORANGE);
            }
        }
    }
    

    
}
