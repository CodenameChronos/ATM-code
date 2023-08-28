package atm_2;

/**
 *
 * @author MINEDUCYT
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        Background = new javax.swing.JPanel();
        Log_In_Bg = new Clases.PanelRound();
        User = new javax.swing.JLabel();
        User_entry = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        Passwor_entry = new javax.swing.JPasswordField();
        Exit_button = new javax.swing.JButton();
        Log_button = new javax.swing.JButton();
        Forgot_password = new javax.swing.JButton();
        Icon = new javax.swing.JLabel();
        Dont_account = new javax.swing.JLabel();
        Crear_cuenta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.black);
        setForeground(new java.awt.Color(51, 51, 51));

        Background.setBackground(new java.awt.Color(0, 0, 153));
        Background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 51, 0), 3));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Log_In_Bg.setBackground(new java.awt.Color(153, 153, 0));
        Log_In_Bg.setRoundBottomLeft(50);
        Log_In_Bg.setRoundBottomRight(50);
        Log_In_Bg.setRoundTopLeft(50);
        Log_In_Bg.setRoundTopRight(50);

        User.setBackground(new java.awt.Color(0, 102, 255));
        User.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        User.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        User.setText("Usuario");

        User_entry.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                User_entryInputMethodTextChanged(evt);
            }
        });

        Password.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Password.setText("Contraseña");

        Passwor_entry.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Passwor_entryInputMethodTextChanged(evt);
            }
        });

        Exit_button.setText("Salir");
        Exit_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Exit_buttonMouseClicked(evt);
            }
        });

        Log_button.setText("Ingresar");
        Log_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Log_buttonMouseClicked(evt);
            }
        });

        Forgot_password.setBackground(new java.awt.Color(153, 153, 0));
        Forgot_password.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        Forgot_password.setForeground(new java.awt.Color(255, 255, 255));
        Forgot_password.setText("¿Olvidaste tu contraseña?");
        Forgot_password.setBorder(null);
        Forgot_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Forgot_passwordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Log_In_BgLayout = new javax.swing.GroupLayout(Log_In_Bg);
        Log_In_Bg.setLayout(Log_In_BgLayout);
        Log_In_BgLayout.setHorizontalGroup(
            Log_In_BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Log_In_BgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Log_In_BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Passwor_entry)
                    .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(User_entry)
                    .addComponent(User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
            .addGroup(Log_In_BgLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Log_In_BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Forgot_password)
                    .addGroup(Log_In_BgLayout.createSequentialGroup()
                        .addComponent(Exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Log_button, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        Log_In_BgLayout.setVerticalGroup(
            Log_In_BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Log_In_BgLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(User_entry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(Password)
                .addGap(18, 18, 18)
                .addComponent(Passwor_entry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(Log_In_BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Log_button)
                    .addComponent(Exit_button))
                .addGap(18, 18, 18)
                .addComponent(Forgot_password)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Background.add(Log_In_Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 230, 280));

        Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/bank-988164_640.png"))); // NOI18N
        Icon.setToolTipText("");
        Icon.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Background.add(Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 190, 130));

        Dont_account.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        Dont_account.setForeground(new java.awt.Color(255, 255, 255));
        Dont_account.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dont_account.setText("¿No tienes una cuenta?");
        Background.add(Dont_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 150, -1));

        Crear_cuenta.setBackground(new java.awt.Color(0, 0, 153));
        Crear_cuenta.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        Crear_cuenta.setForeground(new java.awt.Color(255, 255, 255));
        Crear_cuenta.setText("Crear cuenta");
        Crear_cuenta.setAlignmentY(0.0F);
        Crear_cuenta.setBorder(null);
        Crear_cuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Crear_cuentaMouseClicked(evt);
            }
        });
        Background.add(Crear_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Iniciar sesión");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void User_entryInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_User_entryInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_User_entryInputMethodTextChanged

    private void Passwor_entryInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Passwor_entryInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Passwor_entryInputMethodTextChanged

    private void Crear_cuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Crear_cuentaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Crear_cuentaMouseClicked

    private void Exit_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_buttonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Exit_buttonMouseClicked

    private void Log_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        String userEntryText = User_entry.getText();
        char[] passwordEntryText = Passwor_entry.getPassword();
        String password = new String(passwordEntryText);
//GEN-FIRST:event_Log_buttonMouseClicked
        if (userEntryText.equals("Rb") && password.equals("rb")) {
                ATM_2 callto = new ATM_2();
                dispose();
                callto.core();
                System.exit(0);
        }
    }//GEN-LAST:event_Log_buttonMouseClicked

    private void Forgot_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Forgot_passwordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Forgot_passwordMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton Crear_cuenta;
    private javax.swing.JLabel Dont_account;
    private javax.swing.JButton Exit_button;
    private javax.swing.JButton Forgot_password;
    private javax.swing.JLabel Icon;
    private Clases.PanelRound Log_In_Bg;
    private javax.swing.JButton Log_button;
    private javax.swing.JPasswordField Passwor_entry;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel User;
    private javax.swing.JTextField User_entry;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
