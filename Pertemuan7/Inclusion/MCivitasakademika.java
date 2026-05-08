/**
 * Nama : Wahyu Eko Setyo P
 * NIM  : 24060124120015
 * File : MCivitasakademika.java
 */

package Pertemuan7.Inclusion;


abstract class Civitasakademika {
    private String Nama;

    public Civitasakademika() {
        this.Nama = "";
    }

    public Civitasakademika(String nama) {
        this.Nama = nama;
    }

    public abstract String getNomor();

    public String getNama() {
        return Nama;
    }
    
    public void setNama(String nama) {
        this.Nama = nama;
    }
}

class Dosen extends Civitasakademika {
    private String NIP;

    public Dosen() {
        super();
        this.NIP = "";
    }

    public Dosen(String nama, String nip) {
        super(nama);
        this.NIP = nip;
    }

    public String getNomor() {
        return NIP;
    }

    public void setNIP(String nip) {
        this.NIP = nip;
    }
}

class Mahasiswa extends Civitasakademika {
    private String NIM;
    private Dosen Dosenwali;

    public Mahasiswa() {
        super();
        this.NIM = "";
        this.Dosenwali = null;
    }

    public Mahasiswa(String nama, String nim, Dosen dosenwali) {
        super(nama);
        this.NIM = nim;
        this.Dosenwali = dosenwali;
    }

    public String getNomor() {
        return NIM;
    }

    public Dosen getDosenwali() {
        return Dosenwali;
    }

    public void setNIM(String nim) {
        this.NIM = nim;
    }

    public void setWali(Dosen dosen) {
        this.Dosenwali = dosen;
    }

    public void tampilDataMahasiswa() {
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("NIM\t\t: " + getNomor());
        System.out.println("Dosen Wali\t: " + getDosenwali().getNama() + " (NIP: " + getDosenwali().getNomor() + ")\n");
    }
}

class Seminar {
    private Civitasakademika[] pesertas;
    private int banyakPeserta;

    public Seminar() {
        this.pesertas = new Civitasakademika[100];
        this.banyakPeserta = 0;
    }

    public int countPeserta() {
        return banyakPeserta;
    }

    public void registrasi(Civitasakademika peserta) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = peserta;
            banyakPeserta++;
        } else {
            System.out.println("Banyak peserta mencapai limit");
        }
    }

    public int countMahasiswa() {
        int counter = 0;
        for (int i = 0; i < countPeserta(); i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                counter++;
            }
        }
        return counter;
    }

    public void tampilPeserta() {
        for (int i = 0; i < countPeserta(); i++) {
            System.out.println(pesertas[i].getNama() + " (" + pesertas[i].getNomor() + ")");
        }
    }
}

public class MCivitasakademika {
    public static void main(String[] args) {
        Dosen D1, D2;
        Mahasiswa M1, M2, M3, M4, M5;
        Seminar S1;

        D1 = new Dosen("Dr. Wahyu", "198001012005011001");
        D2 = new Dosen();

        M1 = new Mahasiswa();
        M2 = new Mahasiswa("Setyo", "24060124120001", D2);
        M3 = new Mahasiswa("Eko","24060124120002",D1);
        M4 = new Mahasiswa("Andi","24060124120003",D2);
        M5 = new Mahasiswa("Budi","24060124120004",D1);

        S1 = new Seminar();

        D2.setNama("Michiko Tendo");
        D2.setNIP("348482001");

        M1.setNama("Putra");
        M1.setNIM("24060124120099");
        M1.setWali(D1);

        S1.registrasi(D1);
        S1.registrasi(D2);
        S1.registrasi(M1);
        S1.registrasi(M2);
        S1.registrasi(M3);
        S1.registrasi(M4);
        S1.registrasi(M5);

        System.out.println();
        M1.tampilDataMahasiswa();
        M2.tampilDataMahasiswa();
        M3.tampilDataMahasiswa();
        M4.tampilDataMahasiswa();
        M5.tampilDataMahasiswa();

        System.out.println("Jumlah Peserta Seminar\t\t: " + S1.countPeserta());
        System.out.println("Jumlah Mahasiswa pada Seminar\t: " + S1.countMahasiswa());
        S1.tampilPeserta();
    }
}
