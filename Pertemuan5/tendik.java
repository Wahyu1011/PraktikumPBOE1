import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class tendik extends pegawai{
    /* ATRIBUT */
    private String bidang;
    private LocalDate BUP;
    private double tunjangan;

    /* METHOD */
    // KONSTRUKTOR
    public tendik() {
        super();
        this.bidang = "-";
        if (getTanggalLahir().getMonthValue() != 12) {
            this.BUP = (LocalDate.of(getTanggalLahir().getYear() + 55, getTanggalLahir().getMonthValue() + 1, 1));
        } else {
            this.BUP = (LocalDate.of(getTanggalLahir().getYear() + 56, 1, 1));
        }
        this.tunjangan = ((Period.between(getTMT(), LocalDate.now())).getYears() * 0.01) * getGajiPokok();
    }

    public tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
        if (getTanggalLahir().getMonthValue() != 12) {
            this.BUP = (LocalDate.of(getTanggalLahir().getYear() + 55, getTanggalLahir().getMonthValue() + 1, 1));
        } else {
            this.BUP = (LocalDate.of(getTanggalLahir().getYear() + 56, 1, 1));
        }
        this.tunjangan = ((Period.between(getTMT(), LocalDate.now())).getYears() * 0.01) * getGajiPokok();
    }

    // GETTER
    public String getBidang() {
        return bidang;
    }

    public LocalDate getBUP() {
        return BUP;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    // SETTER
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    // METHOD LAIN
    @Override
    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d, MMMM yyyy");

        super.printInfo();
        System.out.println("Bidang\t: " + bidang);
        System.out.println("BUP\t\t: " + BUP.format(formatter));
        System.out.println("Tunjangan\t: " + tunjangan);
    }
}
