/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventHandling2;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Asus a455l
 */
public class ViewForm extends JFrame {

    JLabel nimLabel, namaLabel, jenisKelaminLabel, angkatanLabel, daftarLabel;
    JTextArea areaDisplay;
    Seminar seminar;

    public ViewForm(Seminar sem) {
        setSize(395, 210);
        setLocation(500, 250);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("View");

        getContentPane().setLayout(new FlowLayout());

        daftarLabel = new JLabel("Daftar :");
        getContentPane().add(daftarLabel);

        areaDisplay = new JTextArea(20, 30);
        getContentPane().add(areaDisplay);
        setVisible(true);
        
//    nimLabel= new JLabel();
//    nimLabel.setText("NIM :"+mhs.getNim());
//    getContentPane().add(nimLabel);
//    
//    namaLabel = new JLabel();
//    namaLabel.setText("Nama:"+mhs.getNama());
//    getContentPane().add(namaLabel);
//    
//    jenisKelaminLabel = new JLabel();
//    jenisKelaminLabel.setText("Jenis Kelamin :"+mhs.getJenisKelamin());
//    getContentPane().add(jenisKelaminLabel);
//    
//    angkatanLabel= new JLabel();
//    angkatanLabel.setText("Angkatan"+mhs.getAngkatan());
//    getContentPane().add(angkatanLabel);
    
        
    }
}
