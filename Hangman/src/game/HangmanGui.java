/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author chris
 */
public class HangmanGui extends javax.swing.JFrame {
    
    private String word;
    private char[] guessAry;
    private ImageIcon[] gallows;
    private int numWrong;
    /**
     * Creates new form HangmanGui
     */
    public HangmanGui() {
        gallows = new ImageIcon[5];
        gallows[0] = new javax.swing.ImageIcon(getClass().getResource("/images/Gallows0.png"));
        gallows[1] = new javax.swing.ImageIcon(getClass().getResource("/images/Gallows1.png"));
        gallows[2] = new javax.swing.ImageIcon(getClass().getResource("/images/Gallows2.png"));
        gallows[3] = new javax.swing.ImageIcon(getClass().getResource("/images/Gallows3.png"));
        gallows[4] = new javax.swing.ImageIcon(getClass().getResource("/images/Gallows4.png"));
        numWrong = 0;
        word = "cat";
        guessAry = new char[word.length()*2];
        for(int i = 0; i < guessAry.length; i++){
            guessAry[i] = '_';
            i++;
            guessAry[i] = ' ';
        }
        
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

        Title = new javax.swing.JLabel();
        usedLabel = new javax.swing.JLabel();
        used = new javax.swing.JLabel();
        guessField = new javax.swing.JTextField();
        guessButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        gallowsImg = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        guessLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Hangman");

        usedLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usedLabel.setText("Letters Used:");
        usedLabel.setToolTipText("");

        used.setText(" ");

        guessField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guessField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessFieldActionPerformed(evt);
            }
        });

        guessButton.setText("Guess");
        guessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButtonActionPerformed(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(240, 0, 0));

        gallowsImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gallows0.png"))); // NOI18N

        resultLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        guessLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guessLabel.setText(new String(guessAry));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gallowsImg)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(guessLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(guessField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guessButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usedLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(used, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gallowsImg)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(guessField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(guessButton))
                            .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(used, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guessLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButtonActionPerformed
        
        if(guessField.getText().length() == 1){
            if(!(used.getText().contains(guessField.getText()))){
                if(guessField.getText().charAt(0) >= 97 && guessField.getText().charAt(0) <= 122){
                    if(!(word.contains(guessField.getText()))){
                        if(!checkLose()){
                            numWrong++;
                            gallowsImg.setIcon(gallows[numWrong]);
                        }else{
                            numWrong++;
                            gallowsImg.setIcon(gallows[numWrong]);
                            resultLabel.setForeground(Color.RED);
                            resultLabel.setText("YOU LOSE");
                            guessField.setEnabled(false);
                            guessButton.setEnabled(false);
                            guessButton.setText("SORRY");
                        }
                    }else{
                        fillWord(guessField.getText().charAt(0));
                        guessLabel.setText(new String(guessAry));
                        if(checkWin()){
                            resultLabel.setForeground(Color.GREEN.darker());
                            resultLabel.setText("YOU WIN");
                            guessField.setEnabled(false);
                            guessButton.setEnabled(false);
                            guessButton.setText("YAY");
                        }

                    }
                    used.setText(used.getText() + " " + guessField.getText()); //add guess to the used label
                    guessField.setText("");//reset the guess field
                    errorLabel.setText("");
                }else{
                    guessField.setText("");
                    errorLabel.setText("Lower case letters only please");
                }
            }else{
                guessField.setText("");
                errorLabel.setText("You have already guessed that");
            }
        }else{
            guessField.setText("");
            errorLabel.setText("Please enter only one character");
            
        }
    }//GEN-LAST:event_guessButtonActionPerformed

    private void guessFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessFieldActionPerformed
       if(guessField.getText().length() == 1){
            if(!(used.getText().contains(guessField.getText()))){
                if(guessField.getText().charAt(0) >= 97 && guessField.getText().charAt(0) <= 122){
                    if(!(word.contains(guessField.getText()))){
                        if(!checkLose()){
                            numWrong++;
                            gallowsImg.setIcon(gallows[numWrong]);
                        }else{
                            numWrong++;
                            gallowsImg.setIcon(gallows[numWrong]);
                            resultLabel.setForeground(Color.RED);
                            resultLabel.setText("YOU LOSE");
                            guessField.setEnabled(false);
                            guessButton.setEnabled(false);
                            guessButton.setText("SORRY");
                        }
                    }else{
                        fillWord(guessField.getText().charAt(0));
                        guessLabel.setText(new String(guessAry));
                        if(checkWin()){
                            resultLabel.setForeground(Color.GREEN.darker());
                            resultLabel.setText("YOU WIN");
                            guessField.setEnabled(false);
                            guessButton.setEnabled(false);
                            guessButton.setText("YAY");
                        }

                    }
                    used.setText(used.getText() + " " + guessField.getText()); //add guess to the used label
                    guessField.setText("");//reset the guess field
                    errorLabel.setText("");
                }else{
                    guessField.setText("");
                    errorLabel.setText("Lower case letters only please");
                }
            }else{
                guessField.setText("");
                errorLabel.setText("You have already guessed that");
            }
        }else{
            guessField.setText("");
            errorLabel.setText("Please enter only one character");
            
        }
    }//GEN-LAST:event_guessFieldActionPerformed
    
    private void fillWord(char guess){
        for(int i = 0; i < word.length(); i++){
            if(guess == word.charAt(i)){
                guessAry[i*2] = guess;
            }
        }
        
    }
    
    private boolean checkLose(){
        boolean hasLost = false;
        if(numWrong > 2){
            hasLost = true;
        }
        return hasLost;
    }
    
    private boolean checkWin(){
        boolean hasWon = true;
        for(int i = 0; i < guessAry.length; i++){
            if(!(guessAry[i] == word.charAt(i/2))){
                hasWon = false;                
            }
            i++;
        }
        return hasWon;
    }
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
            java.util.logging.Logger.getLogger(HangmanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HangmanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HangmanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HangmanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HangmanGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel gallowsImg;
    private javax.swing.JButton guessButton;
    private javax.swing.JTextField guessField;
    private javax.swing.JLabel guessLabel;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel used;
    private javax.swing.JLabel usedLabel;
    // End of variables declaration//GEN-END:variables
}
