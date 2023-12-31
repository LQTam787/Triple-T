/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TripleT;

import Board.Board;
import javax.swing.JOptionPane;

/**
 *
 * @author lqtam
 */
public class TripleT extends javax.swing.JFrame {
    /**
     *
     */
    protected Board board;
    /**
     *
     */
    protected String player;

    /**
     * Creates new form TripleT
     */
    public TripleT() {
        this.player = "X";
        this.board = new Board();
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

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Board = new javax.swing.JPanel();
        Pos0 = new javax.swing.JButton();
        Pos1 = new javax.swing.JButton();
        Pos2 = new javax.swing.JButton();
        Pos3 = new javax.swing.JButton();
        Pos4 = new javax.swing.JButton();
        Pos5 = new javax.swing.JButton();
        Pos6 = new javax.swing.JButton();
        Pos7 = new javax.swing.JButton();
        Pos8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(8388607, 8388607));

        Title.setBackground(new java.awt.Color(0, 0, 0));
        Title.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Triple T");
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Title.setMaximumSize(new java.awt.Dimension(32767, 32767));
        Title.setMinimumSize(new java.awt.Dimension(190, 63));
        Title.setPreferredSize(new java.awt.Dimension(190, 63));

        Board.setBackground(new java.awt.Color(255, 255, 255));
        Board.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Board.setMinimumSize(new java.awt.Dimension(360, 360));

