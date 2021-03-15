/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LayoutManager;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Asus a455l
 */
public class Ch14FlowLayoutSample extends JFrame{
   private static final int FRAME_WIDTH = 300 ;
    private static final int FRAME_HEIGHT = 200 ;
    private static final int FRAME_X_ORIGIN = 150 ;
    private static final int FRAME_Y_ORIGIN = 250 ;
    
    public static void main(String[] args) {
        Ch14FlowLayoutSample frame = new Ch14FlowLayoutSample();
        frame.setVisible(true);
    }
    public Ch14FlowLayoutSample(){
        Container contentPane ;
        JButton button1 , button2 , button3 ,button4 , button5;
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Program Ch14FlowLayoutSample");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        contentPane = getContentPane();
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new FlowLayout());
        
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");
        button5 = new JButton("Button 5");
        
        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(button4);
        contentPane.add(button5);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
