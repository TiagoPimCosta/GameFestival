/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import com.sun.glass.events.KeyEvent;
import static java.awt.event.KeyEvent.VK_NUMPAD0;
import javax.swing.JOptionPane;
import Backend.ListaPatrocinio;
import Backend.Patrocinio;



/**
 *
 * @author Helder Freitas
 */
public class AdPatrocionador extends javax.swing.JFrame {
    ListaPatrocinio lista;
    /**
     * Creates new form AdPatrocionador
     */
    public AdPatrocionador(ListaPatrocinio x) {
        this.lista=x;
        initComponents();
        setTitle("Adicionar Patrocionador");
        setSize(390,155);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public void limpar(){
        txtNomeP.setText("");
        txtContribuicaoP.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gravarP = new javax.swing.JButton();
        lNomeP = new javax.swing.JLabel();
        txtNomeP = new javax.swing.JTextField();
        lContribuicaoP = new javax.swing.JLabel();
        txtContribuicaoP = new javax.swing.JTextField();
        sairC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gravarP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        gravarP.setText("Gravar");
        gravarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarPActionPerformed(evt);
            }
        });

        lNomeP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lNomeP.setText("Nome:");

        txtNomeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomePActionPerformed(evt);
            }
        });

        lContribuicaoP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lContribuicaoP.setText("Contribuicao:");

        txtContribuicaoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContribuicaoPKeyTyped(evt);
            }
        });

        sairC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sairC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/exit.png"))); // NOI18N
        sairC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeP))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lContribuicaoP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContribuicaoP, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(gravarP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sairC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNomeP)
                    .addComponent(txtNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lContribuicaoP)
                    .addComponent(txtContribuicaoP, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gravarP, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(sairC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gravarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarPActionPerformed
       
        if(txtNomeP.getText().trim().equals("")){
             JOptionPane.showMessageDialog(null, "Insira o Nome!");
        }else if(txtContribuicaoP.getText().trim().equals("")){
             JOptionPane.showMessageDialog(null, "Insira a Contribuição!");
        }else{
            Patrocinio x = new Patrocinio(txtNomeP.getText(),Double.parseDouble(txtContribuicaoP.getText()));
            lista.addPatrocinio(x);
            txtContribuicaoP.setText("");
            txtNomeP.setText("");
            JOptionPane.showMessageDialog(null, "Gravado com sucesso!");
        }

    }//GEN-LAST:event_gravarPActionPerformed

    private void txtNomePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePActionPerformed

    private void sairCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairCActionPerformed
        dispose();
    }//GEN-LAST:event_sairCActionPerformed

    private void txtContribuicaoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContribuicaoPKeyTyped

    }//GEN-LAST:event_txtContribuicaoPKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gravarP;
    private javax.swing.JLabel lContribuicaoP;
    private javax.swing.JLabel lNomeP;
    private javax.swing.JButton sairC;
    private javax.swing.JTextField txtContribuicaoP;
    private javax.swing.JTextField txtNomeP;
    // End of variables declaration//GEN-END:variables
}
