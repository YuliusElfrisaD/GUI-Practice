/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Asus a455l
 */
public class LatEmpat extends JFrame implements ActionListener {

    JLabel labelNo, labelNama, labelStatus;
    JTextField fieldNo, fieldNama;
    JComboBox cbStatus;
    JButton simpan;

    public static void main(String[] args) {
        LatEmpat lat = new LatEmpat();
    }

    public LatEmpat() {
        setSize(230, 150);
        setLocation(500, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pendaftaran Seminar");

        getContentPane().setLayout(new FlowLayout());

        labelNo = new JLabel("No. Induk");
        getContentPane().add(labelNo);

        fieldNo = new JTextField(12);
        getContentPane().add(fieldNo);

        labelNama = new JLabel("Nama");
        getContentPane().add(labelNama);

        fieldNama = new JTextField(12);
        getContentPane().add(fieldNama);

        labelStatus = new JLabel("Status");
        getContentPane().add(labelStatus);

        String[] sts = {"Mahasiswa", "Dosen"};
        cbStatus = new JComboBox(sts);
        getContentPane().add(cbStatus);

        simpan = new JButton("Simpan");
        getContentPane().add(simpan);
        simpan.addActionListener(this);
        setVisible(true);
    }

    public String getNim() throws Exception {
        String nim = fieldNo.getText();
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        if (nim.length() != 9) {
            throw new Exception("Maaf , format NIM anda salah");
        }
        if (angkatan > 13) {
            throw new Exception("Maaf untuk angkatan diatas 2013 tidak bisa mengikuti Seminar");
        }
        return nim;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            getNim();
            String nim = fieldNo.getText();
            JOptionPane.showMessageDialog(null, "Terima kasih anda sudah mendaftar seminar");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}
