public class MataKuliah {
    private String idmatkul;
    private String nama;
    private int sks;

    public MataKuliah() {
        this.idmatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    public MataKuliah(String idmatkul, String nama, int sks) {
        this.idmatkul = idmatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdmatkul() {
        return this.idmatkul;
    }

    public String getNama() {
        return this.nama;
    }

    public int getSks() {
        return this.sks;
    }

    public void setIdmatkul(String idmatkul) {
        this.idmatkul = idmatkul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
