/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author Asus a455l
 */
public class SubString {
    public static void main(String[] args) {
        String letters = "selamat hari ulang tahun ,semoga panjang umur";
        
        System.out.printf( "Substring dari index 20 sampai terakhir adalah \"s\"\n" , 
                letters.substring(20));
        System.out.printf ("%s \"%s\"\n",
                "Substring dari index 3 sampai 6 , Tetapi index 6 tidak termasuk adalah",
                letters.substring(3,6));
    }
    
}
