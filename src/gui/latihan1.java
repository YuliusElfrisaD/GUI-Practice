/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Asus a455l
 */
public class latihan1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ini Frame Pertamaku") ;
        
        int tinggi = 400 ;
        int lebar = 400 ;
        
        frame.setBounds(100, 100, lebar, tinggi);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
  //Latihan 2
           JMenuBar menuBar = new JMenuBar();
           JMenu menuFile = new JMenu ("File");
           JMenuItem menuItemOpen = new JMenuItem("Open");
           menuFile.add(menuItemOpen);
           menuBar.add(menuFile);
          
           JMenu menuFile2 = new JMenu("Edit");
           JMenuItem menuItemCopy = new JMenuItem("Copy");
           menuFile2.add(menuItemCopy);
           menuBar.add(menuFile2);
           frame.setJMenuBar(menuBar);
          
           
            //Latihan 3
             JPanel panel = new JPanel();
            frame.setContentPane(panel);
             JButton btnSave = new JButton("Save");
             panel.add(btnSave);

//                     
           frame.setVisible(true); 
    }
 
}
