/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscaHeuristicaA;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class Panel extends javax.swing.JFrame {

    /**
     * Creates new form Panel
     */
    public Panel() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arad", "Craiova", "Dobeta", "Eforie", "Fagaras", "Giurgiu", "Hisóvia", "Iasi", "Lugoj", "Mahadia", "Neamt", "Oradea", "Pitesti", "Riminicu", "Sibiu", "Tiisoara", "Ursiceni", "Vaslui", "Zerind" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ponto de saída");

        jLabel2.setText("HEURISTICA - MELHOR CAMINHO PARA Bucharest");

        jButton1.setText("Busca");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Alvo bucharest =  new Alvo(new Vertice("Bucharest", 0));
        Vertice arad = new Vertice("Arad", 366);
        Vertice craiova = new Vertice("Craiova", 160);
        Vertice dobeta = new Vertice("Dobeta", 242);
        Vertice eforie = new Vertice("Eforie", 161);
        Vertice fagaras = new Vertice("Fagaras", 176);
        Vertice giurgiu = new Vertice("Giurgiu", 77);
        Vertice hirsovia = new Vertice("Hisóvia", 151);
        Vertice iasi = new Vertice("Iasi", 226);
        Vertice lugoj = new Vertice("Lugoj", 244);
        Vertice mehadia = new Vertice("Mahadia", 241);
        Vertice neamt = new Vertice("Neamt", 234);
        Vertice oradea = new Vertice("Oradea", 380);
        Vertice pitesti = new Vertice("Pitesti", 100);
        Vertice riminicu = new Vertice("Riminicu", 193);
        Vertice sibiu = new Vertice("Sibiu", 253);
        Vertice timisoara = new Vertice("Tiisoara", 329);
        Vertice ursiceni = new Vertice("Ursiceni", 80);
        Vertice vaslui = new Vertice("Vaslui", 199);
        Vertice zerind = new Vertice("Zerind", 374);
        
        Aresta a1 = new Aresta(oradea, zerind, 71);
        Aresta a2 = new Aresta(zerind, arad, 75);
        Aresta a3 = new Aresta(arad, timisoara, 118);
        Aresta a4 = new Aresta(timisoara, lugoj, 111);
        Aresta a5 = new Aresta(lugoj, mehadia, 70);
        Aresta a6 = new Aresta(mehadia, dobeta, 75);
        Aresta a7 = new Aresta(dobeta, craiova, 120);
        Aresta a8 = new Aresta(craiova, riminicu, 146);
        Aresta a9 = new Aresta(riminicu, sibiu, 80);
        Aresta a10 = new Aresta(arad, sibiu, 140);
        Aresta a11 = new Aresta(oradea, sibiu, 151);
        Aresta a12 = new Aresta(sibiu, fagaras, 99);
        Aresta a13 = new Aresta(riminicu, pitesti, 97);
        Aresta a14 = new Aresta(craiova, pitesti, 138);
        Aresta a15 = new Aresta(pitesti, bucharest.getAlvo(), 101);
        Aresta a16 = new Aresta(fagaras, bucharest.getAlvo(), 211);
        Aresta a17 = new Aresta(bucharest.getAlvo(), giurgiu, 90);
        Aresta a18 = new Aresta(bucharest.getAlvo(), ursiceni, 86);
        Aresta a19 = new Aresta(ursiceni, hirsovia, 98);
        Aresta a20= new Aresta(hirsovia, eforie, 86);
        Aresta a21 = new Aresta(hirsovia, vaslui, 142);
        Aresta a22 = new Aresta(vaslui, iasi, 92);
        Aresta a23 = new Aresta(iasi, neamt, 87);
        
        ArrayList<Aresta> arestas = new ArrayList<>();
        arestas.add(a1);
        arestas.add(a2);
        arestas.add(a3);
        arestas.add(a4);
        arestas.add(a5);
        arestas.add(a6);
        arestas.add(a7);
        arestas.add(a8);
        arestas.add(a9);
        arestas.add(a10);
        arestas.add(a11);
        arestas.add(a12);
        arestas.add(a13);
        arestas.add(a14);
        arestas.add(a15);
        arestas.add(a16);
        arestas.add(a17);
        arestas.add(a18);
        arestas.add(a19);
        arestas.add(a20);
        arestas.add(a21);
        arestas.add(a22);
        arestas.add(a23);
        
        ArrayList<CaminhoResultante> resultado = new ArrayList<>();
        
        Vertice inicio = null;
        
        if(jComboBox1.getSelectedItem() == "Arad") {
            inicio = arad;
        } else if(jComboBox1.getSelectedItem() == "Craiova") {
            inicio = craiova;
        } else if(jComboBox1.getSelectedItem() == "Dobeta") {
            inicio = dobeta;
        } else if(jComboBox1.getSelectedItem() == "Eforie") {
            inicio = eforie;
        } else if(jComboBox1.getSelectedItem() == "Fagaras") {
            inicio = fagaras;
        } else if(jComboBox1.getSelectedItem() == "Giurgiu") {
            inicio = giurgiu;
        } else if(jComboBox1.getSelectedItem() == "Hisóvia") {
            inicio = hirsovia;
        } else if(jComboBox1.getSelectedItem() == "Iasi") {
            inicio = iasi;
        } else if(jComboBox1.getSelectedItem() == "Lugoj") {
            inicio = lugoj;
        } else if(jComboBox1.getSelectedItem() == "Mahadia") {
            inicio = null;
        } else if(jComboBox1.getSelectedItem() == "Oradea") {
            inicio = neamt;
        } else if(jComboBox1.getSelectedItem() == "Pitesti") {
            inicio = pitesti;
        } else if(jComboBox1.getSelectedItem() == "Riminicu") {
            inicio = riminicu;
        } else if(jComboBox1.getSelectedItem() == "Sibiu") {
            inicio = sibiu;
        } else if(jComboBox1.getSelectedItem() == "Ursiceni") {
            inicio = ursiceni;
        } else if(jComboBox1.getSelectedItem() == "Vaslui") {
            inicio = vaslui;
        } else if(jComboBox1.getSelectedItem() == "Zerind") {
            inicio = zerind;
        }
        
        resultado = bucharest.melhor_caminho(inicio, 0, arestas, resultado);
        
        String result = inicio.getCidade() + "";
        for(int i=0;i<resultado.size(); i++){   
            result += "   ->   " + resultado.get(i).getEstagio_atual().getCidade();
            System.out.println("Visitou: "+ resultado.get(i).getEstagio_atual().getCidade() +" e a distancia gradual foi: "+ resultado.get(i).getSomatorio_caminho());
        }
        jTextArea2.setText(result);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}