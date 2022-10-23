
package presentacion;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class AsOut extends javax.swing.JFrame {

    private final Modelo modelo;
    private Controlador control;
    
    
    AsOut(Modelo aThis) {
        modelo=aThis;
        initComponents();
        this.setLocationRelativeTo(null);
        SetImageButton(btnUp, "src\\presentacion\\Imagenes\\up.png");
        SetImageButton(btnDown, "src\\presentacion\\Imagenes\\down.png");
        mostrarOut();
        asignarEventos();
        crearBotonesNumericos();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelOut = new javax.swing.JPanel();
        pisoActual = new javax.swing.JLabel();
        btnDown = new javax.swing.JButton();
        btnUp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanelin = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        estado = new javax.swing.JLabel();
        BotnCerrado = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CLIENTE");

        pisoActual.setBackground(new java.awt.Color(0, 0, 0));
        pisoActual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pisoActual.setForeground(new java.awt.Color(102, 255, 255));
        pisoActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pisoActual.setOpaque(true);

        btnDown.setMaximumSize(new java.awt.Dimension(25, 25));
        btnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownActionPerformed(evt);
            }
        });

        btnUp.setMaximumSize(new java.awt.Dimension(25, 25));
        btnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Imagenes/Ascensor.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanelOutLayout = new javax.swing.GroupLayout(jPanelOut);
        jPanelOut.setLayout(jPanelOutLayout);
        jPanelOutLayout.setHorizontalGroup(
            jPanelOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOutLayout.createSequentialGroup()
                .addGroup(jPanelOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOutLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelOutLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(pisoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelOutLayout.setVerticalGroup(
            jPanelOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOutLayout.createSequentialGroup()
                .addGroup(jPanelOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOutLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelOutLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pisoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Imagenes/Ascensor.jpg"))); // NOI18N

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        estado.setBackground(new java.awt.Color(0, 0, 0));
        estado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estado.setForeground(new java.awt.Color(102, 255, 255));
        estado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        estado.setOpaque(true);

        BotnCerrado.setText("Cerrar");

        jButton1.setText("Sobrepeso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelinLayout = new javax.swing.GroupLayout(jPanelin);
        jPanelin.setLayout(jPanelinLayout);
        jPanelinLayout.setHorizontalGroup(
            jPanelinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(jPanelinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelinLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelinLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(BotnCerrado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelinLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanelinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanelinLayout.setVerticalGroup(
            jPanelinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelinLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelinLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotnCerrado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelinLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanelin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDownActionPerformed

    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotnCerrado;
    private javax.swing.JButton btnDown;
    private javax.swing.JButton btnUp;
    private javax.swing.JLabel estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelOut;
    private javax.swing.JPanel jPanelin;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JLabel pisoActual;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JButton btnNumeros[];
    
    
    private void SetImageButton(JButton name, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(name.getWidth(), name.getHeight(), Image.SCALE_DEFAULT));
        name.setIcon(icon);
        this.repaint();
    }
    
    private void crearBotonesNumericos() {
        btnNumeros = new JButton[10];
        int x = 20;
        int y = 15;
        int dimension = 60;
        int ubicacionArreglo = 9;

        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {

                btnNumeros[ubicacionArreglo] = new JButton();
                panelBotones.add(btnNumeros[ubicacionArreglo]);
                btnNumeros[ubicacionArreglo].setFont(new java.awt.Font("Consolas", 1, 21)); // NOI18N
                if (ubicacionArreglo > 3 - 1) {
                    btnNumeros[ubicacionArreglo].setText(String.valueOf(ubicacionArreglo - 3 + 1));
                } else {
                    btnNumeros[ubicacionArreglo].setText("S" + (3 - ubicacionArreglo));
                }

                btnNumeros[ubicacionArreglo].setBounds(x, y, dimension, dimension);
                x += dimension + 20;
                asignarEventoBtnPisos(btnNumeros[ubicacionArreglo]);
                ubicacionArreglo--;
            }
            x = 20;
            y += dimension + 2;
        }
    }
    
    public void mostrarOut(){
        jPanelOut.setVisible(true);
        jPanelin.setVisible(false);
    }
    
    public void mostrarIn(){
        jPanelOut.setVisible(false);
        jPanelin.setVisible(true);
    }
    
    private void asignarEventos(){
        btnUp.addActionListener(getControl());
        btnDown.addActionListener(getControl());
    }
    
    private void asignarEventoBtnPisos(JButton btnNumero) {
        btnNumero.addActionListener(getControl());
    }
    
    public JButton[] getBtnNumeros() {
        return btnNumeros;
    }
    
    public Controlador getControl() {
        if (control == null) {
            control = new Controlador(this);
        }
        return control;
    }
    

    public JButton getBtnDown() {
        return btnDown;
    }

    public JButton getBtnUp() {
        return btnUp;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public JButton getBotnCerrado() {
        return BotnCerrado;
    }
    
    

    

}
