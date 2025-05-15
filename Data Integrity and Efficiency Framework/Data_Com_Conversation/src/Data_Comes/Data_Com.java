package Data_Comes;
import java.awt.event.KeyEvent;
import java.lang.Math; 
import java.util.*;
import java.io.*;

import javax.swing.JOptionPane;
public class Data_Com extends javax.swing.JFrame {
    String operation;
    String A;
    String B;
    private Object math;
    public Data_Com() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        reset = new javax.swing.JButton();
        convert = new javax.swing.JButton();
        result1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        s2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        s3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        result = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        s1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 0, 0));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset);
        reset.setBounds(460, 370, 160, 50);

        convert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        convert.setForeground(new java.awt.Color(0, 204, 51));
        convert.setText("CALCULATE");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });
        jPanel2.add(convert);
        convert.setBounds(270, 370, 170, 50);

        result1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        result1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result1ActionPerformed(evt);
            }
        });
        jPanel2.add(result1);
        result1.setBounds(110, 282, 330, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("OUTPUT :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 280, 100, 40);

        s2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });
        jPanel2.add(s2);
        s2.setBounds(110, 214, 330, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText(" INPUT -2:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 210, 100, 40);

        s3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });
        jPanel2.add(s3);
        s3.setBounds(570, 190, 300, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FLAG :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(500, 190, 70, 40);

        combobox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combobox.setForeground(new java.awt.Color(204, 0, 153));
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an Option", "Hamming Distance", "parity check", "Bit Stuffing", "Bit Destuffing", "Character Stuffing", "Character Destuffing" }));
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });
        jPanel2.add(combobox);
        combobox.setBounds(210, 90, 460, 40);

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA EIFICIENCY FRAMEWORK");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 10, 890, 60);

        result.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });
        jPanel2.add(result);
        result.setBounds(458, 282, 420, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText(" INPUT -1:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 160, 100, 40);

        s1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        jPanel2.add(s1);
        s1.setBounds(110, 160, 330, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data_Comes/vivid-blurred-colorful-background (1).jpg"))); // NOI18N
        jLabel8.setText("background");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 890, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        // Input Button S2
    }//GEN-LAST:event_s2ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        s3.setText(null);
        s2.setText(null);
        result1.setText(null);
        s1.setText(null);
        result.setText(null);
    }//GEN-LAST:event_resetActionPerformed
    //Calculate Button
    private void convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertActionPerformed
        //HAMMING DISTANCE
        if (combobox.getSelectedItem().equals("Hamming Distance")) {
            if (s2.getText().equals("") || s1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "DO NOT EMPTY INPUT-1 & INPUT-2", "ALART", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String str1 = s1.getText();
                String str2 = s2.getText();
                if (str1.length() != str2.length()) {
                    JOptionPane.showMessageDialog(null, "You must enter value same length", "DST System", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    int distance = 0;
                    for (int i = 0; i < str1.length(); i++) {
                        if (str1.charAt(i) != str2.charAt(i)) {
                            distance++;
                        }
                    }
                    String distance1 = Integer.toString(distance);
                    result1.setText("Humming Distance");
                    result.setText(distance1);
                }
            }
        }
        //PARITY CHECK
        if (combobox.getSelectedItem().equals("parity check")) {
            if ((s1.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "DO NOT EMPTY INPUT-1", "ALART", JOptionPane.INFORMATION_MESSAGE);
            } else {
                int a = Integer.parseInt(s1.getText());
                String str3 = Integer.toBinaryString(a);
                s2.setText("Binary: " + str3);
                int counter = 0;

                for (int i = 0; i < str3.length(); i++) {
                    if (str3.charAt(i) == '1') {
                        counter++;
                    }
                }
                if (counter % 2 == 0) {
                    result1.setText("Parity");
                    result.setText("Even Parity");
                } else {
                    result1.setText("Parity");
                    result.setText("Odd parity");
                }
            }
        }
        //BIT STUFFING
        if (combobox.getSelectedItem().equals("Bit Stuffing")) {
            if (s1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "DO NOT EMPTY INPUT-1", "ALART", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String flag = s3.getText();
                String data = s1.getText();
                String res = new String();
                String out = new String();
                int counter = 0, i;
                for (i = 0; i < data.length(); i++) {
                    if (data.charAt(i) == '1') {
                        counter++;
                        res = res + data.charAt(i);
                    } else {
                        res = res + data.charAt(i);
                        counter = 0;
                    }
                    if (counter == 5) {
                        res = res + '0';
                        counter = 0;
                    }
                }
                result1.setText("Bit Stuffing");
                result.setText(flag + res + flag);
            }
        }
        //BIT DESTUFFING
        if (combobox.getSelectedItem().equals("Bit Destuffing")) {
            if ((s1.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "DO NOT EMPTY INPUT-1", "ALART", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String res = s1.getText();
                String out = new String();
                int counter = 0, i;
                for (i = 0; i < res.length(); i++) {
                    if (res.charAt(i) == '1') {
                        counter++;
                        out = out + res.charAt(i);
                    } else {
                        out = out + res.charAt(i);
                        counter = 0;
                    }
                    if (counter == 5) {
                        if ((i + 2) != res.length()) {
                            out = out + res.charAt(i + 2);
                        } else {
                            out = out + '1';
                        }
                        i = i + 2;
                        counter = 1;
                    }
                }
                result1.setText("Bit Destuffing");
                result.setText(out);
            }
        }
        //CHARACTER STUFFING
        if (combobox.getSelectedItem().equals("Character Stuffing")) {
            if ((s1.getText().equals("")) || s2.getText().equals("") || s3.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "DO NOT EMPTY INPUT-1, INPUT-2 & FLAG", "ALART", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String flag = s3.getText();
                String data = s1.getText();
                String data1 = s2.getText();
                String res = new String();
                String out = new String();
                int i, j;
                for (i = 0, j = 0; i < data.length(); i++) {
                    if (data.charAt(i) == data1.charAt(j)) {
                        res = res + data.charAt(i);
                        res = res + 'S';
                    } else {
                        res = res + data.charAt(i);
                    }
                }
                result1.setText("Character Stuffing");
                result.setText(flag + res + flag);
            }
        }
        //CHARACTER DESTUFFING
        if (combobox.getSelectedItem().equals("Character Destuffing")) {
            if (s1.getText().equals("") || s2.getText().equals("") || s3.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "DO NOT EMPTY INPUT-1, INPUT-2 & FLAG", "ALART", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String flag = s3.getText();
                String stuffedData = s1.getText();
                String data1 = s2.getText();
                String destuffedData = new String();
                int i;
                for (i = 0; i < stuffedData.length(); i++) {
                    if (stuffedData.charAt(i) == data1.charAt(0)) {
                        destuffedData += stuffedData.charAt(i);
                        i++;
                    }
                    destuffedData += stuffedData.charAt(i);
                }
                result1.setText("Character Destuffing");
                result.setText(destuffedData.substring(flag.length(), destuffedData.length() - flag.length()));
            }
        }
    }//GEN-LAST:event_convertActionPerformed

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        // Menu Seclect
    }//GEN-LAST:event_comboboxActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // Input button S1
    }//GEN-LAST:event_s1ActionPerformed

    private void result1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_result1ActionPerformed
        // Output Button Result1
    }//GEN-LAST:event_result1ActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        // Output Button result
    }//GEN-LAST:event_resultActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
        //Input Button falg
    }//GEN-LAST:event_s3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws IOException {
        Scanner sn=new Scanner(System.in);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Com().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JButton convert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton reset;
    private javax.swing.JTextField result;
    private javax.swing.JTextField result1;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s2;
    private javax.swing.JTextField s3;
    // End of variables declaration//GEN-END:variables
}
