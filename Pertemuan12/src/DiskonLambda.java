/* 
 * File      : DiskonLambda.java
 * Deskripsi : Ekspresi lambda dasar, digunakan untuk menghitung diskon
 * Pembuat   : Wahyu Eko Setyo Pribowo (24060124120015)
 * Tanggal   : 4 Juni 2026
 */

interface IDiskon {
    public double hitungDiskon(int harga);    
}

public class DiskonLambda {
    public static void main(String[] args) {
        // Tanpa ekspresi lambda
        IDiskon potonganMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        // Menggunakan lambda
        IDiskon potonganLebaran = (h) -> h - (h * 0.4);

        // Menggunakan lambda dengan blok statement
        IDiskon potonganBiasa = (hrg) -> {
            return hrg - (hrg * 0.1);
        };

        int hargaAwal = 50000;
        System.out.println("Harga Awal: " + hargaAwal);
        System.out.println("Harga setelah diskon Merdeka: " + potonganMerdeka.hitungDiskon(hargaAwal));
        System.out.println("Harga setelah diskon Lebaran: " + potonganLebaran.hitungDiskon(hargaAwal));
        System.out.println("Harga setelah diskon Biasa: " + potonganBiasa.hitungDiskon(hargaAwal));
    }
}
