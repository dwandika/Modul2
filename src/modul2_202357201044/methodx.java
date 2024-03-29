package modul2_202357201044;

import javax.swing.JOptionPane;

public class methodx {

    public double luas_lingkaran(double diameter) {
        double jari2 = diameter / 2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }

    public double volume_tabung(double diameter, double tinggi) {
        double luas_alas = luas_lingkaran(diameter);
        double volume = luas_alas * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        methodx mt = new methodx();

        double diameter, tinggi;

        diameter = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan diameter lingkaran: "));
        tinggi = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan tinggi: "));
        double volume_tabung = mt.volume_tabung(diameter, tinggi);
        JOptionPane.showMessageDialog(null, "Volume Tabung = " + volume_tabung);

        System.exit(0);
    }
}
