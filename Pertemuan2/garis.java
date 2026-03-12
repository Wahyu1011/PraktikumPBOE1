/* Nama File : Garis.java
 * Deskripsi : berisi atribut dan method dalam class Garis
 * Pembuat   : Wahyu Eko Setyo Pribowo
 * Tanggal   : Jumat, 27 Februari 2026 */

public class Garis {

    /* Atribut */
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /* Method */

    // Konstruktor tanpa parameter
    Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik();
        titikAkhir.setAbsis(1);
        titikAkhir.setordinat(1);
        counterGaris++;
    }

    // Konstruktor dengan parameter
    Garis(Titik tAwal, Titik tAkhir) {
        titikAwal = tAwal;
        titikAkhir = tAkhir;
        counterGaris++;
    }

    // Getter
    Titik getTitikAwal() {
        return titikAwal;
    }

    Titik getTitikAkhir() {
        return titikAkhir;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    // Setter
    void setTitikAwal(Titik t) {
        titikAwal = t;
    }

    void setTitikAkhir(Titik t) {
        titikAkhir = t;
    }

    // Menghitung panjang garis
    double getPanjang() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getordinat() - titikAwal.getordinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Menghitung gradien
    double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getordinat() - titikAwal.getordinat();
        return dy / dx;
    }

    // Mendapatkan titik tengah
    Titik getTitikTengah() {
        Titik tengah = new Titik();
        tengah.setAbsis((titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2);
        tengah.setordinat((titikAwal.getordinat() + titikAkhir.getordinat()) / 2);
        return tengah;
    }

    // Mengecek sejajar
    boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    // Mengecek tegak lurus
    boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }

    // Menampilkan titik awal dan akhir
    void printGaris() {
        System.out.print("Titik Awal : ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    // Menampilkan persamaan garis
    String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getordinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}