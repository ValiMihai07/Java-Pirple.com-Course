/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author valim
 */
public class Game extends javax.swing.JFrame {

    private String choice = new String("X");
    private int choiceCount = 0 ;
    
    
    public Game() {
        initComponents();
        setSize(600 , 600);
        setLocationRelativeTo(null);
    }

    private void Reverse ()
    {
        if(choice.equalsIgnoreCase("X"))
        {
            choice = "O";
        }
        else
        {
            choice = "X";
        }
        choiceCount++;
    }
    
    private void ChoiceReset()
    {
        choiceCount = 0;
    }
    
    private void Reset()
    {
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
    }
    
    
    private void WinGame()
    {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        
        if(b1.equalsIgnoreCase("X") && b1.equals(b2) && b2.equals(b3))
        {
            JOptionPane.showMessageDialog(this, b1 + " has won!" );
            if( choice.equalsIgnoreCase("O"))
            {
                choice="X";
            }
            Reset();
            ChoiceReset();
            
        }
        else if(b1.equalsIgnoreCase("X") && b1.equals(b6) && b6.equals(b9))
        {
            JOptionPane.showMessageDialog(this, b1 + " has won!");
            if( choice.equalsIgnoreCase("O"))
            {
                choice="X";
            }
            Reset();
            ChoiceReset();
        }
        else if(b2.equalsIgnoreCase("X") && b2.equals(b5) && b5.equals(b8))
        {
            JOptionPane.showMessageDialog(this, b2 + " has won!");
            if( choice.equalsIgnoreCase("O"))
            {
                choice="X";
            }
            Reset();
            ChoiceReset();
        }
        else if(b3.equalsIgnoreCase("X") && b3.equals(b7) && b7.equals(b4))
        {
            JOptionPane.showMessageDialog(this, b3 + " has won!");
            if( choice.equalsIgnoreCase("O"))
            {
                choice="X";
            }
            Reset();
            ChoiceReset();
        }
        else if(b6.equalsIgnoreCase("X") && b6.equals(b5) && b5.equals(b4))
        {
            JOptionPane.showMessageDialog(this, b6 + " has won!");
            if( choice.equalsIgnoreCase("O"))
            {
                choice="X";
            }
            Reset();
            ChoiceReset();
        }
        else if(b9.equalsIgnoreCase("X") && b9.equals(b8) && b8.equals(b7))
        {
            JOptionPane.showMessageDialog(this, b9 + " has won!");
            if( choice.equalsIgnoreCase("O"))
            {
                choice="X";
            }
            Reset();
            ChoiceReset();
        }
        else if(b3.equalsIgnoreCase("X") && b3.equals(b5) && b5.equals(b9))
        {
            JOptionPane.showMessageDialog(this, b3 + " has won!");
            if( choice.equalsIgnoreCase("O"))
            {
                choice="X";
            }
            Reset();
            ChoiceReset();
        }
        else if(b1.equalsIgnoreCase("X") && b1.equals(b5) && b5.equals(b7))
        {
            JOptionPane.showMessageDialog(this, b1 + " has won!");
            if( choice.equalsIgnoreCase("O"))
            {
                choice="X";
            }
            Reset();
            ChoiceReset();
        }
        else if(b1.equalsIgnoreCase("O") && b1.equals(b2) && b2.equals(b3))
        {
            JOptionPane.showMessageDialog(this, b1 + " has won!" );
            if( choice.equalsIgnoreCase("O"))
            {
                choice="X";
            }
            Reset();
            ChoiceReset();
        }
        else if(b1.equalsIgnoreCase("O") && b1.equals(b6) && b6.equals(b9))
        {
            JOptionPane.showMessageDialog(this, b1 + " has won!");
            if( choice.equalsIgnoreCase("O"))
            {
                choice="X";
            }
            Reset();
            ChoiceReset();
        }
        else if(b2.equalsIgnoreCase("O") && b2.equals(b5) && b5.equals(b8))
        {
            JOptionPane.showMessageDialog(this, b2 + " has won!");
            if( choice.equalsIgnoreCase("O"))
            {
                choice="X";
            }
            Reset();
            ChoiceReset();
        }
        else if(b3.equalsIgnoreCase("O") && b3.equals(b7) && b7.equals(b4))
        {
            JOptionPane.showMessageDialog(this, b3 + " has won!");
            if( choice.equalsIgnoreCase("O"))
            {
                choice="X";
            }
            Reset();
            ChoiceReset();
        }
        else if(b6.equalsIgnoreCase("O") && b6.equals(b5) && b5.equals(b4))
        {
            JOptionPane.showMessageDialog(this, b6 + " has won!");
            if( choice.equalsIgnoreCase("O"))
            {
                choice="X";
            }
            Reset();
            ChoiceReset();
        }
        else if(b9.equalsIgnoreCase("O") && b9.equals(b8) && b8.equals(b7))
        {
            JOptionPane.showMessageDialog(this, b9 + " has won!");
            if( choice.equalsIgnoreCase("O"))
            {
                choice="X";
            }
            Reset();
            ChoiceReset();
        }
        else if(b3.equalsIgnoreCase("O") && b3.equals(b5) && b5.equals(b9))
        {
            JOptionPane.showMessageDialog(this, b3 + " has won!");
            if( choice.equalsIgnoreCase("O"))
            {
                choice="X";
            }
            Reset();
            ChoiceReset();
        }
        else if(b1.equalsIgnoreCase("O") && b1.equals(b5) && b5.equals(b7))
        {
            JOptionPane.showMessageDialog(this, b1 + " has won!");
            if( choice.equalsIgnoreCase("O"))
            {
                choice="X";
            }
            Reset();
            ChoiceReset();
        }
        else if( choiceCount == 9)
        {
            JOptionPane.showMessageDialog(this, " Cats game!");
            if( choice.equalsIgnoreCase("O"))
            {
                choice="X";
            }
            Reset();
            ChoiceReset(); 
        }
        
        
        
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
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");

        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 150)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 150)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 150)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 150)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 150)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 150)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Comic Sans MS", 1, 150)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel8);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Comic Sans MS", 1, 150)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel9);

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Comic Sans MS", 1, 150)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel10);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        jButton1.setText(choice);
        if(choice.equalsIgnoreCase("X"))
        {
            jButton1.setForeground(Color.RED);
        }
        else
        {
            jButton1.setForeground(Color.BLACK);
        }
        Reverse();
        WinGame();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        jButton7.setText(choice);
        if(choice.equalsIgnoreCase("X"))
        {
            jButton7.setForeground(Color.RED);
        }
        else
        {
            jButton7.setForeground(Color.BLACK);
        }
        Reverse();
        WinGame();
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        jButton2.setText(choice);
        if(choice.equalsIgnoreCase("X"))
        {
            jButton2.setForeground(Color.RED);
        }
        else
        {
            jButton2.setForeground(Color.BLACK);
        }
        Reverse();
        WinGame();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        jButton3.setText(choice);
        if(choice.equalsIgnoreCase("X"))
        {
            jButton3.setForeground(Color.RED);
        }
        else
        {
            jButton3.setForeground(Color.BLACK);
        }
        Reverse();
        WinGame();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        jButton6.setText(choice);
        if(choice.equalsIgnoreCase("X"))
        {
            jButton6.setForeground(Color.RED);
        }
        else
        {
            jButton6.setForeground(Color.BLACK);
        }
        Reverse();
        WinGame();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        jButton5.setText(choice);
        if(choice.equalsIgnoreCase("X"))
        {
            jButton5.setForeground(Color.RED);
        }
        else
        {
            jButton5.setForeground(Color.BLACK);
        }
        Reverse();
        WinGame();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        jButton4.setText(choice);
        if(choice.equalsIgnoreCase("X"))
        {
            jButton4.setForeground(Color.RED);
        }
        else
        {
            jButton4.setForeground(Color.BLACK);
        }
        Reverse();
        WinGame();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        jButton9.setText(choice);
        if(choice.equalsIgnoreCase("X"))
        {
            jButton9.setForeground(Color.RED);
        }
        else
        {
            jButton9.setForeground(Color.BLACK);
        }
        Reverse();
        WinGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        jButton8.setText(choice);
        if(choice.equalsIgnoreCase("X"))
        {
            jButton8.setForeground(Color.RED);
        }
        else
        {
            jButton8.setForeground(Color.BLACK);
        }
        Reverse();
        WinGame();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
