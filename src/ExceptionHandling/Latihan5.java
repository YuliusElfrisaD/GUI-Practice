/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Asus a455l
 */
public class Latihan5 extends JFrame implements  ActionListener{

    JLabel labelPanjang, labelLebar, labelLuas;
    JTextField fieldPanjang, fieldLebar, fieldLuas;
    JButton buttonHitung ;
    
    public Latihan5() {
        setSize(250, 180);
        setLocation(500, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Luas Tanah");

        getContentPane().setLayout(new FlowLayout());
        
        labelPanjang = new JLabel("Panjang (m)");
        getContentPane().add(labelPanjang);
        
        fieldPanjang = new JTextField(10);
        getContentPane().add(fieldPanjang);
        
        labelLebar = new JLabel("Lebar (m)");
        getContentPane().add(labelLebar);
        
        fieldLebar = new JTextField(10);
        getContentPane().add(fieldLebar);
        
        labelLuas = new JLabel("Luas (m2)");
        getContentPane().add(labelLuas);
        
        fieldLuas = new JTextField(10);
        getContentPane().add(fieldLuas);
        
        buttonHitung = new JButton("Hitung");
        getContentPane().add(buttonHitung);
        buttonHitung.addActionListener(this);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonHitung) {
            try{
                int panjang = Integer.parseInt(fieldPanjang.getText());
                int lebar =  Integer.parseInt(fieldLebar.getText());
                int luas = panjang * lebar ;
                String HasilLuas = String.valueOf(luas);
                fieldLuas.setText(HasilLuas);
            } catch (Exception a) {
               JOptionPane.showMessageDialog(null, "Maaf, hanya integer yang diperbolehkan" ,"Error" ,  JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
      public static void main(String[] args) {
        Latihan5 lat5 = new Latihan5();
    }
    
}
