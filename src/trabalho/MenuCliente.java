package trabalho;

import java.sql.*;
public class MenuCliente extends javax.swing.JFrame {
    Connection conMC = null;
    public MenuCliente(Connection con){
        initComponents();
        this.conMC = con;
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        layoutUPDATE = new javax.swing.JTabbedPane();
        layoutSELECT = new javax.swing.JLayeredPane();
        btnPesquisar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaSelect = new javax.swing.JTextArea();
        lblErroSelect = new javax.swing.JLabel();
        txtQuery = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        layoutINSERT = new javax.swing.JLayeredPane();
        txtSal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaInsert = new javax.swing.JTextArea();
        btnInserir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblErroInsert = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        layoutDELETE = new javax.swing.JLayeredPane();
        txtNum = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblErroDelete = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaDelete = new javax.swing.JTextArea();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaUpdate = new javax.swing.JTextArea();
        txtQuery1 = new javax.swing.JTextField();
        btnAtualiza = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblErro1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtQuery2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblErroUpdate = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LUCAS-DBPostgreSQL");
        setPreferredSize(new java.awt.Dimension(550, 600));
        setResizable(false);

        layoutUPDATE.setBackground(new java.awt.Color(0, 102, 102));
        layoutUPDATE.setOpaque(true);

        layoutSELECT.setBackground(new java.awt.Color(0, 153, 153));
        layoutSELECT.setOpaque(true);
        layoutSELECT.setPreferredSize(new java.awt.Dimension(521, 400));

        btnPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(0, 102, 102));
        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPesquisar.setPreferredSize(new java.awt.Dimension(120, 35));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("QUERY:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("PESQUISAR POR CLIENTES CADASTRADOS");

        txtAreaSelect.setColumns(3);
        txtAreaSelect.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAreaSelect.setRows(5);
        txtAreaSelect.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane2.setViewportView(txtAreaSelect);

        lblErroSelect.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblErroSelect.setForeground(new java.awt.Color(255, 0, 0));

        txtQuery.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQueryActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("MSG:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("SELECT * FROM");

        layoutSELECT.setLayer(btnPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutSELECT.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutSELECT.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutSELECT.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutSELECT.setLayer(lblErroSelect, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutSELECT.setLayer(txtQuery, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutSELECT.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutSELECT.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layoutSELECTLayout = new javax.swing.GroupLayout(layoutSELECT);
        layoutSELECT.setLayout(layoutSELECTLayout);
        layoutSELECTLayout.setHorizontalGroup(
            layoutSELECTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutSELECTLayout.createSequentialGroup()
                .addGroup(layoutSELECTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layoutSELECTLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layoutSELECTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layoutSELECTLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layoutSELECTLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layoutSELECTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layoutSELECTLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblErroSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layoutSELECTLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layoutSELECTLayout.setVerticalGroup(
            layoutSELECTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutSELECTLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layoutSELECTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layoutSELECTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblErroSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        layoutUPDATE.addTab("SELECT", layoutSELECT);

        layoutINSERT.setBackground(new java.awt.Color(0, 153, 102));
        layoutINSERT.setOpaque(true);

        txtSal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NOME:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("SALÁRIO:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("CADASTRAR UM NOVO CLIENTE");

        txtAreaInsert.setColumns(20);
        txtAreaInsert.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAreaInsert.setRows(5);
        txtAreaInsert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane3.setViewportView(txtAreaInsert);

        btnInserir.setBackground(new java.awt.Color(255, 255, 255));
        btnInserir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInserir.setForeground(new java.awt.Color(0, 102, 102));
        btnInserir.setText("INSERIR");
        btnInserir.setPreferredSize(new java.awt.Dimension(120, 35));
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MSG:");

        lblErroInsert.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblErroInsert.setForeground(new java.awt.Color(204, 0, 0));

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        layoutINSERT.setLayer(txtSal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutINSERT.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutINSERT.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutINSERT.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutINSERT.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutINSERT.setLayer(btnInserir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutINSERT.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutINSERT.setLayer(lblErroInsert, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutINSERT.setLayer(txtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layoutINSERTLayout = new javax.swing.GroupLayout(layoutINSERT);
        layoutINSERT.setLayout(layoutINSERTLayout);
        layoutINSERTLayout.setHorizontalGroup(
            layoutINSERTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutINSERTLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layoutINSERTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layoutINSERTLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblErroInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layoutINSERTLayout.createSequentialGroup()
                        .addGroup(layoutINSERTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
                            .addGroup(layoutINSERTLayout.createSequentialGroup()
                                .addGroup(layoutINSERTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layoutINSERTLayout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addComponent(jLabel7))
                                    .addGroup(layoutINSERTLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layoutINSERTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layoutINSERTLayout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtSal, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 39, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))))
        );
        layoutINSERTLayout.setVerticalGroup(
            layoutINSERTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutINSERTLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layoutINSERTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layoutINSERTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layoutINSERTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblErroInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        layoutUPDATE.addTab("INSERT", layoutINSERT);

        layoutDELETE.setBackground(new java.awt.Color(255, 153, 0));
        layoutDELETE.setAutoscrolls(true);
        layoutDELETE.setOpaque(true);

        txtNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 153, 0));
        btnDelete.setText("DELETAR");
        btnDelete.setPreferredSize(new java.awt.Dimension(120, 35));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("MSG:");

        lblErroDelete.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblErroDelete.setForeground(new java.awt.Color(255, 0, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("DELETAR CLIENTE CADASTRADO");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("NÚMERO:");

        txtAreaDelete.setColumns(20);
        txtAreaDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAreaDelete.setRows(5);
        txtAreaDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane4.setViewportView(txtAreaDelete);

        layoutDELETE.setLayer(txtNum, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutDELETE.setLayer(btnDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutDELETE.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutDELETE.setLayer(lblErroDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutDELETE.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutDELETE.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layoutDELETE.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layoutDELETELayout = new javax.swing.GroupLayout(layoutDELETE);
        layoutDELETE.setLayout(layoutDELETELayout);
        layoutDELETELayout.setHorizontalGroup(
            layoutDELETELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutDELETELayout.createSequentialGroup()
                .addGroup(layoutDELETELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layoutDELETELayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layoutDELETELayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layoutDELETELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layoutDELETELayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblErroDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layoutDELETELayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layoutDELETELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layoutDELETELayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layoutDELETELayout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))))
        );
        layoutDELETELayout.setVerticalGroup(
            layoutDELETELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutDELETELayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layoutDELETELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layoutDELETELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblErroDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        layoutUPDATE.addTab("DELETE", layoutDELETE);

        jLayeredPane1.setBackground(new java.awt.Color(204, 204, 0));
        jLayeredPane1.setOpaque(true);

        txtAreaUpdate.setColumns(20);
        txtAreaUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAreaUpdate.setRows(5);
        txtAreaUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane1.setViewportView(txtAreaUpdate);

        txtQuery1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQuery1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuery1ActionPerformed(evt);
            }
        });

        btnAtualiza.setBackground(new java.awt.Color(255, 255, 255));
        btnAtualiza.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAtualiza.setForeground(new java.awt.Color(102, 102, 0));
        btnAtualiza.setText("Atualizar");
        btnAtualiza.setPreferredSize(new java.awt.Dimension(120, 35));
        btnAtualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("QUERY:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("UPDATE DE CLIENTE");

        lblErro1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblErro1.setForeground(new java.awt.Color(255, 0, 0));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("MSG:");

        txtQuery2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQuery2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuery2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("UPDATE CLIENTE SET");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText(" WHERE NUMERO = ");

        lblErroUpdate.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblErroUpdate.setForeground(new java.awt.Color(255, 0, 0));

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtQuery1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnAtualiza, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblErro1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtQuery2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblErroUpdate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(8, 8, 8)
                                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtQuery2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel14)
                                            .addComponent(txtQuery1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32))
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblErroUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(31, 31, 31)))
                                .addComponent(lblErro1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel12))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(btnAtualiza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtQuery1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuery2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualiza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(lblErro1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblErroUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );

        layoutUPDATE.addTab("UPDATE", jLayeredPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutUPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutUPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
            lblErroDelete.setText("");
            txtAreaDelete.setText("");

            PreparedStatement pstmtDelete = conMC.prepareStatement("DELETE FROM CLIENTE WHERE NUMERO = ?");
            int num = Integer.parseInt(txtNum.getText());
            pstmtDelete.setInt(1, num);
            int fail = pstmtDelete.executeUpdate();
            pstmtDelete.close();
            if(fail==0){
                lblErroDelete.setText("Falha na exclusão!");
            }else{
                lblErroDelete.setText("Sucesso na exclusão do número "+num+".");
            }

        }catch(SQLException ex3){
            lblErroDelete.setText(ex3.getMessage());
        }
        
        try{
            PreparedStatement pstmtDeleteSelect = conMC.prepareStatement("SELECT * FROM CLIENTE");
            ResultSet rsDeleteSelect = pstmtDeleteSelect.executeQuery();
            ResultSetMetaData rsmdDeleteSelect = rsDeleteSelect.getMetaData();
            while(rsDeleteSelect.next()){
                for(int i=1;i<=rsmdDeleteSelect.getColumnCount();i++){
                    txtAreaDelete.append(rsmdDeleteSelect.getColumnName(i).toUpperCase()+" = "+rsDeleteSelect.getString(i)+" ");
                }
                txtAreaDelete.append("\n");
            }
            rsDeleteSelect.close();
        } catch (SQLException ex) {
            lblErroDelete.setText(ex.getMessage());
        }catch(Exception ex2){
            lblErroDelete.setText(ex2.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        lblErroInsert.setText("");
        txtAreaInsert.setText("");
        try{
            int proxLinha;
            PreparedStatement pstmtNextSeq = conMC.prepareStatement("select nextval('CLIENTE_SEQ') as cliente"); 
            ResultSet rsNextSeq = pstmtNextSeq.executeQuery();
            rsNextSeq.next();
            proxLinha = rsNextSeq.getInt(1); /*proxima linha da sequence no sgbd*/

            int validaInsert;
            PreparedStatement pstmtInsert = conMC.prepareStatement("INSERT INTO CLIENTE VALUES(?, ?, ?)");
            pstmtInsert.setInt(1, proxLinha);
            pstmtInsert.setString(2, txtNome.getText().toUpperCase());
            pstmtInsert.setDouble(3, Double.parseDouble(txtSal.getText()));
            validaInsert = pstmtInsert.executeUpdate();
            
            if(validaInsert == 0){
                lblErroInsert.setText("Falha no insert");
            }else{
                lblErroInsert.setText("Dados inseridos com sucesso na linha "+proxLinha+"!");
            }

            PreparedStatement pstmtSelect = conMC.prepareStatement("SELECT * FROM CLIENTE");
            ResultSet rsSelect = pstmtSelect.executeQuery();
                while(rsSelect.next()){
                    txtAreaInsert.append("NÚMERO: "+rsSelect.getInt(1)
                                    +" - NOME: "+rsSelect.getString(2)
                                    +" - SALÁRIO: "+rsSelect.getDouble(3)+"\n");
                }
        }catch(SQLException e){
            lblErroInsert.setText(e.getMessage());
        }catch(NumberFormatException e2){
            lblErroInsert.setText(e2.getMessage());
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void txtQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQueryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQueryActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        lblErroSelect.setText("");
        txtAreaSelect.setText("");
        try{
            String select = "SELECT * FROM "+txtQuery.getText();
            PreparedStatement pstmt = conMC.prepareStatement(select);
            ResultSet rsSelect = pstmt.executeQuery();
            ResultSetMetaData rsmdSelect = rsSelect.getMetaData();
            while(rsSelect.next()){
                for(int i=1;i<=rsmdSelect.getColumnCount();i++){
                    txtAreaSelect.append("  "+rsmdSelect.getColumnName(i).toUpperCase()+" = "+rsSelect.getString(i));
                }
                txtAreaSelect.append(".\n");
            }
            rsSelect.close();
        }catch(SQLException e){
            System.err.println(e.getMessage());
            lblErroSelect.setText(e.getMessage());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtQuery1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuery1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuery1ActionPerformed

    private void btnAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaActionPerformed
        // TODO add your handling code here:
        Connection conUpdate = null;
        txtAreaUpdate.setText("");
        lblErroUpdate.setText("");
        try{
            String query = "UPDATE CLIENTE SET "+txtQuery1.getText().toUpperCase()+" WHERE NUMERO = "+txtQuery2.getText()+";";
            //String query = UPDATE CLIENTE SET NOME = 'LUCAS RAMOS FERNANDES' WHERE NUMERO = 30;
            PreparedStatement pstmtUpdate = conMC.prepareStatement(query);
            int num = pstmtUpdate.executeUpdate();
            if(num == 0){
                lblErroUpdate.setText("Não foi atualizado!");
            }else{
                lblErroUpdate.setText("Foi atualizado");
            }

            PreparedStatement pstmtS = conMC.prepareStatement("select * from cliente");
            ResultSet rsUpdate = pstmtS.executeQuery();
            while(rsUpdate.next()){
                txtAreaUpdate.append("NÚMERO: "+rsUpdate.getInt(1)
                    +" NOME: "+rsUpdate.getString(2)
                    +" SALÁRIO: "+rsUpdate.getDouble(3)+"\n");
            }
        }catch(SQLException e){
            lblErroUpdate.setText(e.getMessage());
        }

    }//GEN-LAST:event_btnAtualizaActionPerformed

    private void txtQuery2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuery2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuery2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new MenuCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualiza;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLayeredPane layoutDELETE;
    private javax.swing.JLayeredPane layoutINSERT;
    private javax.swing.JLayeredPane layoutSELECT;
    private javax.swing.JTabbedPane layoutUPDATE;
    private javax.swing.JLabel lblErro1;
    private javax.swing.JLabel lblErroDelete;
    private javax.swing.JLabel lblErroInsert;
    private javax.swing.JLabel lblErroSelect;
    private javax.swing.JLabel lblErroUpdate;
    private javax.swing.JTextArea txtAreaDelete;
    private javax.swing.JTextArea txtAreaInsert;
    private javax.swing.JTextArea txtAreaSelect;
    private javax.swing.JTextArea txtAreaUpdate;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtQuery;
    private javax.swing.JTextField txtQuery1;
    private javax.swing.JTextField txtQuery2;
    private javax.swing.JTextField txtSal;
    // End of variables declaration//GEN-END:variables
}
