/**
 * Nama : Wahyu Eko Setyo P
 * NIM  : 24060124120015
 * File : OperatorGenerik.java
 */

package Pertemuan8;

public class OperatorGenerik {
    public <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public <T extends Kucing> int Bobot2(Datum<T> kucing1, Datum<T> kucing2) {
        T WK1 = kucing1.getIsi();
        T WK2 = kucing2.getIsi();
        int hasil = WK1.getBobot() + WK2.getBobot();
        return hasil;
    }
}
