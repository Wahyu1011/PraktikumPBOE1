/**
 * Nama : Wahyu Eko Setyo P
 * NIM  : 24060124120015
 * File : MainTeman.java
 */

package Pertemuan10;

public class MainTeman {
    public static void main(String[] args) {
        Teman koleksiTeman = new Teman();

        System.out.println("--- Menambah Teman ---");
        koleksiTeman.addNama("Budi");
        koleksiTeman.addNama("Ani");
        koleksiTeman.addNama("Caca");
        koleksiTeman.addNama("Budi"); // Menambah nama duplikat untuk test countNama
        koleksiTeman.showTeman();

        System.out.println("\nJumlah teman (nbelm): " + koleksiTeman.getNbelm());

        System.out.println("\n--- Test getNama ---");
        System.out.println("Teman index 1: " + koleksiTeman.getNama(1));

        System.out.println("\n--- Test setNama ---");
        koleksiTeman.setNama(1, "Anita");
        System.out.println("Ani diubah menjadi Anita");
        koleksiTeman.showTeman();

        System.out.println("\n--- Test isMember ---");
        System.out.println("Apakah 'Caca' ada? " + koleksiTeman.isMember("Caca"));
        System.out.println("Apakah 'Dedi' ada? " + koleksiTeman.isMember("Dedi"));

        System.out.println("\n--- Test countNama ---");
        System.out.println("Jumlah nama 'Budi': " + koleksiTeman.countNama("Budi"));

        System.out.println("\n--- Test gantiNama ---");
        koleksiTeman.gantiNama("Budi", "Budiman");
        System.out.println("Budi pertama diganti menjadi Budiman");
        koleksiTeman.showTeman();

        System.out.println("\n--- Test delNama ---");
        koleksiTeman.delNama("Budiman");
        System.out.println("Budiman dihapus");
        koleksiTeman.showTeman();
        
        System.out.println("\nJumlah teman akhir: " + koleksiTeman.getNbelm());
    }
}
