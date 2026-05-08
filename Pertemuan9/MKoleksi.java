/**
 * Nama : Wahyu Eko Setyo P
 * NIM  : 24060124120015
 * File : MKoleksi.java
 */

package Pertemuan9;

public class MKoleksi {
    public static void main(String[] args) {
        Teman t = new Teman();
        Piaraan p = new Piaraan();

        System.out.println("--- Test Koleksi Teman ---");
        t.addNama("Wahyu");
        t.addNama("Eko");
        t.addNama("Setyo");
        t.showTeman();

        System.out.println("\n--- Test Koleksi Piaraan ---");
        Anjing anj = new Anjing("Buddy");
        Kucing ang = new Anggora("Angela", 5.0);
        Kucing kt = new Kembangtelon("Clowy", 4.5);
        
        p.enqueueAnabul(anj);
        p.enqueueAnabul(ang);
        p.enqueueAnabul(kt);

        p.showAnabul();
        System.out.println("Total Kucing: " + p.countKucing());
        System.out.println("Total Bobot Kucing: " + p.bobotKucing() + " kg");
        p.showJenisAnabul();
    }
}
