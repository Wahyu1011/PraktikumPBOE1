import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class pegawai {
    
    private String NIP;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate TMT;
    private double  gajiPokok;

    public pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public LocalDate getTMT() {
        return TMT;
    }

    public double  getGajiPokok() {
        return gajiPokok;
    }

     public Period getMasaKerja() {
        return Period.between(TMT, LocalDate.now());
    }

    public LocalDate getTanggalPensiun() {
        return tanggalLahir.plusYears(65);
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setTMT(LocalDate TMT) {
        this.TMT = TMT;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        
        System.out.println("NIP\t\t: " + NIP);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Tanggal Lahir\t: " + tanggalLahir.format(formatter));
        System.out.println("TMT\t\t: " + TMT.format(formatter));
        System.out.println("Gaji Pokok\t: " + gajiPokok);
    }
}
