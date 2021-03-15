/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.util.Scanner;

/**
 *
 * @author Asus a455l
 */
public class Lat1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan Jarak Perjalanan Anda (km) :");
        int jarak = sc.nextInt();
        System.out.print("Masukkan banyaknya bensin yang dihabiskan (liter) :");
        int liter = sc.nextInt();
        
        int konsumsi = jarak/liter ;
        System.out.println("Konsumsi BBM anda adalah "+konsumsi+" km/liter");
    }
    
}
