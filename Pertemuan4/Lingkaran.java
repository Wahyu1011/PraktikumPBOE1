public class Lingkaran extends BangunDatar {
    private double jariJari;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(0, warna, border);
        this.jariJari = diameter / 2;

    }
}
