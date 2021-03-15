/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventHandling2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Asus a455l
 */
public class InputForm extends JFrame implements ActionListener {
    
    JLabel nimLabel, namaLabel, jenisKelaminLabel, angkatanLabel;
    JTextField nimText, namaText;
    JRadioButton priaRb, wanitaRb;
    JComboBox angkatanCb;
    JButton simpanButton, lihatButton;
    String pesan = "";
    String gender, angk;
    
    public InputForm() {
        setSize(250, 180);
        setLocation(500, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Input Data Seminar");
        
        getContentPane().setLayout(new FlowLayout());
        
        nimLabel = new JLabel("NIM :");
        getContentPane().add(nimLabel);
        
        nimText = new JTextField(15);
        getContentPane().add(nimText);
        
        namaLabel = new JLabel("NAMA :");
        getContentPane().add(namaLabel);
        
        namaText = new JTextField(15);
        getContentPane().add(namaText);
        
        jenisKelaminLabel = new JLabel("Jenis Kelamin:");
        getContentPane().add(jenisKelaminLabel);
        
        priaRb = new JRadioButton("Laki - laki");
        getContentPane().add(priaRb);
        
        wanitaRb = new JRadioButton("Perempuan");
        getContentPane().add(wanitaRb);
        
        angkatanLabel = new JLabel("Angkatan:");
        getContentPane().add(angkatanLabel);
        
        String angkatan[] = new String[17];
        int j = 0;
        for (int i = 2000; i <= 2016; i++) {
            angkatan[j] = "" + i;
            j++;
        }
        angkatanCb = new JComboBox(angkatan);
        getContentPane().add(angkatanCb);
        
        simpanButton = new JButton("Simpan");
        getContentPane().add(simpanButton);
        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.getNim();
                mhs.getNama();
                if (priaRb.isSelected()) {
                    gender = "Laki - laki";
                } else {
                    gender = "Perempuan";
                }
                mhs.getJenisKelamin();
                angk = (String) angkatanCb.getSelectedItem();
                mhs.getAngkatan();
            }
        });
        
        lihatButton = new JButton("Lihat");
        getContentPane().add(lihatButton);
        lihatButton.addActionListener(this);
        setVisible(true);
        
    }
    
    public void tampil(Mahasiswa mhs) {
        System.out.println("       Data Mahasiswa");
        System.out.println("=============================");
        System.out.println("NIM :" + mhs.getNim());
        System.out.println("NAMA :" + mhs.getNama());
        System.out.println("Jenis Kelamin :" + mhs.getJenisKelamin());
        System.out.println("Angkatan :" + mhs.getAngkatan());
        System.out.println("=============================");
        
    }
    
    public void simpan(Mahasiswa mhs) {
        Seminar sm = new Seminar();
        sm.tambahPeserta(mhs);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Mahasiswa mhs = new Mahasiswa();
        Seminar sem = new Seminar();
        mhs.setNim(nimText.getText());
        mhs.setNama(namaText.getText());
        if (priaRb.isSelected()) {
            gender = "Laki - laki";
        } else {
            gender = "Perempuan";
        }
        mhs.setJenisKelamin(gender);
        angk = (String) angkatanCb.getSelectedItem();
        mhs.setAngkatan(angk);
       
        ViewForm vf = new ViewForm(sem);
    pesan += nimText.getText() + " | " + namaText.getText() + " | " + gender + " | "
                + angk+ "\n" ;
        vf.areaDisplay.append(pesan);
              // tampil(mhs);        
    }
}
