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
public class Latihan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Karakter-1 :");
        String k1 = sc.next();
        System.out.println("Karakter-2 :");
        String k2 = sc.next();

        if (k1.compareTo(k2) > 0) {
            System.out.println("Karakter pertama lebih besar dari pada karakter 2");
        } else if (k1.compareTo(k2) < 0) {
            System.out.println("Karakter pertama lebih kecil dari pada karakter 2");
        } else {
            System.out.println("Kedua karakter adalah sama");
        }
    }
}
