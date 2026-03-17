import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class dosenTetap extends dosen {
    /* ATRIBUT */
    private String NIDN;
    private LocalDate BUP;
    private double tunjangan;

    /* METHOD */
    // KONSTRUKTOR
    public dosenTetap() {
        super();
        if (getTanggalLahir().getMonthValue() != 12) {
            this.BUP = (LocalDate.of(getTanggalLahir().getYear() + 65, getTanggalLahir().getMonthValue() + 1, 1));
        } else {
            this.BUP = (LocalDate.of(getTanggalLahir().getYear() + 66, 1, 1));
        }
        this.tunjangan = ((Period.between(getTMT(), LocalDate.now())).getYears() * 0.02) * getGajiPokok();
    }

    public dosenTetap(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDN) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
        if (getTanggalLahir().getMonthValue() != 12) {
            this.BUP = (LocalDate.of(getTanggalLahir().getYear() + 65, getTanggalLahir().getMonthValue() + 1, 1));
        } else {
            this.BUP = (LocalDate.of(getTanggalLahir().getYear() + 66, 1, 1));
        }
        this.tunjangan = ((Period.between(getTMT(), LocalDate.now())).getYears() * 0.02) * getGajiPokok();
    }

    // GETTER
    public LocalDate getBUP() {
        return BUP;
    }

    public double getTunjangan() {
        return tunjangan;
    }
    // SETTER

    // METHOD LAIN
    @Override
    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d, MMMM yyyy");

        super.printInfo();
        System.out.println("BUP\t\t: " + BUP.format(formatter));
        System.out.println("Tunjangan\t: " + tunjangan);
    }
}
