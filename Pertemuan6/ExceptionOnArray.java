/**
 * Nama : Wahyu Eko Setyo P
 * NIM  : 24060124120015
 * File : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library Java
 */

package Pertemuan6;

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Clean Up Code...");
        }
    }
}
