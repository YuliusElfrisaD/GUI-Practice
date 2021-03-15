/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LayoutManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Asus a455l
 */
public class Ch14BorderLayoutSample extends JFrame{
     private static final int FRAME_WIDTH = 300 ;
    private static final int FRAME_HEIGHT = 200 ;
    private static final int FRAME_X_ORIGIN = 150 ;
    private static final int FRAME_Y_ORIGIN = 250 ;
    
    public static void main(String[] args) {
        Ch14BorderLayoutSample frame = new Ch14BorderLayoutSample();
        frame.setVisible(true);
    }
    public Ch14BorderLayoutSample(){
        Container contentPane ;
        JButton button1 , button2 , button3 ,button4 , button5;
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Program Ch14BorderLayoutSample");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        contentPane = getContentPane();
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new BorderLayout());
        
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");
        button5 = new JButton("Button 5");
 
        contentPane.add(button1, BorderLayout.NORTH);
        //contentPane.add(button2, BorderLayout.SOUTH);
        contentPane.add(button3, BorderLayout.EAST);
        contentPane.add(button4, BorderLayout.WEST);
        contentPane.add(button5, BorderLayout.CENTER);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}