/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus a455l
 */
public class HitungKata {
 private  static final char BLANK = ' ';
    public static void main(String[] args) {
        int index  , wordCount , numberOfCharacters;
        
        String sentence = JOptionPane.showInputDialog("Input Kalimat :");
        
        numberOfCharacters = sentence.length();
        index = 0 ;
        wordCount = 0 ;
        
        while(index < numberOfCharacters){
            while (index < numberOfCharacters && sentence.charAt(index) == BLANK){
                index++;
            } 
            while (index < numberOfCharacters && sentence.charAt(index) != BLANK){
                index++ ;
            }
            wordCount++ ;
        }
        System.out.println("\nInput sentence : "+ sentence);
        System.out.println("    word  count :" + wordCount + " words");
    }
}
