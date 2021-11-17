package Frontend;

import com.sun.glass.events.KeyEvent;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import Serialização.Serializacao;
import Backend.Administrador;
import Backend.Bilhete;
import Backend.GameDesigner;
import Backend.Sessao;
import Backend.Sistema;
import Backend.Utilizador;

//////////////////////////////////////////////////////////////////////////////
public class JanelaPrincipal extends javax.swing.JFrame {
    private Sistema sistema;
    private Serializacao bd;
    AdGameDesigner AdGD = null;
    AdColaborador AdC = null;
    AdPatrocionador AdP = null;
    AdSessao AdS = null;
    
    ListagemColaboradores LC = null;
    ListagemGameDesigners LGD = null;
    ListagemPatrocinios LP = null;
    ListagemSessoes LS = null;
    
    DadosFestival DF = null;
    Faturacao F = null;     
   
    public JanelaPrincipal(Sistema sistema, Serializacao bd) {
        initComponents();
        this.sistema = sistema;
        this.bd = bd;
        
        //Força a maximização da janela
        this.setExtendedState(JanelaPrincipal.MAXIMIZED_BOTH);    
        
        //O processo de fecho da janela será controlado pelo programa
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        //Apenas mostra o menu de administração se o utilizador for um administrador
        mnuAdministrador.setVisible(sistema.getUtilizadorLigado() instanceof Administrador);
        
        //Apenas mostra o menu de utilizador se o de administração estiver oculto
        
        mAdicionar.setVisible(sistema.getUtilizadorLigado() instanceof Administrador); 
        MFestival.setVisible(sistema.getUtilizadorLigado() instanceof Administrador);
        
        Painel.setVisible(false);
        atualizar();
    }
    
    private void guardarAlteracoes() {
        bd.guardar(sistema);
    }
    
    private void alterarPassword() {        
        JanelaDadosUtilizador psw = new JanelaDadosUtilizador(sistema, sistema.getUtilizadorLigado(), null);
        psw.setVisible(true);
    }
    
    private void listarUtilizadores() {
        ListagemUtilizadores listagem = new ListagemUtilizadores(sistema);
        listagem.setVisible(true);        
    }
    
