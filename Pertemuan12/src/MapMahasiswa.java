/* 
 * File      : MapMahasiswa.java
 * Deskripsi : Implementasi lambda pada Map (HashMap),
 *             digunakan sebagai parameter pada method
 * Pembuat   : Wahyu Eko Setyo Pribowo (24060124120015)
 * Tanggal   : 4 Juni 2026
 */

import java.util.Map;
import java.util.HashMap;

public class MapMahasiswa {
    public static void main(String[] args) {
        Map<String, String> petaMahasiswa = new HashMap<>();
        petaMahasiswa.put("24060124120015", "Wahyu Eko");
        petaMahasiswa.put("24060124120190", "Budi");
        petaMahasiswa.put("24060124140007", "Citra");
        petaMahasiswa.put("24060124130006", "Dewi");
        petaMahasiswa.put("24060124110676", "Eko");

        System.out.println("=================================");
        System.out.println("|      NIM      |      Nama     |");
        System.out.println("=================================");
        petaMahasiswa.forEach((nim, n) -> {
            System.out.println("| " + nim + " | " + n + " |");
        });
    }
}
