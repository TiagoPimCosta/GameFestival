package Frontend;

import Backend.Sistema;

/**
 *
 * @author Tiago
 */
public class Faturacao extends javax.swing.JFrame {
    Sistema sistema;
    /**
     * Creates new form Faturacao
     */
    public Faturacao(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        setTitle("Adicionar Colaboradores"); 
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        atualizar();
        this.setLocationRelativeTo(null);
    }

    public void atualizar(){
        int bilhetesv = sistema.getBilheteira().bilhetesVendidos();
        double dinheiroB = sistema.getBilheteira().dinheiro();
        double ContPatr = sistema.getListaPatrocinios().contribuicao();
        double PagaGD  = sistema.getListaGameDesigners().pagamento();
        double PagaCol = sistema.getListaColaboradores().dinheiroGasto();
        double total = (dinheiroB + ContPatr - PagaGD - PagaCol);
        
        txtBilhetesVendidos.setText(Integer.toString(bilhetesv));
        dinheiroBilhetes.setText(Double.toString(dinheiroB));
        jLabel4.setText(Double.toString(ContPatr));
        jLabel6.setText(Double.toString(PagaGD));
        jLabel8.setText(Double.toString(PagaCol));
        jLabel11.setText(Double.toString(total));
        jLabel13.setText(Integer.toString(sistema.numerodeGameDesignersEmSessoes()));
        jLabel18.setText(Integer.toString(sistema.diaMaior()));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBilhetesVendidos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dinheiroBilhetes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Bilhetes Vendidos:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        txtBilhetesVendidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtBilhetesVendidos.setText("jLabel2");
        getContentPane().add(txtBilhetesVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 12, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Dinheiro auferido com os Bilhetes:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 35, -1, -1));

        dinheiroBilhetes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dinheiroBilhetes.setText("jLabel3");
        getContentPane().add(dinheiroBilhetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 35, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Contribuicao dos Patrocinios:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 101, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 101, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Pagamento Game Designers:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 187, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 187, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Pagamento a Colaboradores:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 144, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 144, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Total:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 253, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel10.setText("-------------------------------------------------------------------------------------------");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 167, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 253, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/exit.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 253, 75, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("GameDesigners com Sessão:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 210, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 210, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel14.setText("-------------------------------------------------------------------------------------------");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 81, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel15.setText("-------------------------------------------------------------------------------------------");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 124, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel16.setText("-------------------------------------------------------------------------------------------");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 233, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("Dia maior afluência:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 58, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("jLabel18");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 58, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dinheiroBilhetes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel txtBilhetesVendidos;
    // End of variables declaration//GEN-END:variables
}