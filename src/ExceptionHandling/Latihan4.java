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
public class Latihan4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = new String[2];
        int[] bilangan = new int[2];
        int jumlah = 0;
        int index = 0;
        boolean y = true;
        while (y && index < 2) {
            System.out.print("Masukkan bilangan ke -" + (index + 1) + " :");
            input[index] = sc.next();
            try {
                bilangan[index] = Integer.parseInt(input[index]);
                jumlah += bilangan[index];
                index++;

            } catch (NumberFormatException e) {
                System.out.println("Terjadi kesalahan input , mohon diulangi !");

            }

        }
        System.out.println("Hasil penjumlahan kedua bilangan itu :" + jumlah);
    }
}
