public class Kendaraan {
    private String noplat;
    private String jenis;

    public Kendaraan() {
        this.noplat = "";
        this.jenis = "";
    }

    public Kendaraan(String noplat, String jenis) {
        this.noplat = noplat;
        this.jenis = jenis;
    }

    public String getNoplat() {
        return this.noplat;
    }

    public String getJenis() {
        return this.jenis;
    }

    public void setNoplat(String noplat) {
        this.noplat = noplat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}