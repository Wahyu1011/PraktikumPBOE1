/**
 * Nama : Wahyu Eko Setyo P
 * NIM  : 24060124120015
 * File : Asersi2.java
 * Deskripsi : Program untuk Demo Asersi
 */

package Pertemuan6;

class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "Jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();

        System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
    }
}
