/* Nama File : Titik.java
 * Deskripsi : Class Titik dengan penerapan enkapsulasi
 * Pembuat   : Wahyu Eko Setyo Pribowo
 * Tanggal   : 28 Februari 2026
 */

package praktikum2;

public class Titik {

    /* Atribut */
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /* Method */

    // Konstruktor default (0,0)
    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    // Konstruktor dengan parameter
    public Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    // Selektor
    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

    // Mutator
    public void setAbsis(double x) {
        this.absis = x;
    }

    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Menggeser titik
    public void geser(double x, double y) {
        this.absis += x;
        this.ordinat += y;
    }

    // Print titik
    public void printTitik() {
        System.out.println("(" + absis + "," + ordinat + ")");
    }
}