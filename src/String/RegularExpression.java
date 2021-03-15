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
public class RegularExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input :");
        String input = sc.next();
        String result = input.replaceAll("[aiueo]", "#");
        System.out.println("Output :"+ result);
    }
}
