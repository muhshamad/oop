
import java.util.Date;

public class Kematian {

    private Date tglKematian; //harus ada
    private Alamat LokasiKematian; //harus ada
    private String penyebab; //boleh tidak ada
    private String tempatKubur; //boleh tidak ada -- misal, hilang

    /*Constructor menyesuaikan keharusan atribut
     Sehingga inisialisasi awal minimal memiliki atribut wajib.
     */
    public Kematian(Date tglKematian, Alamat LokasiKematian) {
        this.tglKematian = tglKematian;
        this.LokasiKematian = LokasiKematian;
        this.penyebab = "Tidak diketahui";
        this.tempatKubur = "Tidak diketahui";
    }

    public Kematian(Date tglKematian, Alamat LokasiKematian, String penyebab, String tempatKubur) {
        this.tglKematian = tglKematian;
        this.LokasiKematian = LokasiKematian;
        this.setPenyebab(penyebab);
        this.setTempatKubur(tempatKubur);
    }

    public Date getTglKematian() {
        return tglKematian;
    }

    public void setTglKematian(Date tglKematian) {
        this.tglKematian = tglKematian;
    }

    public Alamat getLokasiKematian() {
        return LokasiKematian;
    }

    public void setLokasiKematian(Alamat LokasiKematian) {
        this.LokasiKematian = LokasiKematian;
    }

    public String getPenyebab() {
        return penyebab;
    }

    public void setPenyebab(String penyebab) {
        for (char c : penyebab.toCharArray()) {
            if (Character.isDigit(c)) {
                return;
            }
        }
        this.penyebab = penyebab;
    }

    public String getTempatKubur() {
        return tempatKubur;
    }

    public void setTempatKubur(String tempatKubur) {
        for (char c : tempatKubur.toCharArray()) {
            if (Character.isDigit(c)) {
                return;
            }
        }
        this.tempatKubur = tempatKubur;
    }

    void cetak() {
        System.out.println("Tanggal kematian: " + tglKematian);
        System.out.println("Lokasi kematian: " + LokasiKematian.cetakAlamat());
        System.out.println("Sebab kematian: " + penyebab);
        System.out.println("Lokasi penguburan: " + tempatKubur);
    }
}
