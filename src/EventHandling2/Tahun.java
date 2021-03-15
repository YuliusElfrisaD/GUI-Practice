/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventHandling2;

/**
 *
 * @author Asus a455l
 */
public class Tahun {

    public static void main(String[] args) {
      Tahun thn = new Tahun();
      thn.getTahun();

    }

    public int getTahun() {
        String tahun[] = new String[100];
        int j = 0;
        int i;
        for (i = 2010; i < 2109; i++) {
            tahun[j] = " " + i;
            j++;
            System.out.println(i);
        }
        return i;
        }
}
