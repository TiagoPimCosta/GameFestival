package Frontend;

import com.sun.glass.events.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import Backend.ListaColaborador;
import Backend.Colaborador;
import Backend.FormataDouble;
import Backend.Pago;
import Backend.Sistema;
import Backend.Voluntario;

public class AdColaborador extends javax.swing.JFrame {
    Sistema sistema;
    /**
     * Creates new form AdColaborador
     */
    public AdColaborador(Sistema x) {
        initComponents();
        this.sistema = x;
        setTitle("Adicionar Colaboradores"); 
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        inicio();
        setResizable(false);
        this.setLocationRelativeTo(null);
        txtTelfC.setDocument(new FormataDouble());
        txtNifC.setDocument(new FormataDouble());
        txtNDias.setDocument(new FormataDouble());
    }
    public void inicio(){
        cbox.setSelectedIndex(0);
        setSize(410, 230);
        txtNomeC.setText("");
        txtMoradaC.setText("");
        txtFuncaoC.setText("");
        txtTelfC.setText("");
        txtNifC.setText("");
        txtNDias.setText("");    
    }
    
    public void soNumeros(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||(c == KeyEvent.VK_BACKSPACE) || c == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lNomeC = new javax.swing.JLabel();
        lMoradaC = new javax.swing.JLabel();
        lTelfC = new javax.swing.JLabel();
        lFuncaoC = new javax.swing.JLabel();
        lNifC = new javax.swing.JLabel();
        txtNomeC = new javax.swing.JTextField();
        txtMoradaC = new javax.swing.JTextField();
        txtTelfC = new javax.swing.JTextField();
        cbox = new javax.swing.JComboBox<>();
        Sair = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtFuncaoC = new javax.swing.JTextField();
        txtNifC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNDias = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lNomeC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lNomeC.setText("Nome");

        lMoradaC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lMoradaC.setText("Morada");

        lTelfC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lTelfC.setText("Contacto");

        lFuncaoC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lFuncaoC.setText("Função");

        lNifC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lNifC.setText("NIF");

        txtTelfC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelfCActionPerformed(evt);
            }
        });
        txtTelfC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelfCKeyTyped(evt);
            }
        });

        cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pago", "Voluntário" }));
        cbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxItemStateChanged(evt);
            }
        });

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/exit.png"))); // NOI18N
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        jButton2.setText("Gravar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtFuncaoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFuncaoCKeyTyped(evt);
            }
        });

        txtNifC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNifCActionPerformed(evt);
            }
        });
        txtNifC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNifCKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Dias de Trabalho");

        txtNDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNDiasActionPerformed(evt);
            }
        });
        txtNDias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNDiasKeyTyped(evt);
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNDias))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lMoradaC)
                            .addComponent(lTelfC)
                            .addComponent(lFuncaoC)
                            .addComponent(lNifC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMoradaC, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelfC, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFuncaoC, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNifC, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeC, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lNomeC)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbox, 0, 90, Short.MAX_VALUE)
                    .addComponent(Sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNomeC)
                    .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMoradaC)
                    .addComponent(txtMoradaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTelfC)
                    .addComponent(txtTelfC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lFuncaoC)
                    .addComponent(txtFuncaoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNifC)
                    .addComponent(txtNifC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelfCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelfCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelfCActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void cboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxItemStateChanged
        if(cbox.getSelectedItem().toString().equals("Voluntário")){
            lNifC.setVisible(false);
            txtNifC.setVisible(false);
            jLabel1.setVisible(false);
            txtNDias.setVisible(false);
            setSize(410, 185);
        }else if(cbox.getSelectedItem().toString().equals("Pago")){
            lNifC.setVisible(true);
            txtNifC.setVisible(true);
            jLabel1.setVisible(true);
            txtNDias.setVisible(true);
            setSize(410, 230);
        }
    }//GEN-LAST:event_cboxItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(cbox.getSelectedItem().toString().equals("Voluntário")){
            if(txtNomeC.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Insira o Nome!");
            }else if(txtMoradaC.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Insira a Morada!");
            }else if(txtTelfC.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Insira o Contacto!");
            }else if(txtFuncaoC.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Insira a Função!");
            }else{
                Colaborador x = new Voluntario(txtNomeC.getText(),txtMoradaC.getText(),txtTelfC.getText(),txtFuncaoC.getText());
                sistema.getListaColaboradores().addColaborador(x);
                JOptionPane.showMessageDialog(null, "Gravado com sucesso!");
                
                txtNomeC.setText("");
                txtMoradaC.setText("");
                txtFuncaoC.setText("");
                txtTelfC.setText(""); 
            }
        }else if(cbox.getSelectedItem().toString().equals("Pago")){
            if(txtNomeC.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Insira o Nome!");
            }else if(txtMoradaC.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Insira a Morada!");
            }else if(txtTelfC.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Insira o Contacto!");
            }else if(txtFuncaoC.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Insira a Função!");
            }else if(txtNifC.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Insira o Nif!");
            }else if( nifExiste(txtNifC.getText())){
                JOptionPane.showMessageDialog(null, "Nif já está atribuido!");
            }else if(txtNDias.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Insira os Numero de Dias!");
            }else if(Integer.parseInt(txtNDias.getText().trim()) > sistema.getNdias()){
                JOptionPane.showMessageDialog(null, "Não pode trabalhar mais dias do que os do festival!");
            }
            else{
                Colaborador x = new Pago(txtNomeC.getText(),txtMoradaC.getText(),txtFuncaoC.getText(),txtTelfC.getText(),txtNifC.getText(),Integer.parseInt(txtNDias.getText()));
                sistema.getListaColaboradores().addColaborador(x);
                JOptionPane.showMessageDialog(null, "Gravado com sucesso!");
                txtNomeC.setText("");
                txtMoradaC.setText("");
                txtFuncaoC.setText("");
                txtTelfC.setText("");
                txtNifC.setText("");
                txtNDias.setText("");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public boolean nifExiste(String Nif){
        for(Colaborador p: sistema.getListaColaboradores().getListaColaboradores()){
            if(p instanceof Pago){
                if(txtNifC.getText().equals(((Pago) p).getNIF())){
                    return true;
                }
            }
        }
        return false;
    }
    private void txtTelfCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelfCKeyTyped
        if(txtTelfC.getText().length() > 8){
            evt.consume();
        }else{
            soNumeros(evt);
        }
    }//GEN-LAST:event_txtTelfCKeyTyped

    private void txtFuncaoCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFuncaoCKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFuncaoCKeyTyped

    private void txtNifCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNifCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNifCActionPerformed

    private void txtNifCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNifCKeyTyped
       if(txtNifC.getText().length() > 8){
           evt.consume();
       }else{
        soNumeros(evt);
       }
    }//GEN-LAST:event_txtNifCKeyTyped

    private void txtNDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNDiasActionPerformed

    private void txtNDiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNDiasKeyTyped

    }//GEN-LAST:event_txtNDiasKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sair;
    private javax.swing.JComboBox<String> cbox;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lFuncaoC;
    private javax.swing.JLabel lMoradaC;
    private javax.swing.JLabel lNifC;
    private javax.swing.JLabel lNomeC;
    private javax.swing.JLabel lTelfC;
    private javax.swing.JTextField txtFuncaoC;
    private javax.swing.JTextField txtMoradaC;
    private javax.swing.JTextField txtNDias;
    private javax.swing.JTextField txtNifC;
    private javax.swing.JTextField txtNomeC;
    private javax.swing.JTextField txtTelfC;
    // End of variables declaration//GEN-END:variables
}
