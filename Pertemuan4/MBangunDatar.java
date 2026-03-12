public class MBangunDatar {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(4, "Merah", "Solid", 5);
        Lingkaran lingkaran = new Lingkaran(14, "Biru", "Dashed");

        System.out.println("Informasi Persegi:");
        persegi.printInfo();
        System.out.println("Luas Persegi: " + persegi.getLuas());
        System.out.println("Keliling Persegi: " + persegi.getKeliling());
        System.out.println("Diagonal Persegi: " + persegi.getDiagonal());

        System.out.println("\nInformasi Lingkaran:");
        lingkaran.printInfo();
        System.out.println("Luas Lingkaran: " + lingkaran.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.getKeliling());
    }
    
}
