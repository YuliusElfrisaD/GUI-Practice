/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Asus a455l
 */
public class Ch14AbsolutePositioning extends JFrame{
    private static final int FRAME_WIDTH = 350 ;
    private static final int FRAME_HEIGHT = 300 ;
    private static final int FRAME_X_ORIGIN = 500 ;
    private static final int FRAME_Y_ORIGIN = 225 ;
    private static final int BUTTON_WIDTH = 80 ;
    private static final int BUTTOH_HEIGHT = 30 ;
    private JButton cancelButton ;
    private JButton okButton ;
    private JTextField txtField ;
    private JLabel label1 , label2 , label3 ;
    private JRadioButton rb1 ,rb2 ;
    private JCheckBox cb1 ,cb2,cb3,cb4;
    
    
    public Ch14AbsolutePositioning(){
        Container contentPane = getContentPane();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(true);
        setTitle("Program Ch14AbsolutePositioning");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        contentPane.setLayout(null);
        contentPane.setBackground(Color.RED);
        
        label1 = new JLabel("NAMA : ");
        label1.setBounds(5, 2, 80, 30);
        contentPane.add(label1);
        
        txtField = new JTextField() ;
        txtField.setBounds(110, 5, 200,25 );
        contentPane.add(txtField);
        
        label2 = new JLabel("JENIS KELAMIN : ");
        label2.setBounds(5, 30, 100, 30);
        contentPane.add(label2);
        
        rb1 = new JRadioButton("Laki-laki");
        rb1.setBounds(110, 35, 80, 25);
        contentPane.add(rb1);
        
        rb2 = new JRadioButton("Perempuan");
        rb2.setBounds(200, 35, 100, 25);
        contentPane.add(rb2);
        
        label3 = new JLabel("HOBI :");
        label3.setBounds(5, 60, 80 , 30);
        contentPane.add(label3);
                
        cb1 = new JCheckBox("Olahraga");
        cb1.setBounds(110, 65, 80, 25);
        contentPane.add(cb1);
        
        cb2 = new JCheckBox("Shopping");
        cb2.setBounds(110, 95, 80, 25);
        contentPane.add(cb2);
        
        cb3 = new JCheckBox("Computer Games");
        cb3.setBounds(110, 125, 130, 25);
        contentPane.add(cb3);
        
        cb4 = new JCheckBox("Nonton Bioskop");
        cb4.setBounds(110, 155, 130, 25);
        contentPane.add(cb4);
        
        okButton = new JButton("OK");
        okButton.setBounds(65, 200, BUTTON_WIDTH, BUTTOH_HEIGHT);
        contentPane.add(okButton);
        
        cancelButton = new JButton("CANCEL");
        cancelButton.setBounds(160, 200, BUTTON_WIDTH, BUTTOH_HEIGHT);
        contentPane.add(cancelButton);
        
       
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         
    }
    
    public static void main(String[] args) {
        Ch14AbsolutePositioning frame = new Ch14AbsolutePositioning();
        frame.setVisible(true);
    }
}
