/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Asus a455l
 */
public class SendingForm extends JFrame implements ActionListener{
    JTextField pesanField ;
    JButton pesanButton ;
    JTextArea displayArea ;
    
    public SendingForm(){
     setSize(400, 200);
    setLocation(500, 250);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Pesan");
    
    getContentPane().setLayout(new FlowLayout());
    
    pesanField = new JTextField(20);
    getContentPane().add(pesanField);
    
    pesanButton = new JButton("Kirim");
    getContentPane().add(pesanButton);
    pesanButton.addActionListener(this);
    
    displayArea = new JTextArea(20,25);
    getContentPane().add(displayArea);
    
     setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    displayArea.append(pesanField.getText()+"\n");
    }
    
}
