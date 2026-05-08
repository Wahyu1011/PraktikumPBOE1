/**
 * Nama : Wahyu Eko Setyo P
 * NIM  : 24060124120015
 * File : Asersi1.java
 * Deskripsi : Program untuk Menunjukkan Asersi
 */

package Pertemuan6;

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x Bilangan Positif");
        } else {
            assert (x < 0) : "Ada Kesalahan Kode";
            System.out.println("x Bilangan Negatif");
        }
    }
}
