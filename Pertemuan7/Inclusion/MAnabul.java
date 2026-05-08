/**
 * Nama : Wahyu Eko Setyo P
 * NIM  : 24060124120015
 * File : MAnabul.java
 */

package Pertemuan7.Inclusion;


class Anabul {
    private String Nama;

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public void Gerak() {}
    public void Bersuara() {}
}

class Kucing extends Anabul {
    public void Gerak() {
        System.out.println("Kucing berjalan");
    }

    public void Bersuara() {
        System.out.println("Meong");
    }
}

class Anjing extends Anabul {
    public void Gerak() {
        System.out.println("Anjing berlari");
    }

    public void Bersuara() {
        System.out.println("Guk-Guk");
    }
}

class Burung extends Anabul {
    public void Gerak() {
        System.out.println("Burung terbang");
    }

    public void Bersuara() {
        System.out.println("Cuit");
    }
}

public class MAnabul {
    public static void main(String[] args) {
        Anabul A1;

        System.out.println("\n[Anabul]");
        A1 = new Anabul();
        A1.Gerak();
        A1.Bersuara();
        System.out.println("");

        System.out.println("[Kucing]");
        A1 = new Kucing();
        A1.Gerak();
        A1.Bersuara();
        System.out.println("");

        System.out.println("[Anjing]");
        A1 = new Anjing();
        A1.Gerak();
        A1.Bersuara();
        System.out.println("");

        System.out.println("[Burung]");
        A1 = new Burung();
        A1.Gerak();
        A1.Bersuara();
        System.out.println("");
    }
}
