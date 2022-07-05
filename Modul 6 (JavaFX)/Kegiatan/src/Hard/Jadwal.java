package src.Hard;

import javafx.beans.property.SimpleStringProperty;

public class Jadwal {
    
    private SimpleStringProperty dosen;
    private SimpleStringProperty matkul;
    private SimpleStringProperty gkb;
    private SimpleStringProperty waktu;
    private SimpleStringProperty ruang;

    public Jadwal (String t_dosen, String t_matkul, String t_gkb, String t_waktu, String t_ruang){
        this.dosen = new SimpleStringProperty(t_dosen);
        this.matkul = new SimpleStringProperty(t_matkul);
        this.gkb = new SimpleStringProperty(t_gkb);
        this.waktu = new SimpleStringProperty(t_waktu);
        this.ruang = new SimpleStringProperty(t_ruang);
    }

    public String getDosen() {
        return dosen.get();
    }
    public void setDosen(String dosen) {
        this.dosen.set(dosen);
    }
        
    public String getMatkul() {
        return matkul.get();
    }
    public void setMatkul(String matkul) {
        this.matkul.set(matkul);
    }

    public String getGKB() {
        return gkb.get();
    }
    public void setGKB(String gkb) {
        this.gkb.set(gkb);
    }

    public String getWaktu() {
        return waktu.get();
    }
    public void setWaktu(String waktu) {
        this.waktu.set(waktu);
    }
        
    public String getRuang() {
        return ruang.get();
    }
    public void setRuang(String ruang) {
        this.ruang.set(ruang);
    }
}