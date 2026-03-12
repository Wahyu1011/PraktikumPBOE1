import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenwali;
    private Kendaraan kendaraan;

    public Mahasiswa() {
        this.nama = "";
        this.nim = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<MataKuliah>();
        this.dosenwali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    public Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<MataKuliah>();
        this.dosenwali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    public String getNama() {
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }

    public String getProdi() {
        return this.prodi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void addMatkul(MataKuliah newMatkul) {
        this.listMatkul.add(newMatkul);
    }

    public void setDosenwali(Dosen dosenwali) {
        this.dosenwali = dosenwali;
    }

    public Dosen getDosenwali() {
        return this.dosenwali;
    }

    public Kendaraan getKendaraan() {
        return this.kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public int getjumlahSks() {
        int count = 0;
        for (int i = 0; i < this.listMatkul.size(); i++) {
            count = count + listMatkul.get(i).getSks();
        }
        return count;
    }

    public int getJumlahMatkul() {
        return listMatkul.size();
    }

    public void printMhs() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Prodi: " + this.prodi);
    }

    public void printDetailMhs() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Prodi: " + this.prodi);

        System.out.println("Daftar Mata Kuliah:");
        for (int i = 0; i < this.listMatkul.size(); i++) {
            System.out.println("- " + listMatkul.get(i).getNama() + 
            " (" + listMatkul.get(i).getSks() + " SKS)");
        }

        System.out.println("Dosen Wali: " + this.dosenwali.getNama());
        System.out.println("Kendaraan: " + this.kendaraan.getJenis() + 
        " dengan nomor plat " + this.kendaraan.getNoplat());
        System.out.println("NIP Dosen Wali: " + this.dosenwali.getNip());
    }
}