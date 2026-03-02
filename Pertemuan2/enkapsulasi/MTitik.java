/* Nama File : MTitik.java
 * Deskripsi : Main program untuk menguji class Titik
 * Pembuat   : Wahyu Eko Setyo Pribowo
 * Tanggal   : 28 Februari 2026
 */

package praktikum2;

public class MTitik {
    public static void main(String[] args) {

        Titik t1 = new Titik(3, 4);

        // Tidak bisa akses langsung: t1.absis ❌ (error karena private)

        System.out.println("Absis : " + t1.getAbsis());
        System.out.println("Ordinat : " + t1.getOrdinat());

        t1.geser(2, 3);
        System.out.print("Setelah digeser : ");
        t1.printTitik();

        System.out.println("Jumlah objek Titik : " + Titik.getCounterTitik());
    }
}