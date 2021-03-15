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
import javax.swing.JLabel;

/**
 *
 * @author Asus a455l
 */
public class KlikForm extends JFrame implements ActionListener{
        JButton klikButton ;
        JLabel numberLabel ;
        int number ;
    
        public KlikForm () {
            setSize(200, 100);
            setLocation(500, 250);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setTitle("Klik Form");
            
            getContentPane().setLayout(new FlowLayout());
            
            klikButton  = new JButton("Klik");
            getContentPane().add(klikButton);
            klikButton.addActionListener(this);
            numberLabel = new JLabel("Number of Clicks :0");
            getContentPane().add(numberLabel);
            
            
            setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
       number++;
       numberLabel.setText("Number of Clicks :"+number);

    }

    
}
