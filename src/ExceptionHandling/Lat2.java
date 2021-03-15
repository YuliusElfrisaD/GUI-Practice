/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus a455l
 */
public class Lat2 {
    public static void main(String[] args) {
        String inputStr ;
        int age = 0 ;
       
        inputStr = JOptionPane.showInputDialog(null , "Masukkan umur anda!");
        
        try{
            age = Integer.parseInt(inputStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "'"+inputStr
            + "' is invalid \n"
            + "Please enter digits only");
        }
        System.out.println("Umur anda :"+age+" tahun");
    }
}
