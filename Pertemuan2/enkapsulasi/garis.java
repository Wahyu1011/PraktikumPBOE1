/* Nama File : Garis.java
 * Deskripsi : Class Garis dengan penerapan enkapsulasi
 * Pembuat   : Wahyu Eko Setyo Pribowo
 * Tanggal   : 28 Februari 2026
 */

package praktikum2;

public class Garis {

    /* Atribut */
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /* Method */

    public Garis() {
        titikAwal = new Titik(0,0);
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    public Garis(Titik t1, Titik t2) {
        titikAwal = t1;
        titikAkhir = t2;
        counterGaris++;
    }

    // Selektor
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // Mutator
    public void setTitikAwal(Titik t) {
        titikAwal = t;
    }

    public void setTitikAkhir(Titik t) {
        titikAkhir = t;
    }

    // Panjang garis
    public double getPanjang() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dx*dx + dy*dy);
    }

    // Gradien
    public double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return dy/dx;
    }

    // Titik tengah
    public Titik getTitikTengah() {
        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis())/2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat())/2;
        return new Titik(x,y);
    }

    // Sejajar
    public boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    // Tegak lurus
    public boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }

    // Print garis
    public void printGaris() {
        System.out.print("Titik Awal  : ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir : ");
        titikAkhir.printTitik();
    }

    // Persamaan garis
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}