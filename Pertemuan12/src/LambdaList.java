/* 
 * File      : LambdaList.java
 * Deskripsi : Implementasi lambda pada List,
 *             digunakan sebagai parameter pada method
 * Pembuat   : Wahyu Eko Setyo Pribowo (24060124120015)
 * Tanggal   : 4 Juni 2026
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> daftarNamaMhs = new ArrayList<>();
        daftarNamaMhs.add("Andi");
        daftarNamaMhs.add("Budi");
        daftarNamaMhs.add("Siti");
        daftarNamaMhs.add("Rina");

        daftarNamaMhs.forEach((n) -> {
            System.out.println("Nama Mahasiswa: " + n);
        });
    }
}
