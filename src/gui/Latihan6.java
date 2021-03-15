/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Asus a455l
 */
public class Latihan6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("LOGIN");
        
        int tinggi = 100 ;
        int lebar = 300 ;
        
         frame.setBounds(0, 0, lebar, tinggi);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.setContentPane(panel);
        
         JLabel label = new JLabel("Bahasa");
        frame.add(label) ;
        
        
        String [] bahasa1 = {"Indonesia","Mexico","Italia","Belanda","Jerman"};
        JComboBox cb = new JComboBox(bahasa1) ;
        frame.add(cb) ;
        
        
        frame.setVisible(true);
        
    }
   
}
