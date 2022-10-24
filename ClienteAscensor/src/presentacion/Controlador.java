package presentacion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Controlador implements ActionListener {

    private final Ventana ventana;
    private final Modelo modelo;
    private boolean var;

    public Controlador(Ventana aThis) {
        ventana = aThis;
        modelo = ventana.getModelo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton;
        if (e.getSource() instanceof JButton) {
            boton = (JButton) e.getSource();
            if (boton.equals(ventana.getBtnUp())) {
                ventana.getBtnUp().setBackground(Color.ORANGE);
                modelo.mostrarMensaje();
                ventana.mostrarIn();
            }
            if (boton.equals(ventana.getBtnDown())) {
                ventana.getBtnDown().setBackground(Color.ORANGE);
                modelo.mostrarMensaje();
                ventana.mostrarIn();
            }
            if (boton.equals(ventana.getBotnCerrado())) {
                ventana.getBotnCerrado().setBackground(Color.ORANGE);

            }
            var = modelo.sobrepeso(modelo.personasSubiendo);
            if (var = true) {
                ventana.getSobreOn().setBackground(Color.red);

            }
            if (var = false) {
                ventana.getSobreOff().setBackground(Color.ORANGE);
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
