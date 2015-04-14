
import java.util.Date;

public class Registrasi {

    private YangDilapor orang; //harus ada
    private Date wktInput; //harus ada
    private String KodeReg, status; //harus ada
    private Kelahiran lahir; //salah satunya
    private Kematian mati;
    private Migrasi migrasi;
    private Petugas petugas;

    /*Constructor menyesuaikan keharusan atribut
     Sehingga inisialisasi awal minimal memiliki atribut wajib.
     */
    public Registrasi(YangDilapor orang, Date wktDate, String KodeReg, Kelahiran lahir, Petugas petugas) {
        this.orang = orang;
        this.wktInput = wktDate;
        this.KodeReg = KodeReg;
        this.lahir = lahir;
        this.petugas = petugas;
        this.status = "KELAHIRAN";
    }

    public Registrasi(YangDilapor orang, Date wktDate, String KodeReg, Kematian mati, Petugas petugas) {
        this.orang = orang;
        this.wktInput = wktDate;
        this.KodeReg = KodeReg;
        this.mati = mati;
        this.petugas = petugas;
        this.status = "KEMATIAN";
    }

    public Registrasi(YangDilapor orang, Date wktDate, String KodeReg, Migrasi migrasi, Petugas petugas) {
        this.orang = orang;
        this.wktInput = wktDate;
        this.KodeReg = KodeReg;
        this.migrasi = migrasi;
        this.petugas = petugas;
        this.status = "MIGRASI";
    }

    public YangDilapor getOrang() {
        return orang;
    }

    public void setOrang(YangDilapor orang) {
        this.orang = orang;
    }

    public Date getWktInput() {
        return wktInput;
    }

    public void setWktInput(Date wktInput) {
        this.wktInput = wktInput;
    }

    public String getKodeReg() {
        return KodeReg;
    }

    public void setKodeReg(String KodeReg) {
        this.KodeReg = KodeReg;
    }

    public Kelahiran getLahir() {
        return lahir;
    }

    public void setLahir(Kelahiran lahir) {
        this.lahir = lahir;
    }

    public Kematian getMati() {
        return mati;
    }

    public void setMati(Kematian mati) {
        this.mati = mati;
    }

    public Migrasi getMigrasi() {
        return migrasi;
    }

    public void setMigrasi(Migrasi migrasi) {
        this.migrasi = migrasi;
    }

    public Petugas getPetugas() {
        return petugas;
    }

    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }

    public String getStatus() {
        return status;
    }
}
