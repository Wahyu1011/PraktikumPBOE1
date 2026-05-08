/**
 * Nama : Wahyu Eko Setyo P
 * NIM  : 24060124120015
 * File : Kucing.java
 */

package Pertemuan10;

public class Kucing extends Anabul {
    protected double bobot;

    public Kucing(String panggilan, double bobot) {
        super(panggilan);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }
}
