package cadastrovagas;

import javax.swing.JOptionPane;

public class InsersaoCadastro extends javax.swing.JFrame {

    public InsersaoBD cadastra;
    public Principal p;
    public InsersaoCadastro(){
        initComponents();        
    }
    
    public InsersaoCadastro(InsersaoBD c) {
        initComponents();
        cadastra=c;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox9 = new javax.swing.JComboBox();
        jTextField5 = new javax.swing.JTextField();
        jComboBox10 = new javax.swing.JComboBox();
        jTextField6 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(50, 50));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Responsavel Pelo Cadastro:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        jLabel3.setText("Responsavel Pela Vaga:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        jLabel4.setText("Empresa:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 19));

        jLabel5.setText("Estágio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 197, -1));

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 790, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Técnico em Informatica", "Técnico em Mecânica", "Técnico em Eletroeletrônica" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 217, -1));

        jLabel1.setText("Turno:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel7.setText("Localização da Empresa:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 120, -1));

        jLabel8.setText("Valor Salário/Bolsa: R$");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        jLabel9.setText("Vale Refeição:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        jLabel10.setText("Vale Transporte:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        jLabel11.setText("Assistencia Medica:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        jLabel12.setText("Assistencia Odontologica:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        jLabel13.setText("Fretamento:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        jLabel14.setText("E-Mail Contato:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        jLabel15.setText("Vagas:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 139, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Sim", "Não" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, -1, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Sim", "Não" }));
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Sim", "Não" }));
        getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Sim", "Não" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Sim", "Não" }));
        getContentPane().add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, -1));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "..." }));
        getContentPane().add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 170, -1));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Pedro Alves", "Paula Capelline", "Fernanda Vascos" }));
        getContentPane().add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 124, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 124, -1));

        jLabel18.setForeground(new java.awt.Color(204, 0, 0));
        jLabel18.setText("*");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, -1));

        jLabel19.setForeground(new java.awt.Color(204, 0, 0));
        jLabel19.setText("*");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "1º Turno", "2º Turno", "3º Turno" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel20.setForeground(new java.awt.Color(204, 0, 0));
        jLabel20.setText("*");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel21.setForeground(new java.awt.Color(204, 0, 0));
        jLabel21.setText("*");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel22.setForeground(new java.awt.Color(204, 0, 0));
        jLabel22.setText("*");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel23.setForeground(new java.awt.Color(204, 0, 0));
        jLabel23.setText("*");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jLabel24.setForeground(new java.awt.Color(204, 0, 0));
        jLabel24.setText("*");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));

        jLabel25.setForeground(new java.awt.Color(204, 0, 0));
        jLabel25.setText("*");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        jLabel26.setForeground(new java.awt.Color(204, 0, 0));
        jLabel26.setText("*");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, -1, -1));

        jLabel27.setForeground(new java.awt.Color(204, 0, 0));
        jLabel27.setText("*");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, -1, -1));

        jLabel28.setForeground(new java.awt.Color(204, 0, 0));
        jLabel28.setText("*");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        jLabel29.setForeground(new java.awt.Color(204, 0, 0));
        jLabel29.setText("*");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        jLabel30.setForeground(new java.awt.Color(204, 0, 0));
        jLabel30.setText("*");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));

        jLabel31.setForeground(new java.awt.Color(204, 0, 0));
        jLabel31.setText("*");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        jLabel16.setForeground(new java.awt.Color(204, 0, 0));
        jLabel16.setText("Campo Obrigatório:*");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 292, 790, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 20, 210));

        jLabel17.setText("Informação do Estágio");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel32.setText("Informações Extras");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        jLabel33.setText("Informações do Cadastro");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastrovagas/StorageWorks.png"))); // NOI18N
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Campo de Drop Down
        String turno = (String)jComboBox1.getSelectedItem();
        String estagio = (String)jComboBox3.getSelectedItem();
        String vagas = (String)jComboBox9.getSelectedItem();
        String valeRefeicao = (String)jComboBox4.getSelectedItem();
        String valeTransporte = (String)jComboBox5.getSelectedItem();
        String assisMedica = (String)jComboBox6.getSelectedItem();
        String assisOdonto = (String)jComboBox7.getSelectedItem();
        String fretamento = (String)jComboBox8.getSelectedItem();
        String responCadastro = (String)jComboBox10.getSelectedItem();
        // Campos de Texto
        String empresa = (String)jTextField2.getText();
        String localEmpresa = (String)jTextField3.getText();
        String valorSalario = (String)jTextField4.getText();
        String emailContato = (String)jTextField5.getText();
        String responVaga = (String)jTextField6.getText();
        double salario=Double.valueOf(valorSalario);
        double numVagas=Double.valueOf(vagas);
        //Exibição das informações inseridas
        
        System.out.println("Turno: "+turno);
        System.out.println("Estágio: "+estagio);
        System.out.println("Quantidade Vagas: "+numVagas);
        System.out.println("Vale Refeição: "+valeRefeicao);
        System.out.println("Vale Transporte: "+valeTransporte);
        System.out.println("Assistencia Médica: "+assisMedica);
        System.out.println("Asistencia Odontologica: "+assisOdonto);
        System.out.println("Fretamento: "+fretamento);
        System.out.println("Responsavel Pelo Cadastro: "+responCadastro);
        System.out.println("Empresa: "+empresa);
        System.out.println("Local da Empresa: "+localEmpresa);
        System.out.println("Valor da Bolsa/Auxilio: "+salario);
        System.out.println("E-Mail Contato Responsavel: "+emailContato);
        System.out.println("Responsavél Vagas: "+responVaga);
        
        cadastra.ouvidor(turno, estagio, numVagas, valeRefeicao, valeTransporte, assisMedica, assisOdonto, fretamento, responCadastro, empresa, localEmpresa, salario, emailContato, responVaga);
        JOptionPane.showMessageDialog(null, "Você acaba de efetuar o cadastro.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          jTextField2.setText("");
          jTextField3.setText("");
          jTextField4.setText("");
          jTextField5.setText("");
          jTextField6.setText("");
          jComboBox1.setSelectedItem("Selecione...");
          jComboBox3.setSelectedItem("Selecione...");
          jComboBox9.setSelectedItem("Selecione...");
          jComboBox4.setSelectedItem("Selecione...");
          jComboBox5.setSelectedItem("Selecione...");
          jComboBox6.setSelectedItem("Selecione...");
          jComboBox7.setSelectedItem("Selecione...");
          jComboBox8.setSelectedItem("Selecione...");
          jComboBox10.setSelectedItem("Selecione...");
          JOptionPane.showMessageDialog(null, "Você limpou os campos.");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed

    }//GEN-LAST:event_jComboBox7ActionPerformed

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
            java.util.logging.Logger.getLogger(InsersaoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsersaoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsersaoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsersaoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsersaoCadastro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}