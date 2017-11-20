/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libapp;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JPanel;

/**
 *
 * @author Michał
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    public GUI() {
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

        oknko_zmiennych = new javax.swing.JPanel();
        rysuj = new javax.swing.JButton();
        czysc = new javax.swing.JButton();
        a = new javax.swing.JLabel();
        k = new javax.swing.JLabel();
        theta0 = new javax.swing.JLabel();
        txtINa = new javax.swing.JTextField();
        txtINk = new javax.swing.JTextField();
        txtINtheta0 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        drawPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Program rysujący krzywą róży");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        oknko_zmiennych.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));

        rysuj.setText("Rysuj");
        rysuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rysujActionPerformed(evt);
            }
        });

        czysc.setLabel("Czyść");
        czysc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                czyscActionPerformed(evt);
            }
        });

        a.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a.setText("a");

        k.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        k.setText("k");

        theta0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        theta0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        theta0.setText("<html>\nΘ\n<sub>\n0\n</sub>\n</html>");

        txtINa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtINa.setText("1");
        txtINa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtINaActionPerformed(evt);
            }
        });

        txtINk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtINk.setText("1");
        txtINk.setToolTipText("");

        txtINtheta0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtINtheta0.setText("0");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Proszę podać:");

        javax.swing.GroupLayout oknko_zmiennychLayout = new javax.swing.GroupLayout(oknko_zmiennych);
        oknko_zmiennych.setLayout(oknko_zmiennychLayout);
        oknko_zmiennychLayout.setHorizontalGroup(
            oknko_zmiennychLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oknko_zmiennychLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(oknko_zmiennychLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(oknko_zmiennychLayout.createSequentialGroup()
                        .addComponent(rysuj, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(czysc, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                    .addGroup(oknko_zmiennychLayout.createSequentialGroup()
                        .addGroup(oknko_zmiennychLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(k, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(theta0, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(oknko_zmiennychLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtINa)
                            .addComponent(txtINk)
                            .addComponent(txtINtheta0)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        oknko_zmiennychLayout.setVerticalGroup(
            oknko_zmiennychLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oknko_zmiennychLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(oknko_zmiennychLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a)
                    .addComponent(txtINa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(oknko_zmiennychLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(k)
                    .addComponent(txtINk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(oknko_zmiennychLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(theta0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtINtheta0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addGroup(oknko_zmiennychLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rysuj)
                    .addComponent(czysc))
                .addContainerGap())
        );

        drawPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));

        javax.swing.GroupLayout drawPanelLayout = new javax.swing.GroupLayout(drawPanel);
        drawPanel.setLayout(drawPanelLayout);
        drawPanelLayout.setHorizontalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );
        drawPanelLayout.setVerticalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oknko_zmiennych, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(drawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(drawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oknko_zmiennych, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rysujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rysujActionPerformed

        try {
            Dane.rose_long = Double.parseDouble(txtINa.getText());
            Dane.rose_count = Integer.parseInt(txtINk.getText());

            double a = Double.parseDouble(txtINk.getText());
            int b = Integer.parseInt(txtINk.getText());
            Dane.rose_move = Double.parseDouble(txtINtheta0.getText());
            if (Dane.rose_long == 0) {
                drawPanel.removeAll();
                drawPanel.updateUI();
                throw new NumberFormatException();
            } else if ((Dane.rose_count <= 0)) {
                throw new NumberFormatException();
            } else {
                drawPanel.removeAll();
                drawPanel.setLayout(new BorderLayout());
                JPanel dp = DrawingPanel.createWoPanel();
                drawPanel.add(dp, BorderLayout.CENTER);
                drawPanel.validate();
                JOptionPane.showMessageDialog(null, "Wymagania Spełnione", "", INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException e) {
            drawPanel.removeAll();
            drawPanel.updateUI();
            JOptionPane.showMessageDialog(null, "Proszę wprowadzić 'a' różne od zera i 'k' calkowite!", "Błędne Dane!!", INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_rysujActionPerformed

    private void czyscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_czyscActionPerformed
        drawPanel.removeAll();
        drawPanel.updateUI();

        txtINa.setText("");
        txtINk.setText("");
        txtINtheta0.setText("");
    }//GEN-LAST:event_czyscActionPerformed

    private void txtINaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtINaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtINaActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }

            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JButton czysc;
    private javax.swing.JPanel drawPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel k;
    private javax.swing.JPanel oknko_zmiennych;
    private javax.swing.JButton rysuj;
    private javax.swing.JLabel theta0;
    private javax.swing.JTextField txtINa;
    private javax.swing.JTextField txtINk;
    private javax.swing.JTextField txtINtheta0;
    // End of variables declaration//GEN-END:variables
}
