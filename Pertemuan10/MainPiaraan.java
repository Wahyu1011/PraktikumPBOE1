/**
 * Nama : Wahyu Eko Setyo P
 * NIM  : 24060124120015
 * File : MainPiaraan.java
 */

package Pertemuan10;

public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan klinik = new Piaraan();

        System.out.println("--- Menambah Anabul ke Antrean ---");
        Anjing doggie = new Anjing("Doggie");
        KucingPersia mpuss = new KucingPersia("Mpuss", 4.5);
        KucingAnggora kitty = new KucingAnggora("Kitty", 3.2);
        Anjing spike = new Anjing("Spike");

        klinik.enqueueAnabul(doggie);
        klinik.enqueueAnabul(mpuss);
        klinik.enqueueAnabul(kitty);
        klinik.enqueueAnabul(spike);

        klinik.showAnabul();
        System.out.println("Jumlah elemen: " + klinik.getNbelm());

        System.out.println("\n--- Test countKucing & bobotKucing ---");
        System.out.println("Banyak keluarga kucing: " + klinik.countKucing());
        System.out.println("Total bobot keluarga kucing: " + klinik.bobotKucing() + " kg");

        System.out.println("\n--- Test showJenisAnabul ---");
        klinik.showJenisAnabul();

        System.out.println("\n--- Test getAnabul (Peek) ---");
        Anabul first = klinik.getAnabul();
        if (first != null) {
            System.out.println("Anabul pertama: " + first.getNama());
        }

        System.out.println("\n--- Test dequeueAnabul ---");
        Anabul removed = klinik.dequeueAnabul();
        if (removed != null) {
            System.out.println("Mengeluarkan: " + removed.getNama());
        }
        klinik.showAnabul();
        System.out.println("Jumlah elemen sekarang: " + klinik.getNbelm());

        System.out.println("\n--- Test isMember ---");
        System.out.println("Apakah Doggie masih member? " + klinik.isMember(doggie));
        System.out.println("Apakah Kitty masih member? " + klinik.isMember(kitty));
    }
}
