/**
 * Nama : Wahyu Eko Setyo P
 * NIM  : 24060124120015
 * File : Piaraan.java
 */

package Pertemuan10;

import java.util.LinkedList;

public class Piaraan {
    private LinkedList<Anabul> Lanabul;
    private int nbelm;

    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.addLast(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        if (!Lanabul.isEmpty()) {
            return Lanabul.getFirst();
        }
        return null;
    }

    public Anabul dequeueAnabul() {
        if (!Lanabul.isEmpty()) {
            nbelm--;
            return Lanabul.removeFirst();
        }
        return null;
    }

    public void showAnabul() {
        System.out.println("Daftar Panggilan Anabul dalam Antrean:");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama());
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                totalBobot += ((Kucing) a).getBobot();
            }
        }
        return totalBobot;
    }

    public void showJenisAnabul() {
        System.out.println("Daftar Jenis Anabul dalam Antrean:");
        for (Anabul a : Lanabul) {
            System.out.println("- Nama: " + a.getNama() + ", Jenis: " + a.getClass().getSimpleName());
        }
    }
}
