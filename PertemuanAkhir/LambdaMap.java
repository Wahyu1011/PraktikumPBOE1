import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {

        Map<String, String> mahasiswa = new HashMap<>();

        mahasiswa.put("24060124120015", "Wahyu");
        mahasiswa.put("24060124130015", "Budi");
        mahasiswa.put("24060124140011", "Siti");

        System.out.println("Daftar Mahasiswa:");
        
        mahasiswa.forEach((nim, nama) -> {
            System.out.println("NIM  : " + nim);
            System.out.println("Nama : " + nama);
            System.out.println();
        });
    }
}