    private void terminar() {        
        if (JOptionPane.showConfirmDialog(null, 
                "Deseja realmente terminar o programa?", 
                "Terminar", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            guardarAlteracoes();
            sistema.terminar();
        }
    }
    ///////////////////////////////////////////////////////////////////////////
    public void soNumeros(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||(c == KeyEvent.VK_BACKSPACE) || c == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }
    public void atualizar(){
        jComboBox1.removeAllItems();
        jComboBox1.addItem(null);
        for(int i = 1; i < (sistema.getNdias()+1); i++){
            jComboBox1.addItem(Integer.toString(i));
        }
    }
    
    public int bilhetesDisponiveis(int i){
        int u = 0;
        LocalDate data = sistema.getData().plusDays(i);
        for(Bilhete b: sistema.getBilheteira().getListaBilhetes()){
            if(b.getData().equals(data)){
                u++;
            }
        }
        return (sistema.getPartpermi() - u);
    }
    
    public boolean temSessao(GameDesigner gd){
        for(Sessao s: sistema.getListaSessoes().getListaSs()){
           if(s.getGameDesigner() == gd){
               return true;
           } 
        }
        return false;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        Painel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        mnuPrincipal = new javax.swing.JMenuBar();
        mnuGeral = new javax.swing.JMenu();
        mniGuardar = new javax.swing.JMenuItem();
        mniAlterarPassword = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniTerminar = new javax.swing.JMenuItem();
        mAdicionar = new javax.swing.JMenu();
        aColaborador = new javax.swing.JMenuItem();
        aGameDesigner = new javax.swing.JMenuItem();
        aPatrocionador = new javax.swing.JMenuItem();
        aSessao = new javax.swing.JMenuItem();
        mListagem = new javax.swing.JMenu();
        lColaborador = new javax.swing.JMenuItem();
        lGameDesigner = new javax.swing.JMenuItem();
        lPatrocionador = new javax.swing.JMenuItem();
        lSessao = new javax.swing.JMenuItem();
        mnuAdministrador = new javax.swing.JMenu();
        mnuListarUtilizadores = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        MFestival = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jLabel1.setText("jLabel1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("O meu programa");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nº de Bilhetes");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Dia");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 25, 1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Limite Max:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addContainerGap())
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jToggleButton1.setText("Comprar Bilhete");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        mnuGeral.setText("Geral");

        mniGuardar.setText("Guardar dados");
        mniGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGuardarActionPerformed(evt);
            }
        });
        mnuGeral.add(mniGuardar);

        mniAlterarPassword.setText("Alteração de dados de utilizador");
        mniAlterarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAlterarPasswordActionPerformed(evt);
            }
        });
        mnuGeral.add(mniAlterarPassword);
        mnuGeral.add(jSeparator1);

        mniTerminar.setText("Terminar");
        mniTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTerminarActionPerformed(evt);
            }
        });
        mnuGeral.add(mniTerminar);

        mnuPrincipal.add(mnuGeral);

        mAdicionar.setText("Adicionar");

        aColaborador.setText("Colaborador");
        aColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aColaboradorActionPerformed(evt);
            }
        });
        mAdicionar.add(aColaborador);

        aGameDesigner.setText("Game Designer");
        aGameDesigner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aGameDesignerActionPerformed(evt);
            }
        });
        mAdicionar.add(aGameDesigner);

        aPatrocionador.setText("Patrocionador");
        aPatrocionador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aPatrocionadorActionPerformed(evt);
            }
        });
        mAdicionar.add(aPatrocionador);

        aSessao.setText("Sessão");
        aSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aSessaoActionPerformed(evt);
            }
        });
        mAdicionar.add(aSessao);

        mnuPrincipal.add(mAdicionar);

        mListagem.setText("Listagem");

        lColaborador.setText("Colaboradores");
        lColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lColaboradorActionPerformed(evt);
            }
        });
        mListagem.add(lColaborador);

        lGameDesigner.setText("Game Designers");
        lGameDesigner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lGameDesignerActionPerformed(evt);
            }
        });
        mListagem.add(lGameDesigner);

        lPatrocionador.setText("Patrocinios");
        lPatrocionador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lPatrocionadorActionPerformed(evt);
            }
        });
        mListagem.add(lPatrocionador);

        lSessao.setText("Sessões");
        lSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lSessaoActionPerformed(evt);
            }
        });
        mListagem.add(lSessao);

        mnuPrincipal.add(mListagem);

        mnuAdministrador.setText("Administrador");
        mnuAdministrador.setToolTipText("");

        mnuListarUtilizadores.setText("Listagem Utilizadores");
        mnuListarUtilizadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListarUtilizadoresActionPerformed(evt);
            }
        });
        mnuAdministrador.add(mnuListarUtilizadores);

        jMenuItem7.setText("Faturação");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        mnuAdministrador.add(jMenuItem7);

        mnuPrincipal.add(mnuAdministrador);

        MFestival.setText("Festival");

        jMenuItem6.setText("Alterar dados do Festival");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        MFestival.add(jMenuItem6);

        mnuPrincipal.add(MFestival);

        setJMenuBar(mnuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(301, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTerminarActionPerformed
        terminar();
    }//GEN-LAST:event_mniTerminarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        terminar();
    }//GEN-LAST:event_formWindowClosing

    private void mniAlterarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAlterarPasswordActionPerformed
        alterarPassword();
    }//GEN-LAST:event_mniAlterarPasswordActionPerformed

    private void mnuListarUtilizadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListarUtilizadoresActionPerformed
        listarUtilizadores();
    }//GEN-LAST:event_mnuListarUtilizadoresActionPerformed

    private void mniGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGuardarActionPerformed
        guardarAlteracoes();
        JOptionPane.showMessageDialog(this, "Alterações guardadas.");
    }//GEN-LAST:event_mniGuardarActionPerformed

    private void aGameDesignerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aGameDesignerActionPerformed
        if(AdGD == null){
            AdGD= new AdGameDesigner(sistema.getListaGameDesigners());
        }
        AdGD.setState(NORMAL);
        AdGD.setVisible(true); 
        AdGD.inicio();
    }//GEN-LAST:event_aGameDesignerActionPerformed

    private void aColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aColaboradorActionPerformed
        if(AdC == null){
            AdC = new AdColaborador(sistema);
        }
        AdC.setState(NORMAL);
        AdC.setVisible(true); 
        AdC.inicio();
    }//GEN-LAST:event_aColaboradorActionPerformed

    private void aPatrocionadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aPatrocionadorActionPerformed
       if(AdP == null){
            AdP= new AdPatrocionador(sistema.getListaPatrocinios());
        }
        AdP.setState(NORMAL);
        AdP.setVisible(true); 
        AdP.limpar();
    }//GEN-LAST:event_aPatrocionadorActionPerformed

    private void aSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aSessaoActionPerformed
        if(AdS == null){
            AdS= new AdSessao(sistema);
        }
        AdS.setState(NORMAL);
        AdS.setVisible(true); 
        AdS.atualizar();
    }//GEN-LAST:event_aSessaoActionPerformed

    private void lColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lColaboradorActionPerformed
        if(LC == null){
            LC = new ListagemColaboradores(sistema.getListaColaboradores());
            LC.setVisible(true);
        }else{
        LC.setState(NORMAL);
        LC.setVisible(true);
        LC.limparTabela();
        LC.carregarTabela();
        }
    }//GEN-LAST:event_lColaboradorActionPerformed

    private void lGameDesignerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lGameDesignerActionPerformed
        if(LGD == null){
            LGD = new ListagemGameDesigners(sistema.getListaGameDesigners());
        }
        LGD.setState(NORMAL);
        LGD.setVisible(true);
        LGD.limparTabela();
        LGD.carregarTabela();
    }//GEN-LAST:event_lGameDesignerActionPerformed

    private void lPatrocionadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lPatrocionadorActionPerformed
       if(LP == null){
            LP = new ListagemPatrocinios(sistema.getListaPatrocinios());
        }
        LP.setState(NORMAL);
        LP.setVisible(true);
        LP.limparTabela();
        LP.carregarTabela();
    }//GEN-LAST:event_lPatrocionadorActionPerformed

    private void lSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lSessaoActionPerformed
        if(LS == null){
            LS = new ListagemSessoes(sistema.getListaSessoes());
        }
        LS.setState(NORMAL);
        LS.setVisible(true);
        LS.limparTabela();
        LS.carregarTabela();
    }//GEN-LAST:event_lSessaoActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        if(DF == null){
            DF = new DadosFestival(sistema);
        }
        DF.setState(NORMAL);
        DF.setVisible(true);
        DF.carregarDados();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if(Painel.isVisible() == true){
            Painel.setVisible(false);
        }else if(Painel.isVisible() == false){
            Painel.setVisible(true);
            atualizar();
            jComboBox1.setSelectedIndex(0);
            jLabel6.setText("");
            jLabel4.setText("");   
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jComboBox1.getSelectedItem() == null){
            jLabel4.setText("Escolha um dia!");
        }else if((Integer)jSpinner1.getValue() <= 0){
            jLabel4.setText("Insira o Numero de Bilhetes!");
        }else if(bilhetesDisponiveis(jComboBox1.getSelectedIndex()-1) < (Integer)jSpinner1.getValue()){
            jLabel4.setText("Quantidade Indisponivel!");
        }else{
            for(int i = 0; i < (Integer)jSpinner1.getValue();i++){
                Bilhete x = new Bilhete(sistema.getData().plusDays(jComboBox1.getSelectedIndex()-1));
                sistema.getBilheteira().adicionarBilhete(x);
            }
            jLabel6.setText(Integer.toString(bilhetesDisponiveis(jComboBox1.getSelectedIndex()-1)));
            jLabel4.setText("Compra Efetuada!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       if(F == null){
            F = new Faturacao(sistema);
        }
        F.setState(NORMAL);
        F.setVisible(true);
        F.atualizar();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jLabel6.setText(Integer.toString(bilhetesDisponiveis(jComboBox1.getSelectedIndex()-1)));
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeVisible
        
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeVisible
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MFestival;
    private javax.swing.JPanel Painel;
    private javax.swing.JMenuItem aColaborador;
    private javax.swing.JMenuItem aGameDesigner;
    private javax.swing.JMenuItem aPatrocionador;
    private javax.swing.JMenuItem aSessao;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JMenuItem lColaborador;
    private javax.swing.JMenuItem lGameDesigner;
    private javax.swing.JMenuItem lPatrocionador;
    private javax.swing.JMenuItem lSessao;
    private javax.swing.JMenu mAdicionar;
    private javax.swing.JMenu mListagem;
    private javax.swing.JMenuItem mniAlterarPassword;
    private javax.swing.JMenuItem mniGuardar;
    private javax.swing.JMenuItem mniTerminar;
    private javax.swing.JMenu mnuAdministrador;
    private javax.swing.JMenu mnuGeral;
    private javax.swing.JMenuItem mnuListarUtilizadores;
    private javax.swing.JMenuBar mnuPrincipal;
    // End of variables declaration//GEN-END:variables
}
