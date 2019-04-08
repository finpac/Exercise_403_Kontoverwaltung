/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Patrick
 */
public class AccountGUI extends javax.swing.JFrame {

    /**
     * Creates new form AccountGUI
     */
    
    Account acc;
    public AccountGUI() {
        initComponents();
        acc = new Account();
//        jList1.setModel(acc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmAddUser = new javax.swing.JPopupMenu();
        miaddUser = new javax.swing.JMenuItem();
        miperformAccTest = new javax.swing.JMenuItem();
        pmAccount = new javax.swing.JPopupMenu();
        micreateAcc = new javax.swing.JMenuItem();
        lbMoney = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        miaddUser.setText("add user");
        miaddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miaddUserActionPerformed(evt);
            }
        });
        pmAddUser.add(miaddUser);

        miperformAccTest.setText("perform account test");
        pmAddUser.add(miperformAccTest);

        micreateAcc.setText("create new account");
        pmAccount.add(micreateAcc);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kontoverwaltung");
        setPreferredSize(new java.awt.Dimension(450, 350));

        lbMoney.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbMoney.setText("0,00 Euro");
        lbMoney.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbMoney.setBorder(javax.swing.BorderFactory.createTitledBorder("Account"));
        lbMoney.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lbMoney.setMaximumSize(new java.awt.Dimension(46, 50));
        lbMoney.setMinimumSize(new java.awt.Dimension(46, 50));
        lbMoney.setPreferredSize(new java.awt.Dimension(46, 50));
        getContentPane().add(lbMoney, java.awt.BorderLayout.SOUTH);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(110, 130));

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder("User"));
        jList1.setModel(new Account());
        jList1.setComponentPopupMenu(pmAddUser);
        jList1.setMaximumSize(new java.awt.Dimension(110, 120));
        jList1.setMinimumSize(new java.awt.Dimension(80, 103));
        jList1.setPreferredSize(new java.awt.Dimension(40, 103));
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.LINE_START);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder("Log-output"));
        jTextArea1.setComponentPopupMenu(pmAccount);
        jTextArea1.setMaximumSize(new java.awt.Dimension(1700, 2147483647));
        jTextArea1.setMinimumSize(new java.awt.Dimension(500, 43));
        jTextArea1.setPreferredSize(new java.awt.Dimension(1000, 115));
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miaddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miaddUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miaddUserActionPerformed

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
            java.util.logging.Logger.getLogger(AccountGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbMoney;
    private javax.swing.JMenuItem miaddUser;
    private javax.swing.JMenuItem micreateAcc;
    private javax.swing.JMenuItem miperformAccTest;
    private javax.swing.JPopupMenu pmAccount;
    private javax.swing.JPopupMenu pmAddUser;
    // End of variables declaration//GEN-END:variables
}
