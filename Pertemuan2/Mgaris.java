/* Nama File : Mgaris.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat   : Wahyu Eko Setyo Pribowo  
 * Tanggal   : Jumat, 27 Februari 2026 */

public class Mgaris {
    public static void main(String[] args) {

        Titik t1 = new Titik();
        t1.setAbsis(-2);
        t1.setordinat(0);

        Titik t2 = new Titik();
        t2.setAbsis(0);
        t2.setordinat(4);

        Garis g1 = new Garis(t1, t2);

        g1.printGaris();

        System.out.println("Panjang Garis   : " + g1.getPanjang());
        System.out.println("Gradien         : " + g1.getGradien());

        Titik tengah = g1.getTitikTengah();
        System.out.print("Titik Tengah    : ");
        tengah.printTitik();

        System.out.println("Persamaan Garis : " + g1.getPersamaanGaris());

        System.out.println("Jumlah objek garis: " + Garis.getCounterGaris());
    }
}
}