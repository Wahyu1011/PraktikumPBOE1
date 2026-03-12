public class Persegi extends BangunDatar {

    private int sisi;

    public Persegi(int JmlSisi, String warna, String border, int sisi) {
        super(JmlSisi, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }
    
}
