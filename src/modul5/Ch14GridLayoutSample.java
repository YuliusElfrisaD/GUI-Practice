/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;


import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author Asus a455l
 */
public class Ch14GridLayoutSample extends JFrame{
    private static final int FRAME_WIDTH = 300 ;
    private static final int FRAME_HEIGHT = 200 ;
    private static final int FRAME_X_ORIGIN = 150 ;
    private static final int FRAME_Y_ORIGIN = 250 ;
    
    public static void main(String[] args) {
        Ch14GridLayoutSample frame = new Ch14GridLayoutSample();
        frame.setVisible(true);
    }
    public Ch14GridLayoutSample(){
         Container contentPane ;
        JButton button1 , button2 , button3 ,button4 , button5;
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Program Ch14GridLayoutSample");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        contentPane = getContentPane();
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new GridLayout(2, 3));
        
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");
        button5 = new JButton("Button 5");
 
        contentPane.add(button1);
        //contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(button4);
        contentPane.add(button5);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
