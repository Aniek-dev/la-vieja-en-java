
package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import modelo.Jugador;
import modelo.Ruta;
import modelo.Tablero;
import modelo.TipoImagen;


public class FormResultado extends javax.swing.JFrame {
    
    private Tablero tablero;
    private TipoImagen jugadorGanador;
    
  public FormResultado(TipoImagen jugadorGanador,Tablero tablero) {
        init();
        this.tablero = tablero;
        this.jugadorGanador = jugadorGanador;
        if(jugadorGanador==TipoImagen.EQUIS){
        imgIzquierda.setRuta(Ruta.JUGADOREQUIS);
        imgDerecha.setRuta(Ruta.EQUIS);
        lblNombre.setText(FormLaVieja.nombreJugadorEquis.getText());
        }
        else if (jugadorGanador==TipoImagen.CIRCULO){
        imgIzquierda.setRuta(Ruta.JUGADORCIRCULO);
        imgDerecha.setRuta (Ruta.CIRCULO);
        lblNombre.setText(FormLaVieja.nombreJugadorCirculo.getText());
        }
        else if(jugadorGanador==TipoImagen.EMPATE){
        imgIzquierda.setRuta(Ruta.JUGADOREQUIS);
        imgDerecha.setRuta(Ruta.JUGADORCIRCULO);
        lblNombre.setText("EMPATE");
        }
    }
private void init(){
    setUndecorated(true);
     initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,0));
        panelFondo.requestFocus();
        panelFondo.setOpaque(false);



}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imgIzquierda = new modelo.Imagen();
        imgDerecha = new modelo.Imagen();
        lblNombre = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(20, 45, 60));
        panelFondo.setPreferredSize(new java.awt.Dimension(416, 315));
        panelFondo.setLayout(null);

        lblCierre.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(240, 192, 255));
        lblCierre.setText("X");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);
            }
        });
        panelFondo.add(lblCierre);
        lblCierre.setBounds(390, 10, 30, 32);

        jLabel1.setFont(new java.awt.Font("Unispace", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 251, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MARCADOR");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(0, 40, 430, 50);

        imgIzquierda.setText("imagen1");
        imgIzquierda.setRuta("/resources/JugadorEquis.png");
        panelFondo.add(imgIzquierda);
        imgIzquierda.setBounds(80, 110, 46, 40);

        imgDerecha.setText("imagen1");
        imgDerecha.setRuta("/resources/Equis.png");
        panelFondo.add(imgDerecha);
        imgDerecha.setBounds(310, 110, 46, 40);

        lblNombre.setBackground(new java.awt.Color(241, 227, 252));
        lblNombre.setFont(new java.awt.Font("Unispace", 1, 20)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(241, 227, 252));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("NOMBRE");
        lblNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFondo.add(lblNombre);
        lblNombre.setBounds(-10, 100, 440, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
      dispose();
      tablero.reiniciarTablero(jugadorGanador);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED);
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(240,192,255));
    }//GEN-LAST:event_lblCierreMouseExited

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private modelo.Imagen imgDerecha;
    private modelo.Imagen imgIzquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
