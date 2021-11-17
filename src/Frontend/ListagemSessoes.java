
package Frontend;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Backend.ListaSessoes;
import Backend.Patrocinio;
import Backend.Sessao;

public class ListagemSessoes extends javax.swing.JFrame {

  ListaSessoes lista;
  DefaultTableModel modelo;
  List lista2;
  
    public ListagemSessoes(ListaSessoes x) {
        initComponents();
        this.lista = x;
        setTitle("Listagem de Sessões"); 
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        this.setLocationRelativeTo(null);
        carregarTabela();
    }

    
    
    public void carregarTabela(){
        List<Sessao> lista2 = new ArrayList<>(lista.getListaSs());
        lista2.sort(new Comparator<Sessao>(){
            public int compare(Sessao p1, Sessao p2){      
                return p1.getHoraInicio().compareTo(p2.getHoraInicio());
            }
        });
        modelo = (DefaultTableModel) Table.getModel();
        for(Sessao s: lista2){
                modelo.addRow(new Object[]{s.getJogo(),
                                           s.getGameDesigner().getNome(),
                                           s.getHoraInicio().getYear()+"/"+s.getHoraInicio().getMonthValue()+"/"+ s.getHoraInicio().getDayOfMonth(),
                                           s.getHoraInicio().getHour()+":"+s.getHoraInicio().getMinute(),
                                           s.getHoraFim().getHour()+":"+s.getHoraFim().getMinute()});
        }
    }
    public void limparTabela(){
        modelo.setRowCount(0);
    }
    
    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jogo", "GameDesigner", "Dia", "Hora Inicio", "Hora Fim"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/exit.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
