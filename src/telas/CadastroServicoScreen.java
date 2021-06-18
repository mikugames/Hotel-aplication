package telas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author levinsousa
 */
public class CadastroServicoScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     */
    public CadastroServicoScreen() {
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

        nivelDeUsuario = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        buttonLogar = new javax.swing.JButton();
        Nome = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        inputNome = new javax.swing.JTextField();
        CPF = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        inputUsuario = new javax.swing.JTextField();
        Telefone = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        inputTelefone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 47, 216));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 235, 219));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(251, 251, 251));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(63, 45, 21));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Serviço");
        jPanel2.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        buttonLogar.setBackground(new java.awt.Color(115, 103, 87));
        buttonLogar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        buttonLogar.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogar.setText("Cadastrar");
        buttonLogar.setBorder(null);
        buttonLogar.setBorderPainted(false);
        buttonLogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 97, 35));

        Nome.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Nome.setForeground(new java.awt.Color(63, 45, 21));
        Nome.setText("Serviço");
        jPanel2.add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 230, 10));

        inputNome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        inputNome.setBorder(null);
        jPanel2.add(inputNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 229, -1));

        CPF.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        CPF.setForeground(new java.awt.Color(63, 45, 21));
        CPF.setText("Descrição");
        jPanel2.add(CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        Usuario.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Usuario.setForeground(new java.awt.Color(63, 45, 21));
        Usuario.setText("Proficional");
        jPanel2.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 230, 10));

        inputUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        inputUsuario.setBorder(null);
        jPanel2.add(inputUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 229, -1));

        Telefone.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Telefone.setForeground(new java.awt.Color(63, 45, 21));
        Telefone.setText("Preço");
        jPanel2.add(Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 230, 10));

        inputTelefone.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        inputTelefone.setBorder(null);
        jPanel2.add(inputTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 229, -1));

        jScrollPane1.setViewportView(jTextPane1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 230, 80));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/voltarIcon.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 400, 510));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ImagemHotel.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 268, 781, 311));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 781, 579));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLogarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HomeScreen tela = new HomeScreen();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroServicoScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Telefone;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel background;
    private javax.swing.JButton buttonLogar;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputTelefone;
    private javax.swing.JTextField inputUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.ButtonGroup nivelDeUsuario;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}