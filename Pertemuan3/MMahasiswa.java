public class MMahasiswa {
    public static void main(String[] args) {

        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah BasisData = new MataKuliah("BasDat", "Basis Data", 3);
        MataKuliah Algoritma = new MataKuliah("ASA", "Analisa Algoritma", 3);

        Mahasiswa mhs1 = new Mahasiswa("Rizky", "123456789", "Informatika");
        Dosen dosen1 = new Dosen("Pak Budi", "987654321", "Informatika");
        mhs1.setDosenwali(dosen1);
        mhs1.addMatkul(PBO);
        mhs1.addMatkul(BasisData);
        mhs1.addMatkul(Algoritma);

        Kendaraan motor = new Kendaraan("B 1234 ABC", "Motor");
        mhs1.setKendaraan(motor);

        System.out.println("Nama Mahasiswa: " + mhs1.getNama());
        System.out.println("NIM: " + mhs1.getNim());
        System.out.println("Prodi: " + mhs1.getProdi());
        System.out.println("Dosen Wali: " + mhs1.getDosenwali().getNama());
        System.out.println("Jumlah Matkul: " + mhs1.getJumlahMatkul());
        System.out.println("Jumlah SKS: " + mhs1.getjumlahSks());
        System.out.println("Kendaraan: " + mhs1.getKendaraan().getJenis() + 
                           " dengan noplat " + mhs1.getKendaraan().getNoplat());

        mhs1.printMhs();
        mhs1.printDetailMhs();
    }
}