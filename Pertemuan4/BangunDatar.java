public class BangunDatar {
    private int JmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    public BangunDatar(int JmlSisi, String warna, String border) {
    this.JmlSisi = JmlSisi;
    this.warna = warna;
    this.border = border;
    counterBangunDatar++;
}

    public int getJmlSisi() {
        return JmlSisi;
    }

    public void setJmlSisi(int JmlSisi) {
        this.JmlSisi = JmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }    

    public static int printCounterBangunDatar() {
        return counterBangunDatar;
    }

    public void printInfo() {
        System.out.println("Jumlah Sisi: " + this.JmlSisi);
        System.out.println("Warna: " + this.warna);
        System.out.println("Border: " + this.border);
    }
}
