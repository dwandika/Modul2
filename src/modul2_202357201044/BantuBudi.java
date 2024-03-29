package modul2_202357201044;

import javax.swing.JOptionPane;

public class BantuBudi {
    
    public static double luas_persegipanjang(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }
    
    public static double luas_segitiga(double alas, double tingi) {
        double luas = 0.5 * alas * tingi;
        return luas;
    }
    
    public static double luas_lingkaran(double diameter) {
        double jari2 = diameter / 2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }
    
    public static void main(String[] args) {
        
        double panjang = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Panjang : "));
        double lebar = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Lebar : "));
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang = " + luas_persegipanjang(panjang, lebar));
        
        double alas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan alas segitiga : "));
        double tinggi = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan tinggi segitiga : "));
        JOptionPane.showMessageDialog(null, "luas Segitiga = " + luas_segitiga(alas, tinggi));
        
        double diameter = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan diameter lingkaran: "));
        JOptionPane.showMessageDialog(null, "Luas Lingkaran = " + luas_lingkaran(diameter));
        
        JOptionPane.showMessageDialog(null, 
                "luas Persegi panjang = " + luas_persegipanjang(panjang, lebar)
                + "\nLuas Segitiga = " + luas_segitiga(alas, tinggi)
                + "\nLuas Lingkaran = " + luas_lingkaran(diameter));
        
        System.exit(0);
    }
}
