
import java.util.Date;

public class Migrasi {

    private Alamat tujuan; //harus ada
    private Date tglPindah; //harus ada

    /*Constructor menyesuaikan keharusan atribut
     Sehingga inisialisasi awal minimal memiliki atribut wajib.
     */
    public Migrasi(Alamat tujuan, Date tglPindah) {
        this.tujuan = tujuan;
        this.tglPindah = tglPindah;
    }

    public Alamat getTujuan() {
        return tujuan;
    }

    public void setTujuan(Alamat tujuan) {
        this.tujuan = tujuan;
    }

    public Date getTglPindah() {
        return tglPindah;
    }

    public void setTglPindah(Date tglPindah) {
        this.tglPindah = tglPindah;
    }

    void cetak() {
        System.out.println("Tujuan pindah: " + tujuan.cetakAlamat());
        System.out.println("Tanggal pindah: " + tglPindah);
    }
}
