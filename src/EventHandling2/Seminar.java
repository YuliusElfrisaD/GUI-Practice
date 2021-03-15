/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventHandling2;

import java.util.ArrayList;

/**
 *
 * @author Asus a455l
 */
public class Seminar {
    ArrayList<Mahasiswa> daftarPeserta ;

    public Seminar(){
    
    }

    public ArrayList<Mahasiswa> getDaftarPeserta() {
        return daftarPeserta;
    }
    
    public void tambahPeserta(Mahasiswa mhs){
        daftarPeserta.add(mhs);
    }
}
