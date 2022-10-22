
package presentacion;

import javax.swing.JButton;

public class AsIn extends javax.swing.JFrame {
    
    private final Modelo modelo;
    private Controlador control;


    public AsIn(Modelo aThis) {
        modelo = aThis;
        initComponents();
        this.setLocationRelativeTo(null);
        crearBotonesNumericos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BotonBajar = new javax.swing.JButton();
        BotonSubir = new javax.swing.JButton();
        panelBotones = new javax.swing.JPanel();
        estado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/Imagenes/Ascensor.jpg"))); // NOI18N

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );

        estado.setBackground(new java.awt.Color(0, 0, 0));
        estado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        estado.setForeground(new java.awt.Color(102, 255, 255));
        estado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        estado.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 333, Short.MAX_VALUE)
                    .addComponent(BotonBajar)
                    .addGap(0, 332, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 333, Short.MAX_VALUE)
                    .addComponent(BotonSubir)
                    .addGap(0, 332, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 348, Short.MAX_VALUE)
                    .addComponent(BotonBajar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 348, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 348, Short.MAX_VALUE)
                    .addComponent(BotonSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 348, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBajar;
    private javax.swing.JButton BotonSubir;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelBotones;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JButton btnNumeros[];
    
    private void crearBotonesNumericos() {
        btnNumeros = new JButton[10];
        int x = 20;
        int y = 5;
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

                ubicacionArreglo--;
            }
            x = 20;
            y += dimension + 2;
        }
    }
    
}
