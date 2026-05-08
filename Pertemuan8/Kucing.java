/**
 * Nama : Wahyu Eko Setyo P
 * NIM  : 24060124120015
 * File : Kucing.java
 */

package Pertemuan8;

public class Kucing extends Anabul {
    private int bobot;

    public int getBobot() {
        return bobot;
    }

    public void setBobot(int val) {
        this.bobot = val;
    }

    public void Gerak() {
        System.out.println("Kucing berjalan");
    }

    public void Bersuara() {
        System.out.println("Meong");
    }
}
