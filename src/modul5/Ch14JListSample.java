/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Asus a455l
 */
public class Ch14JListSample extends JFrame{
    private static final int FRAME_WIDTH = 300 ;
    private static final int FRAME_HEIGHT = 200 ;
    private static final int FRAME_X_ORIGIN = 150 ;
    private static final int FRAME_Y_ORIGIN = 250 ;
    private  JList list ;
   
    public static void main(String[] args) {
        Ch14JListSample frame = new Ch14JListSample();
        frame.setVisible(true);
    }
    
    public Ch14JListSample(){
        Container contentPane ;
        JPanel listPanel , okPanel ;
        
        JButton okButton ;
        String[] names ={"Ape","Bat","Bee","Cat","Dog","Eel","Fox","Gnu",
                        "Hen","Man","Sow","Yak"} ;
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Program Ch14JlistSample");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        contentPane = getContentPane();
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new BorderLayout());
        
        listPanel = new JPanel(new GridLayout(0,1));
        listPanel.setBorder(BorderFactory.createTitledBorder("Three-letter Animal Names"));
        
       list = new JList(names);
       listPanel.add(new JScrollPane(list));
                
       okPanel = new JPanel(new FlowLayout());
       okButton = new JButton("OK");
       okPanel.add(okButton);
       
       contentPane.add(listPanel , BorderLayout.CENTER);
       contentPane.add(okPanel , BorderLayout.SOUTH);
       
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
