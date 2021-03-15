/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventHandling;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Asus a455l
 */
public class PesanForm extends JFrame implements ActionListener{
    JButton kirimButton ;
    JTextField pesanText ;
    JLabel pesanLabel ;
    
    
 public PesanForm (){
    setSize(300, 100);
    setLocation(500, 250);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Pesan Form");
    
    getContentPane().setLayout(new FlowLayout());
    
    pesanLabel = new JLabel("Pesan :");
    getContentPane().add(pesanLabel);
    pesanText = new JTextField(20);
    getContentPane().add(pesanText);
    kirimButton = new JButton("Kirim");
    kirimButton.addActionListener(this);
   
    
     setVisible(true);
 }   

    @Override
    public void actionPerformed(ActionEvent e) {
    JOptionPane.showMessageDialog(this, "Pesan Disini");
    }
    
}