        Pos0.setBackground(new java.awt.Color(0, 0, 0));
        Pos0.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Pos0.setForeground(new java.awt.Color(255, 255, 255));
        Pos0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pos0.setMaximumSize(new java.awt.Dimension(2047, 2047));
        Pos0.setMinimumSize(new java.awt.Dimension(112, 112));
        Pos0.setName("Position 0"); // NOI18N
        Pos0.setPreferredSize(new java.awt.Dimension(112, 112));
        Pos0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos0ActionPerformed(evt);
            }
        });

        Pos1.setBackground(new java.awt.Color(0, 0, 0));
        Pos1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Pos1.setForeground(new java.awt.Color(255, 255, 255));
        Pos1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pos1.setMaximumSize(new java.awt.Dimension(2047, 2047));
        Pos1.setMinimumSize(new java.awt.Dimension(112, 112));
        Pos1.setName("Position 1"); // NOI18N
        Pos1.setPreferredSize(new java.awt.Dimension(112, 112));
        Pos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos1ActionPerformed(evt);
            }
        });

        Pos2.setBackground(new java.awt.Color(0, 0, 0));
        Pos2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Pos2.setForeground(new java.awt.Color(255, 255, 255));
        Pos2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pos2.setMaximumSize(new java.awt.Dimension(2047, 2047));
        Pos2.setMinimumSize(new java.awt.Dimension(112, 112));
        Pos2.setName("Position 2"); // NOI18N
        Pos2.setPreferredSize(new java.awt.Dimension(112, 112));
        Pos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos2ActionPerformed(evt);
            }
        });

        Pos3.setBackground(new java.awt.Color(0, 0, 0));
        Pos3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Pos3.setForeground(new java.awt.Color(255, 255, 255));
        Pos3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pos3.setMaximumSize(new java.awt.Dimension(2047, 2047));
        Pos3.setMinimumSize(new java.awt.Dimension(112, 112));
        Pos3.setName("Position 3"); // NOI18N
        Pos3.setPreferredSize(new java.awt.Dimension(112, 112));
        Pos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos3ActionPerformed(evt);
            }
        });

        Pos4.setBackground(new java.awt.Color(0, 0, 0));
        Pos4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Pos4.setForeground(new java.awt.Color(255, 255, 255));
        Pos4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pos4.setMaximumSize(new java.awt.Dimension(2047, 2047));
        Pos4.setMinimumSize(new java.awt.Dimension(112, 112));
        Pos4.setName("Position 4"); // NOI18N
        Pos4.setPreferredSize(new java.awt.Dimension(112, 112));
        Pos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos4ActionPerformed(evt);
            }
        });

        Pos5.setBackground(new java.awt.Color(0, 0, 0));
        Pos5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Pos5.setForeground(new java.awt.Color(255, 255, 255));
        Pos5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pos5.setMaximumSize(new java.awt.Dimension(2047, 2047));
        Pos5.setMinimumSize(new java.awt.Dimension(112, 112));
        Pos5.setName("Position 5"); // NOI18N
        Pos5.setPreferredSize(new java.awt.Dimension(112, 112));
        Pos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos5ActionPerformed(evt);
            }
        });

        Pos6.setBackground(new java.awt.Color(0, 0, 0));
        Pos6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Pos6.setForeground(new java.awt.Color(255, 255, 255));
        Pos6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pos6.setMaximumSize(new java.awt.Dimension(2047, 2047));
        Pos6.setMinimumSize(new java.awt.Dimension(112, 112));
        Pos6.setName("Position 6"); // NOI18N
        Pos6.setPreferredSize(new java.awt.Dimension(112, 112));
        Pos6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos6ActionPerformed(evt);
            }
        });

        Pos7.setBackground(new java.awt.Color(0, 0, 0));
        Pos7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Pos7.setForeground(new java.awt.Color(255, 255, 255));
        Pos7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pos7.setMaximumSize(new java.awt.Dimension(2047, 2047));
        Pos7.setMinimumSize(new java.awt.Dimension(112, 112));
        Pos7.setName("Position 7"); // NOI18N
        Pos7.setPreferredSize(new java.awt.Dimension(112, 112));
        Pos7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos7ActionPerformed(evt);
            }
        });

        Pos8.setBackground(new java.awt.Color(0, 0, 0));
        Pos8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Pos8.setForeground(new java.awt.Color(255, 255, 255));
        Pos8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pos8.setMaximumSize(new java.awt.Dimension(2047, 2047));
        Pos8.setMinimumSize(new java.awt.Dimension(112, 112));
        Pos8.setName("Position 8"); // NOI18N
        Pos8.setPreferredSize(new java.awt.Dimension(112, 112));
        Pos8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BoardLayout = new javax.swing.GroupLayout(Board);
        Board.setLayout(BoardLayout);
        BoardLayout.setHorizontalGroup(
            BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BoardLayout.createSequentialGroup()
                        .addComponent(Pos0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Pos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BoardLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(Pos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BoardLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(Pos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Pos6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BoardLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(Pos7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BoardLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(Pos8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BoardLayout.setVerticalGroup(
            BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BoardLayout.createSequentialGroup()
                        .addComponent(Pos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pos8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BoardLayout.createSequentialGroup()
                        .addComponent(Pos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pos7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BoardLayout.createSequentialGroup()
                        .addComponent(Pos0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pos6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Board, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Board, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Board.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Pos0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos0ActionPerformed
        // TODO add your handling code here:
        if (board.validMove(0)) {
            board.move(0, player);
            Pos0.setText(player);

            if (player.equals("X")) {
                player = "O";
            } else {
                player = "X";
            }

            switch (board.checkWin()) {
                case 1 -> JOptionPane.showMessageDialog(this, "X WINS! GAME OVER YEAH!!!");
                case 2 -> JOptionPane.showMessageDialog(this, "O WINS! GAME OVER YEAH!!!");
                case 3 -> JOptionPane.showMessageDialog(this, "A DRAW! GAME OVER YEAH!!!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid move.");
        }
    }//GEN-LAST:event_Pos0ActionPerformed

    private void Pos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos1ActionPerformed
        // TODO add your handling code here:
        if (board.validMove(1)) {
            board.move(1, player);
            Pos1.setText(player);

            if (player.equals("X")) {
                player = "O";
            } else {
                player = "X";
            }

            switch (board.checkWin()) {
                case 1 -> JOptionPane.showMessageDialog(this, "X WINS! GAME OVER YEAH!!!");
                case 2 -> JOptionPane.showMessageDialog(this, "O WINS! GAME OVER YEAH!!!");
                case 3 -> JOptionPane.showMessageDialog(this, "A DRAW! GAME OVER YEAH!!!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid move.");
        }
    }//GEN-LAST:event_Pos1ActionPerformed

    private void Pos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos2ActionPerformed
        // TODO add your handling code here:
        if (board.validMove(2)) {
            board.move(2, player);
            Pos2.setText(player);

            if (player.equals("X")) {
                player = "O";
            } else {
                player = "X";
            }

            switch (board.checkWin()) {
                case 1 -> JOptionPane.showMessageDialog(this, "X WINS! GAME OVER YEAH!!!");
                case 2 -> JOptionPane.showMessageDialog(this, "O WINS! GAME OVER YEAH!!!");
                case 3 -> JOptionPane.showMessageDialog(this, "A DRAW! GAME OVER YEAH!!!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid move.");
        }
    }//GEN-LAST:event_Pos2ActionPerformed

    private void Pos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos3ActionPerformed
        // TODO add your handling code here:
        if (board.validMove(3)) {
            board.move(3, player);
            Pos3.setText(player);

            if (player.equals("X")) {
                player = "O";
            } else {
                player = "X";
            }

            switch (board.checkWin()) {
                case 1 -> JOptionPane.showMessageDialog(this, "X WINS! GAME OVER YEAH!!!");
                case 2 -> JOptionPane.showMessageDialog(this, "O WINS! GAME OVER YEAH!!!");
                case 3 -> JOptionPane.showMessageDialog(this, "A DRAW! GAME OVER YEAH!!!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid move.");
        }
    }//GEN-LAST:event_Pos3ActionPerformed

    private void Pos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos4ActionPerformed
        // TODO add your handling code here:
        if (board.validMove(4)) {
            board.move(4, player);
            Pos4.setText(player);

            if (player.equals("X")) {
                player = "O";
            } else {
                player = "X";
            }

            switch (board.checkWin()) {
                case 1 -> JOptionPane.showMessageDialog(this, "X WINS! GAME OVER YEAH!!!");
                case 2 -> JOptionPane.showMessageDialog(this, "O WINS! GAME OVER YEAH!!!");
                case 3 -> JOptionPane.showMessageDialog(this, "A DRAW! GAME OVER YEAH!!!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid move.");
        }
    }//GEN-LAST:event_Pos4ActionPerformed

    private void Pos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos5ActionPerformed
        // TODO add your handling code here:
        if (board.validMove(5)) {
            board.move(5, player);
            Pos5.setText(player);

            if (player.equals("X")) {
                player = "O";
            } else {
                player = "X";
            }

            switch (board.checkWin()) {
                case 1 -> JOptionPane.showMessageDialog(this, "X WINS! GAME OVER YEAH!!!");
                case 2 -> JOptionPane.showMessageDialog(this, "O WINS! GAME OVER YEAH!!!");
                case 3 -> JOptionPane.showMessageDialog(this, "A DRAW! GAME OVER YEAH!!!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid move.");
        }
    }//GEN-LAST:event_Pos5ActionPerformed

    private void Pos6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos6ActionPerformed
        // TODO add your handling code here:
        if (board.validMove(6)) {
            board.move(6, player);
            Pos6.setText(player);

            if (player.equals("X")) {
                player = "O";
            } else {
                player = "X";
            }

            switch (board.checkWin()) {
                case 1 -> JOptionPane.showMessageDialog(this, "X WINS! GAME OVER YEAH!!!");
                case 2 -> JOptionPane.showMessageDialog(this, "O WINS! GAME OVER YEAH!!!");
                case 3 -> JOptionPane.showMessageDialog(this, "A DRAW! GAME OVER YEAH!!!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid move.");
        }
    }//GEN-LAST:event_Pos6ActionPerformed

    private void Pos7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos7ActionPerformed
        // TODO add your handling code here:
        if (board.validMove(7)) {
            board.move(7, player);
            Pos7.setText(player);

            if (player.equals("X")) {
                player = "O";
            } else {
                player = "X";
            }

            switch (board.checkWin()) {
                case 1 -> JOptionPane.showMessageDialog(this, "X WINS! GAME OVER YEAH!!!");
                case 2 -> JOptionPane.showMessageDialog(this, "O WINS! GAME OVER YEAH!!!");
                case 3 -> JOptionPane.showMessageDialog(this, "A DRAW! GAME OVER YEAH!!!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid move.");
        }
    }//GEN-LAST:event_Pos7ActionPerformed

    private void Pos8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos8ActionPerformed
        // TODO add your handling code here:
        if (board.validMove(8)) {
            board.move(8, player);
            Pos8.setText(player);

            if (player.equals("X")) {
                player = "O";
            } else {
                player = "X";
            }

            switch (board.checkWin()) {
                case 1 -> JOptionPane.showMessageDialog(this, "X WINS! GAME OVER YEAH!!!");
                case 2 -> JOptionPane.showMessageDialog(this, "O WINS! GAME OVER YEAH!!!");
                case 3 -> JOptionPane.showMessageDialog(this, "A DRAW! GAME OVER YEAH!!!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid move.");
        }
    }//GEN-LAST:event_Pos8ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TripleT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TripleT().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JPanel Board;
    protected javax.swing.JButton Pos0;
    protected javax.swing.JButton Pos1;
    protected javax.swing.JButton Pos2;
    protected javax.swing.JButton Pos3;
    protected javax.swing.JButton Pos4;
    protected javax.swing.JButton Pos5;
    protected javax.swing.JButton Pos6;
    protected javax.swing.JButton Pos7;
    protected javax.swing.JButton Pos8;
    protected javax.swing.JLabel Title;
    protected javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
