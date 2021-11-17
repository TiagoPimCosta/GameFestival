/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import com.sun.glass.events.KeyEvent;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import Backend.Sistema;

/**
 *
 * @author Tiago
 */
public class DadosFestival extends javax.swing.JFrame {
    Sistema sistema;
    boolean teste;
    Avancadas A= null;
    /**
     * Creates new form DadosFestival
     */
    public DadosFestival(Sistema s) {
        this.sistema = s;
        initComponents();
        carregarDados();
        setTitle("Dados Festival");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        this.setLocationRelativeTo(null);
    }
    public void guardarDados(){
        if(TxtNome.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Insira o Nome!");
        }else if(TxtLocal.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Insira o Local!");
        }else if(TxtNDias.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Insira o Numero de Dias!");
        }else if(TxtMPart.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Insira o Numero de Participantes!");
        }else if(!ValidaData(TxtData.getText())){
            TxtData.requestFocus();
        }else{
            sistema.setNome(TxtNome.getText());
            sistema.setData(LocalDate.parse(TxtData.getText()));
            sistema.setLocal(TxtLocal.getText());
            sistema.setNdias(Integer.parseInt(TxtNDias.getText()));
            sistema.setPartpermi(Integer.parseInt(TxtMPart.getText()));
            JOptionPane.showMessageDialog(null, "Gravado com sucesso!");
        }

    }
    public void carregarDados(){
        TxtNome.setText(sistema.getNome());
        TxtData.setText(sistema.getData().toString());
        TxtLocal.setText(sistema.getLocal());
        TxtNDias.setText(Integer.toString(sistema.getNdias()));
        TxtMPart.setText(Integer.toString(sistema.getPartpermi()));
    }
    public void soNumeros(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||(c == KeyEvent.VK_BACKSPACE) || c == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }
    
    
     public boolean ValidaData(String data){      
       String Smeses ="312831303130313130313031";
       String dataS;
       int dia, mes, ano,  DiasDoMes;
       if (data.trim().length() ==10){
            ano = Integer.parseInt(data.substring(0,4));
            mes = Integer.parseInt(data.substring(5,7));
            dia = Integer.parseInt(data.substring(8,10));
            
            LocalDate dataSistema = LocalDate.now();
            
            dataS = dataSistema.toString();
            
            if (ano >=Integer.parseInt(dataS.substring(0,4))){
                
                if (mes> 0 && mes < 13){
                    DiasDoMes = Integer.parseInt(Smeses.substring(mes*2-2,mes*2));
                    if (((ano %2) == 0) && (mes == 2))                       
                        ++DiasDoMes;
                    
                    if (dia <= DiasDoMes){
                    return true;
                    }else {
                        JOptionPane.showMessageDialog(null, "Dia Errado!!!");
                        return false;
                        }
                }else{
                
                    JOptionPane.showMessageDialog(null, "Mês Errado!!!");
                    return false;               
                }
            }else {
            
                JOptionPane.showMessageDialog(null, "Ano Errado!!!");
                return false;
                }
        }
         else{
            JOptionPane.showMessageDialog(null, "Data Inválida!!!");
            return false;
            }
   
   } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        TxtLocal = new javax.swing.JTextField();
        TxtNDias = new javax.swing.JTextField();
        TxtMPart = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TxtData = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("Data");

        jLabel3.setText("Local");

        jLabel4.setText("Dias");

        jLabel5.setText("Max de participantes");

        TxtNDias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNDiasKeyTyped(evt);
            }
        });

        TxtMPart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtMPartKeyTyped(evt);
            }
        });

        jButton1.setText("Gravar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/exit.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        try {
            TxtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtDataFocusLost(evt);
            }
        });

        jButton3.setText("Avançadas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtNDias))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtLocal))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtData))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtMPart)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TxtNDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtMPart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtMPartKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtMPartKeyTyped
        soNumeros(evt);
    }//GEN-LAST:event_TxtMPartKeyTyped

    private void TxtNDiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNDiasKeyTyped
        soNumeros(evt);
    }//GEN-LAST:event_TxtNDiasKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        guardarDados();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TxtDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtDataFocusLost
        if(!ValidaData(TxtData.getText())){
            TxtData.requestFocus();
            teste = false;
        }else{
            teste = true;
        };
    }//GEN-LAST:event_TxtDataFocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(A == null){
            A = new Avancadas(sistema);
        }
        A.setState(NORMAL);
        A.setVisible(true); 
        A.inicio();
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField TxtData;
    private javax.swing.JTextField TxtLocal;
    private javax.swing.JTextField TxtMPart;
    private javax.swing.JTextField TxtNDias;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
