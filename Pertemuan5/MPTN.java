import java.time.LocalDate;

public class MPTN {
    public static void main(String[] args) {
        // Membuat objek pegawai
        pegawai p = new pegawai("24060124120015", "Wahyu Eko Setyo Pribowo", LocalDate.of(2005, 11, 10), LocalDate.of(2025, 3, 13), 500);

        // Menampilkan informasi pegawai
        p.printInfo();
    }
}