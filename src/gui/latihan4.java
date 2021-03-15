/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Asus a455l
 */
public class latihan4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Searching ...") ;
        
        int tinggi = 100;
        int lebar = 400 ;
        
        frame.setBounds(0, 0, lebar, tinggi);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel1 = new JPanel();
        frame.setContentPane(panel1);
        
        JLabel label = new JLabel("Keyword");
        frame.add(label) ;
          
         JTextField field1 = new JTextField(20) ;
         frame.add(field1);
  
        JButton btnSave = new JButton("Find");
        panel1.add(btnSave);
        
           

        
        frame.setVisible(true);
    }
}
