
package Frontend;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import Backend.FormataDouble;
import Backend.GameDesigner;
import Backend.ListaGameDesigner;



/**
 *
 * @author Tiago Costa
 */
public class AdGameDesigner extends javax.swing.JFrame {
    ListaGameDesigner lista;
    /**
     * Creates new form AdGameDesigner
     */
    public AdGameDesigner(ListaGameDesigner lgd) {
        this.lista = lgd;
        initComponents();
        setTitle("Adicionar GameDesigners");  
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(390,185);
        this.setLocationRelativeTo(null);
        txtTelfG.setDocument(new FormataDouble());
        txtNifG.setDocument(new FormataDouble());
        txtCacheG.setDocument(new FormataDouble());
    }
    public boolean nifExiste(String Nif){
        for(GameDesigner p: lista.getListaGameDesigners()){
           
                if(txtNifG.getText().equals(p.getNIF())){
                    return true;
                }
            }
        
        return false;
    }
    public void inicio(){
        txtNomeG.setText("");
        txtTelfG.setText("");
        txtNifG.setText("");
        txtCacheG.setText("");   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lNomeG = new javax.swing.JLabel();
        txtNomeG = new javax.swing.JTextField();
        lCacheG = new javax.swing.JLabel();
        lContactoG = new javax.swing.JLabel();
        lNifG = new javax.swing.JLabel();
        gravarC = new javax.swing.JButton();
        sairC = new javax.swing.JButton();
        txtCacheG = new javax.swing.JFormattedTextField();
        txtTelfG = new javax.swing.JFormattedTextField();
        txtNifG = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lNomeG.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lNomeG.setText("Nome:");

        txtNomeG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeGActionPerformed(evt);
            }
        });

        lCacheG.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lCacheG.setText("Cache:");

        lContactoG.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lContactoG.setText("Contacto:");

        lNifG.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lNifG.setText("NIF:");

        gravarC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        gravarC.setText("Gravar");
        gravarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarCActionPerformed(evt);
            }
        });

        sairC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sairC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/exit.png"))); // NOI18N
        sairC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairCActionPerformed(evt);
            }
        });

        txtCacheG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtCacheG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCacheGActionPerformed(evt);
            }
        });
        txtCacheG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCacheGKeyTyped(evt);
            }
        });

        txtTelfG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtTelfG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelfGActionPerformed(evt);
            }
        });
        txtTelfG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelfGKeyTyped(evt);
            }
        });

        txtNifG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNifGKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lCacheG)
                            .addComponent(lNomeG)
                            .addComponent(lNifG, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCacheG)
                            .addComponent(txtNifG)
                            .addComponent(txtNomeG)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 170, Short.MAX_VALUE)
                        .addComponent(gravarC, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sairC, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lContactoG)
                        .addGap(14, 14, 14)
                        .addComponent(txtTelfG)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNomeG)
                    .addComponent(txtNomeG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelfG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lContactoG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNifG)
                    .addComponent(txtNifG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCacheG)
                    .addComponent(txtCacheG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sairC, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(gravarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeGActionPerformed

    private void gravarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarCActionPerformed
        if(txtNomeG.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Insira o Nome!");
        }else if(txtTelfG.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Insira o Telefone!");
        }else if(txtNifG.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Insira o Nif!");
        }else if(nifExiste(txtNifG.getText().trim())){
            JOptionPane.showMessageDialog(null, "NIF ja Existente!");
        }else if(txtCacheG.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Insira o Cache!");
        }else{
            GameDesigner x = new GameDesigner(txtNomeG.getText(),txtTelfG.getText(),txtNifG.getText(),Double.parseDouble(txtCacheG.getText()));
            lista.addGameDesigner(x);
            txtNomeG.setText("");
            txtTelfG.setText("");
            txtNifG.setText("");
            txtCacheG.setText("");
            JOptionPane.showMessageDialog(null, "Gravado com sucesso!");
        }         
    }//GEN-LAST:event_gravarCActionPerformed

    private void sairCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairCActionPerformed
        dispose();
    }//GEN-LAST:event_sairCActionPerformed

    private void txtTelfGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelfGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelfGActionPerformed

    private void txtCacheGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCacheGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCacheGActionPerformed

    private void txtCacheGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCacheGKeyTyped
        if(txtCacheG.getText().length() > 8){
            evt.consume();
        }else{
        }
    }//GEN-LAST:event_txtCacheGKeyTyped

    private void txtTelfGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelfGKeyTyped
        if(txtTelfG.getText().length() > 8){
            evt.consume();
        }else{
        }
    }//GEN-LAST:event_txtTelfGKeyTyped

    private void txtNifGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNifGKeyTyped
        if(txtNifG.getText().length() > 8){
            evt.consume();
        }else{
        }
    }//GEN-LAST:event_txtNifGKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gravarC;
    private javax.swing.JLabel lCacheG;
    private javax.swing.JLabel lContactoG;
    private javax.swing.JLabel lNifG;
    private javax.swing.JLabel lNomeG;
    private javax.swing.JButton sairC;
    private javax.swing.JFormattedTextField txtCacheG;
    private javax.swing.JTextField txtNifG;
    private javax.swing.JTextField txtNomeG;
    private javax.swing.JFormattedTextField txtTelfG;
    // End of variables declaration//GEN-END:variables
}