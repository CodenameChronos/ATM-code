/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm_2;

/**
 *
 * @author MINEDUCYT
 */
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background_panel = new javax.swing.JPanel();
        Create_account = new javax.swing.JButton();
        Data = new Clases.PanelRound();
        Log_In = new javax.swing.JLabel();
        Profile_icon = new javax.swing.JLabel();
        User_field = new javax.swing.JTextField();
        Password_field = new javax.swing.JPasswordField();
        User = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Button_bg = new Clases.PanelRound();
        Log_button = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Create_account.setBackground(new java.awt.Color(0, 0, 0, 100));
        Create_account.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Create_account.setForeground(new java.awt.Color(242, 242, 242));
        Create_account.setText("Crear cuenta");
        Create_account.setBorder(null);
        Create_account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Create_accountMouseClicked(evt);
            }
        });
        Create_account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_accountActionPerformed(evt);
            }
        });
        Background_panel.add(Create_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 120, -1));

        Data.setBackground(new java.awt.Color(0, 0, 0, 98));
        Data.setRoundBottomLeft(25);
        Data.setRoundBottomRight(25);
        Data.setRoundTopLeft(25);
        Data.setRoundTopRight(25);

        Log_In.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Log_In.setForeground(new java.awt.Color(0, 255, 255));
        Log_In.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Log_In.setText(" Inicio de sesión");

        Profile_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Profile_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/profile-2398782_640 (1).png"))); // NOI18N

        User_field.setBackground(new java.awt.Color(204, 204, 204));
        User_field.setBorder(null);

        Password_field.setBackground(new java.awt.Color(204, 204, 204));
        Password_field.setBorder(null);

        User.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        User.setForeground(new java.awt.Color(0, 255, 255));
        User.setText("Usuario");

        Password.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Password.setForeground(new java.awt.Color(0, 255, 255));
        Password.setText("Contraseña");

        Button_bg.setBackground(new java.awt.Color(153, 153, 153));
        Button_bg.setRoundBottomLeft(30);
        Button_bg.setRoundBottomRight(30);
        Button_bg.setRoundTopLeft(30);
        Button_bg.setRoundTopRight(30);

        Log_button.setBackground(new java.awt.Color(153, 153, 153));
        Log_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Log_button.setText("Ingresar");
        Log_button.setBorder(null);
        Log_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Log_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Button_bgLayout = new javax.swing.GroupLayout(Button_bg);
        Button_bg.setLayout(Button_bgLayout);
        Button_bgLayout.setHorizontalGroup(
            Button_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button_bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Log_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Button_bgLayout.setVerticalGroup(
            Button_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Log_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout DataLayout = new javax.swing.GroupLayout(Data);
        Data.setLayout(DataLayout);
        DataLayout.setHorizontalGroup(
            DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataLayout.createSequentialGroup()
                .addGroup(DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Log_In, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(Profile_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(DataLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(User_field, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(Password_field)
                            .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password)
                            .addComponent(Button_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        DataLayout.setVerticalGroup(
            DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Log_In)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Profile_icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(User)
                .addGap(12, 12, 12)
                .addComponent(User_field, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(Button_bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        Background_panel.add(Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 240, 320));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background-2402703_640.jpg"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(1000, 1000));
        Background.setMinimumSize(new java.awt.Dimension(0, 0));
        Background_panel.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Log_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Log_buttonMouseClicked
        String userEntryText = User_field.getText();
        char[] passwordEntryText = Password_field.getPassword();
        String password = new String(passwordEntryText);
                                        
        if (verificarCredenciales(userEntryText, password)) {
                String nombreDeUsuario = user(userEntryText);
                ATM_2 callto = new ATM_2();
                dispose();
                callto.core(this, nombreDeUsuario);
        } else{
            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña inválido(s)");
        }
    }//GEN-LAST:event_Log_buttonMouseClicked

    private void Create_accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Create_accountMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Create_accountMouseClicked

    private void Create_accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_accountActionPerformed
        New_account summon = new New_account();
        this.setVisible(false);
        summon.setVisible(true);
    }//GEN-LAST:event_Create_accountActionPerformed
 private boolean verificarCredenciales(String usuario, String contraseña) {
        String csvFile = "Data.csv"; // Reemplaza con la ruta de tu archivo CSV

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 2) {
                    String usuarioEnCSV = parts[0];
                    String contraseñaEnCSV = parts[1];
                    if (usuarioEnCSV.equals(usuario) && contraseñaEnCSV.equals(contraseña)) {
                        return true; // Credenciales válidas encontradas en el archivo CSV
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false; // No se encontraron credenciales válidas en el archivo CSV
    }
 private String user(String usuario) {
    String csvFile = "Data.csv"; // Reemplaza con la ruta de tu archivo CSV

    try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(";");
            if (parts.length == 2) {
                String usuarioEnCSV = parts[0];
                String nombreEnCSV = parts[1];
                if (usuarioEnCSV.equals(usuario)) {
                    return nombreEnCSV; // Devuelve el nombre de usuario correspondiente
                }
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    return null; // Devuelve null si no se encontró el nombre de usuario
}

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
    private javax.swing.JLabel Background;
    private javax.swing.JPanel Background_panel;
    private Clases.PanelRound Button_bg;
    private javax.swing.JButton Create_account;
    private Clases.PanelRound Data;
    private javax.swing.JLabel Log_In;
    private javax.swing.JButton Log_button;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField Password_field;
    private javax.swing.JLabel Profile_icon;
    private javax.swing.JLabel User;
    private javax.swing.JTextField User_field;
    // End of variables declaration//GEN-END:variables
}
