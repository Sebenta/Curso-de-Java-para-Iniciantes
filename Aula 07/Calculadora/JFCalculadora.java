
package classes;

/**
 *
 * @author code36u4r60
 */
public class JFCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form JFCalculadora
     */
    public JFCalculadora() {
        initComponents();
        pCalc.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCalc = new javax.swing.JPanel();
        lblRestDiv = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPowCb = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCbrt = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblSqrt = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblAbs = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        btnCalc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRestDiv.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Resto da Divisão por 2:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Elevado ao Cubo:");

        lblPowCb.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Raiz Cúbica:");

        lblCbrt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Raiz Quadrada:");

        lblSqrt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Valor Absoluto:");

        lblAbs.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout pCalcLayout = new javax.swing.GroupLayout(pCalc);
        pCalc.setLayout(pCalcLayout);
        pCalcLayout.setHorizontalGroup(
            pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCalcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAbs)
                    .addComponent(lblCbrt)
                    .addComponent(lblPowCb)
                    .addComponent(lblRestDiv)
                    .addComponent(lblSqrt))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        pCalcLayout.setVerticalGroup(
            pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCalcLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblRestDiv))
                .addGap(21, 21, 21)
                .addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblPowCb))
                .addGap(18, 18, 18)
                .addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSqrt)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCbrt)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblAbs))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calculadora.png"))); // NOI18N

        txtNum.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNum.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNum.setText("0");
        txtNum.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNumMouseClicked(evt);
            }
        });
        txtNum.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtNumInputMethodTextChanged(evt);
            }
        });
        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });
        txtNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumKeyPressed(evt);
            }
        });

        btnCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calc-botao.png"))); // NOI18N
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed

    }//GEN-LAST:event_txtNumActionPerformed

    private void txtNumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumMouseClicked
        txtNum.setText("");
    }//GEN-LAST:event_txtNumMouseClicked

    private void txtNumInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtNumInputMethodTextChanged

    }//GEN-LAST:event_txtNumInputMethodTextChanged
    
    private static boolean keyPressed = false;
    private void txtNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumKeyPressed
        if (!isKeyPressed()) {
            txtNum.setText("");
            setKeyPressed(true);
        }

    }//GEN-LAST:event_txtNumKeyPressed

    
    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        double inputNum = Double.parseDouble(txtNum.getText());
        
        double restDiv = inputNum % 2;
        lblRestDiv.setText(String.format("%.2f",restDiv));
        
        double pow = Math.pow(inputNum, 3);
        lblPowCb.setText(String.format("%.2f",pow));
        
        double sqrt = Math.sqrt(inputNum);
        lblSqrt.setText(String.format("%.2f",sqrt));
        
        double cbrt = Math.cbrt(inputNum);        
        lblCbrt.setText(String.format("%.2f",cbrt));
        
        double abs = Math.abs(inputNum);
        lblAbs.setText(Double.toString(abs));
        
        pCalc.setVisible(true);

    }//GEN-LAST:event_btnCalcActionPerformed

    
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
            java.util.logging.Logger.getLogger(JFCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCalculadora().setVisible(true);              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblAbs;
    private javax.swing.JLabel lblCbrt;
    private javax.swing.JLabel lblPowCb;
    private javax.swing.JLabel lblRestDiv;
    private javax.swing.JLabel lblSqrt;
    private javax.swing.JPanel pCalc;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables

}
