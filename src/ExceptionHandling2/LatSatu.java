/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Asus a455l
 */
public class LatSatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int waktu = 0 ;
        
        try {
            System.out.print("Masukkan Jarak Perjalanan Anda (km) :");
            int jarak = sc.nextInt();
            System.out.print("Masukkan kecepatan kecepatan kendaraan anda (km/jam) :");
            int kecepatan = sc.nextInt();
            waktu = jarak/kecepatan;
        }catch(InputMismatchException e){
            System.out.println("Maaf terjadi kesalahan input");
        }catch(ArithmeticException e){
            System.out.println("Maaf terjadi kesalahan proses perhitungan");
        }finally{
            System.out.println("Waktu yang anda butuhkan adalah :"+waktu+" jam");
        }
        System.out.println("Terima Kasih . . . . ");
    }
   
}
