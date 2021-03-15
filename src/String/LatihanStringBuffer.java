/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Scanner;

/**
 *
 * @author Asus a455l
 */
public class LatihanStringBuffer {
    public static void main(String[] args) {
       StringBuffer sb = new StringBuffer();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Firstname     : " );
        String fname = sc.next();
        System.out.print("Middlename  : ");
        String midname = sc.next();
        System.out.print("Lastname      : ");
        String lname = sc.next();
        
        sb.append(fname);
        sb.append(midname);
        sb.append(lname);
        
        
//        
 
        
        System.out.println("Fullname :"+ sb );
    
    }
   
}
