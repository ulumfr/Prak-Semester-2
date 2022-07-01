package src.Hard;

public class Jadwal {
    private int id, gkb;
    private String dosen, matkul, waktu, ruang;

    public Jadwal (int id, String dosen, String matkul, int gkb, String waktu, String ruang){
        this.id = id;
        this.dosen = dosen;
        this.matkul = matkul;
        this.gkb = gkb;
        this.waktu = waktu;
        this.ruang = ruang;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDosen() {
        return dosen;
    }
    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public String getMatkul() {
        return matkul;
    }
    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public int getGKB() {
        return gkb;
    }
    public void setGKB(int gkb) {
        this.gkb = gkb;
    }

    public String getWaktu() {
        return waktu;
    }
    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getRuang() {
        return ruang;
    }
    public void setRuang(String ruang) {
        this.ruang = ruang;
    }

}
