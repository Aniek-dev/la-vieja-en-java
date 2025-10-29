
package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import modelo.Jugador;
import modelo.TipoImagen;


public class FormInicio extends javax.swing.JFrame {
    
  public FormInicio() {
        init();
    }
private void init(){
    setUndecorated(true);
     initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,0));
        panelFondo.requestFocus();
        panelFondo.setOpaque(false);
Border bordeBoton = BorderFactory.createLineBorder (new Color(100,255,100),2);
PanelBoton.setBorder(bordeBoton);


}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtJugador2 = new javax.swing.JTextField();
        txtJugador1 = new javax.swing.JTextField();
        PanelBoton = new javax.swing.JPanel();
        lblIniciar = new javax.swing.JLabel();
        imagen1 = new modelo.Imagen();
        imagen2 = new modelo.Imagen();
        imagen3 = new modelo.Imagen();
        imagen4 = new modelo.Imagen();

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
        panelFondo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                panelFondoFocusGained(evt);
            }
        });
        panelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelFondoMousePressed(evt);
            }
        });
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

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 251, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LA VIEJA ");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(10, 27, 430, 60);

        txtJugador2.setBackground(new java.awt.Color(210, 170, 240));
        txtJugador2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 28)); // NOI18N
        txtJugador2.setForeground(new java.awt.Color(137, 20, 240));
        txtJugador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador2.setText("JUGADOR2");
        txtJugador2.setBorder(null);
        txtJugador2.setVerifyInputWhenFocusTarget(false);
        txtJugador2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador2FocusLost(evt);
            }
        });
        txtJugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador2MouseExited(evt);
            }
        });
        txtJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJugador2ActionPerformed(evt);
            }
        });
        txtJugador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador2KeyTyped(evt);
            }
        });
        panelFondo.add(txtJugador2);
        txtJugador2.setBounds(100, 160, 230, 40);

        txtJugador1.setBackground(new java.awt.Color(137, 207, 240));
        txtJugador1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 28)); // NOI18N
        txtJugador1.setForeground(new java.awt.Color(0, 102, 255));
        txtJugador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador1.setText("JUGADOR1");
        txtJugador1.setBorder(null);
        txtJugador1.setVerifyInputWhenFocusTarget(false);
        txtJugador1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador1FocusLost(evt);
            }
        });
        txtJugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador1MouseExited(evt);
            }
        });
        txtJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJugador1ActionPerformed(evt);
            }
        });
        txtJugador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador1KeyTyped(evt);
            }
        });
        panelFondo.add(txtJugador1);
        txtJugador1.setBounds(100, 100, 230, 40);

        PanelBoton.setBackground(new java.awt.Color(72, 61, 139));
        PanelBoton.setToolTipText("");

        lblIniciar.setBackground(new java.awt.Color(241, 227, 252));
        lblIniciar.setFont(new java.awt.Font("Unispace", 1, 20)); // NOI18N
        lblIniciar.setForeground(new java.awt.Color(241, 227, 252));
        lblIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciar.setText("INICIAR");
        lblIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIniciarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIniciarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonLayout = new javax.swing.GroupLayout(PanelBoton);
        PanelBoton.setLayout(PanelBotonLayout);
        PanelBotonLayout.setHorizontalGroup(
            PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBotonLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(lblIniciar)
                .addGap(37, 37, 37))
        );
        PanelBotonLayout.setVerticalGroup(
            PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBotonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(PanelBoton);
        PanelBoton.setBounds(130, 230, 160, 50);

        imagen1.setText("imagen1");
        imagen1.setRuta("/resources/Circulo.png");
        panelFondo.add(imagen1);
        imagen1.setBounds(350, 160, 46, 40);

        imagen2.setText("imagen1");
        imagen2.setRuta("/resources/JugadorEquis.png");
        panelFondo.add(imagen2);
        imagen2.setBounds(30, 100, 46, 40);

        imagen3.setText("imagen1");
        imagen3.setRuta("/resources/JugadorCirculo.png");
        panelFondo.add(imagen3);
        imagen3.setBounds(30, 160, 46, 40);

        imagen4.setText("imagen1");
        imagen4.setRuta("/resources/Equis.png");
        panelFondo.add(imagen4);
        imagen4.setBounds(350, 100, 46, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
       System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED);
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(240,192,255));
    }//GEN-LAST:event_lblCierreMouseExited

    private void txtJugador1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador1MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
        txtJugador1.setBorder(borde);
    }//GEN-LAST:event_txtJugador1MouseEntered

    private void txtJugador1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador1MouseExited
        txtJugador1.setBorder(null);
    }//GEN-LAST:event_txtJugador1MouseExited

    private void txtJugador2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador2MouseEntered
     Border borde = BorderFactory.createLineBorder(new Color(165,40,174),2);
     txtJugador2.setBorder(borde);
    }//GEN-LAST:event_txtJugador2MouseEntered

    private void txtJugador2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador2MouseExited
       txtJugador2.setBorder(null);
    }//GEN-LAST:event_txtJugador2MouseExited

    private void panelFondoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelFondoFocusGained
       
    }//GEN-LAST:event_panelFondoFocusGained

    private void txtJugador2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador2FocusGained
