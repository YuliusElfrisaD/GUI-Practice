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
public class Latihan5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        
        int tinggi = 150 ;
        int lebar = 470 ;
        
         frame.setBounds(0, 0, lebar, tinggi);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.setContentPane(panel);
        
        JLabel label = new JLabel("Username");
        frame.add(label) ;
          
         JTextField field1 = new JTextField(10) ;
         frame.add(field1);
         
         JLabel label2 = new JLabel("Password");
         frame.add(label2);
         
         JTextField field2 = new JTextField(10) ;
         frame.add(field2);
  
        JButton btnSave = new JButton("Login");
        panel.add(btnSave);
        
        frame.setVisible(true);
    }
}
