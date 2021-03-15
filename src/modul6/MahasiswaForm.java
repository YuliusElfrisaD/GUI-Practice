/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Asus a455l
 */
public class MahasiswaForm extends JFrame implements ActionListener{
    JLabel lblNama , lblNim , lblJk , lblSts ;
    JTextField fieldNama , fieldNim ;
    JRadioButton rbLaki2 , rbWanita ;
    JCheckBox cbStatus ;
    JButton btnTampil ;
    
    public MahasiswaForm () {
    Container contentPane = getContentPane();
        setSize(350, 300);
        setResizable(true);
        setTitle("Form Mahasiswa");
        setLocation(500,225);
        contentPane.setLayout(null);
        contentPane.setBackground(Color.WHITE);
        
        lblNama = new JLabel("NAMA : ");
        lblNama.setBounds(5, 2, 80, 30);
        contentPane.add(lblNama);
        
        fieldNama = new JTextField() ;
        fieldNama.setBounds(110, 5, 200,25 );
        contentPane.add(fieldNama);
        
        lblNim = new JLabel("NIM : ");
        lblNim.setBounds(5, 30, 100, 30);
        contentPane.add(lblNim);
        
        fieldNim = new JTextField() ;
        fieldNim.setBounds(110, 35, 200, 25 );
        contentPane.add(fieldNim);
        
        lblJk = new JLabel("JENIS KELAMIN : ");
        lblJk.setBounds(5, 60, 100, 30);
        contentPane.add(lblJk);
        
        rbLaki2 = new JRadioButton("Laki-laki");
        rbLaki2.setBounds(110, 65, 80, 25);
        contentPane.add(rbLaki2);
        
        rbWanita = new JRadioButton("Perempuan");
        rbWanita.setBounds(110, 95, 100, 25);
        contentPane.add(rbWanita);
        
        lblSts = new JLabel("Status : ");
        lblSts.setBounds(5, 125, 80, 30);
        contentPane.add(lblSts);
        
        cbStatus = new JCheckBox("Aktif");
        cbStatus.setBounds(110, 125, 80, 30);
        contentPane.add(cbStatus);
        
        btnTampil = new JButton("Tampil");
        btnTampil.setBounds(130, 200, 80, 30);
        contentPane.add(btnTampil);
        btnTampil.addActionListener(this);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        String nama = fieldNama.getText();
        String nim = fieldNim.getText();
        String gender ;
        if (rbLaki2.isSelected()) {
            gender = "Laki - Laki" ;
        } else{
            gender = "Wanita";
        }
        String status = null ;
        if (cbStatus.isSelected()) {
            status = "Aktif";
        }
        JOptionPane.showMessageDialog(this, nama +" Adalah seorang Mahasiswa "+gender +
                " dengan NIM "+ nim+" yang masih "+status+" Berkuliah");
    }
}
