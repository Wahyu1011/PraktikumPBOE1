/**
 * Nama : Wahyu Eko Setyo P
 * NIM  : 24060124120015
 * File : Teman.java
 */

package Pertemuan10;

import java.util.ArrayList;

public class Teman {
    private ArrayList<String> Lnama;
    private int Nbelm;

    public Teman() {
        Lnama = new ArrayList<>();
        Nbelm = 0;
    }

    public int getNbelm() {
        return Nbelm;
    }

    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < Nbelm) {
            return Lnama.get(indeks);
        }
        return null;
    }

    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < Nbelm) {
            Lnama.set(indeks, nama);
        }
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        Nbelm++;
    }

    public void delNama(String nama) {
        while (Lnama.contains(nama)) {
            Lnama.remove(nama);
            Nbelm--;
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru) {
        int index = Lnama.indexOf(nama);
        if (index != -1) {
            Lnama.set(index, namabaru);
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String s : Lnama) {
            if (s.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        System.out.println("Daftar Nama Teman : ");
        for (int i = 0; i < Nbelm; i++) {
            System.out.println((i + 1) + ". " + Lnama.get(i));
        }
    }
}