if(txtJugador2.getText().equals("JUGADOR2"))
           txtJugador2.setText("");    }//GEN-LAST:event_txtJugador2FocusGained

    private void txtJugador1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador1FocusGained
     if(txtJugador1.getText().equals("JUGADOR1"))
           txtJugador1.setText("");
    }//GEN-LAST:event_txtJugador1FocusGained

    private void txtJugador1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador1FocusLost
      if(txtJugador1.getText().equals(""))
           txtJugador1.setText("JUGADOR1");
    }//GEN-LAST:event_txtJugador1FocusLost

    private void txtJugador2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador2FocusLost
 if(txtJugador2.getText().equals(""))
           txtJugador2.setText("JUGADOR2");    }//GEN-LAST:event_txtJugador2FocusLost

    private void panelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMousePressed
        panelFondo.requestFocus();
    }//GEN-LAST:event_panelFondoMousePressed

    private void txtJugador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador1KeyTyped
        char caracter = Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(caracter);
        if(txtJugador1.getText().length() >=8)
            evt.consume();
    }//GEN-LAST:event_txtJugador1KeyTyped

    private void txtJugador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador2KeyTyped
         char caracter = Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(caracter);
        if(txtJugador2.getText().length() >=8)
            evt.consume();
    }//GEN-LAST:event_txtJugador2KeyTyped

    private void lblIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMouseEntered
       PanelBoton.setBackground(new Color(126,49,196));
    }//GEN-LAST:event_lblIniciarMouseEntered

    private void lblIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMouseExited
        PanelBoton.setBackground(new Color(42,22,79));
    }//GEN-LAST:event_lblIniciarMouseExited

    private void lblIniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMousePressed
        this.dispose();
        
        Jugador jugador1 = new Jugador(TipoImagen.EQUIS);
        if (txtJugador1.getText().equals(""))
            jugador1.setNombre("JUGADOR1");
        else
            jugador1.setNombre(txtJugador1.getText());
        
        
        Jugador jugador2 = new Jugador(TipoImagen.CIRCULO);
         if (txtJugador2.getText().equals(""))
            jugador2.setNombre("JUGADOR2");
         else
            jugador2.setNombre(txtJugador2.getText());
        
        
        
        FormLaVieja LaVieja = new FormLaVieja(jugador1,jugador2);
        LaVieja.setVisible(true);
    }//GEN-LAST:event_lblIniciarMousePressed

    private void txtJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJugador2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJugador2ActionPerformed

    private void txtJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJugador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJugador1ActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBoton;
    private modelo.Imagen imagen1;
    private modelo.Imagen imagen2;
    private modelo.Imagen imagen3;
    private modelo.Imagen imagen4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblIniciar;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField txtJugador1;
    private javax.swing.JTextField txtJugador2;
    // End of variables declaration//GEN-END:variables
}
