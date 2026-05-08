/**
 * Nama : Wahyu Eko Setyo P
 * NIM  : 24060124120015
 * File : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13
 */

package Pertemuan6;

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("Angka 13 tidak diperbolehkan karena dianggap angka sial!");
    }
}
