import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dosenTamu extends dosen {
    /* ATRIBUT */
    private String NIDK;
    private LocalDate AkhirKontrak;
    private double tunjangan;

    /* METHOD */
    // KONSTRUKTOR
    public dosenTamu() {
        super();
        this.NIDK = "-";
        this.AkhirKontrak = LocalDate.of(2045, 12, 31);
        this.tunjangan = 999999999;
    }

    public dosenTamu(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDK, LocalDate AkhirKontrak) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.AkhirKontrak = AkhirKontrak;
        this.tunjangan = (getGajiPokok() * 0.025);
    }

    // GETTER
    public String getNIDK() {
        return NIDK;
    }

    public LocalDate getAkhirKontrak() {
        return AkhirKontrak;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    // SETTER
    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    public void setAkhirKontrak(LocalDate AkhirKontrak) {
        this.AkhirKontrak = AkhirKontrak;
    }

    // METHOD LAIN
    @Override
    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d, MMMM yyyy");

        super.printInfo();
        System.out.println("Bidang\t: " + getFakultas());
        System.out.println("BUP\t\t: " + AkhirKontrak.format(formatter));
        System.out.println("Tunjangan\t: " + tunjangan);
    }
}
