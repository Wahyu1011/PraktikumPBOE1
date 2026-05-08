/**
 * Nama : Wahyu Eko Setyo P
 * NIM  : 24060124120015
 * File : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 */

package Pertemuan6;

package Pertemuan6;

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " Bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka!!!");
        }
    }
}
