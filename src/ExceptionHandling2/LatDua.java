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
public class LatDua {

    public static void main(String[] args) {
        int s = 0;
        int v = 0;
        int t = 0;

        try {
            LatDua lat = new LatDua();
            s = lat.getJarak();
            v = lat.getKecepatan();
            t = lat.hitungWaktu(s, v);
        } catch (InputMismatchException e) {
            System.out.println("Maaf terjadi kesalahan input");
        } catch (ArithmeticException e) {
            System.out.println("Maaf terjadi kesalahan proses hitung");
        } finally {
            System.out.println("Waktu yang anda butuhkan adalah : "+t+" jam");
        }
    }
    
    public int getJarak() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak perjalanan anda (km) :");
        int jarak = sc.nextInt();
        return jarak ;
    }
    
    public int getKecepatan() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kecepatan kendaraan anda (km/jam) :");
        int kecepatan = sc.nextInt();
        return kecepatan ;
    }
    
    public int hitungWaktu (int jarak , int kecepatan) throws  ArithmeticException{
        int waktu = 0 ;
        waktu = jarak / kecepatan ;
        return waktu ;
    }
}
