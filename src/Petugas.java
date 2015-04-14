
import java.util.Date;

public class Petugas {

    private String nama, idPetugas, jabatan; //harus ada
    private Date mulai, akhir; //harus ada

    /*Constructor menyesuaikan keharusan atribut
     Sehingga inisialisasi awal minimal memiliki atribut wajib.
     */
    public Petugas(String nama, String idPetugas, String jabatan, Date mulai, Date akhir) {
        this.setNama(nama);
        this.idPetugas = idPetugas;
        this.jabatan = jabatan;
        this.mulai = mulai;
        this.akhir = akhir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        for (char c : nama.toCharArray()) {
            if (Character.isDigit(c)) {
                return;
            }
        }
        this.nama = nama;
    }

    public String getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public Date getMulai() {
        return mulai;
    }

    public void setMulai(Date mulai) {
        this.mulai = mulai;
    }

    public Date getAkhir() {
        return akhir;
    }

    public void setAkhir(Date akhir) {
        this.akhir = akhir;
    }
}
