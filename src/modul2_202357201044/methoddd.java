package modul2_202357201044;

import javax.swing.JOptionPane;

public class methoddd {

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

    public double volume_kerucut(double diameter, double tinggi) {
        double luas_alas = luas_lingkaran(diameter);
        double volume = (luas_alas * tinggi) / 3;
        return volume;
    }

    public double volume_bola(double diameter) {
        double jari2 = diameter / 2;
        double volume = (4 / 3) * Math.PI * Math.pow(jari2, 3);
        return volume;
    }

    public static void main(String[] args) {
        methoddd mt = new methoddd();

        String pilihanBangun = JOptionPane.showInputDialog(null,
                "Pilih bangun ruang:"
                + "\n1. Tabung"
                + "\n2. Kerucut"
                + "\n3. Bola");

        int pilihan = Integer.parseInt(pilihanBangun);

        double diameter, tinggi;

        if (pilihan == 1) {
            diameter = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan diameter lingkaran: "));
            tinggi = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan tinggi: "));
            double volume_tabung = mt.volume_tabung(diameter, tinggi);
            JOptionPane.showMessageDialog(null, "Volume Tabung = " + volume_tabung);

        } else if (pilihan == 2) {
            diameter = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan diameter lingkaran: "));
            tinggi = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan tinggi: "));
            double volume_kerucut = mt.volume_kerucut(diameter, tinggi);
            JOptionPane.showMessageDialog(null, "Volume Kerucut = " + volume_kerucut);

        } else if (pilihan == 3) {
            diameter = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan diameter lingkaran: "));
            double volume_bola = mt.volume_bola(diameter);
            JOptionPane.showMessageDialog(null, "Volume Bola = " + volume_bola);

        } else {
            JOptionPane.showMessageDialog(null, "Pilihan tidak tersedia");
        }
        System.exit(0);
    }
}
