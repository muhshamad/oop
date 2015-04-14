
import java.util.Date;

public class Kelahiran {

    private Date lahir; //harus ada
    private Alamat tempatLahir; //harus ada
    private String caraLahir, Ibu, Bapak; //boleh kosong -- anak temuan/ tidak jelas

    /*Constructor menyesuaikan keharusan atribut
     Sehingga inisialisasi awal minimal memiliki atribut wajib.
     */
    public Kelahiran(Date lahir, Alamat tempatLahir) {
        this.lahir = lahir;
        this.tempatLahir = tempatLahir;
        this.Bapak = "Tidak diketahui";
        this.Ibu = "Tidak diketahui";
        this.caraLahir = "Tidak diketahui";
    }

    public Kelahiran(Date lahir, Alamat tempatLahir, String Ibu, String Bapak, String caraLahir) {
        this.lahir = lahir;
        this.tempatLahir = tempatLahir;
        this.setIbu(Ibu);
        this.setBapak(Bapak);
        this.setCaraLahir(caraLahir);
    }

    public Date getLahir() {
        return lahir;
    }

    public void setLahir(Date lahir) {
        this.lahir = lahir;
    }

    public Alamat getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(Alamat tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getCaraLahir() {
        return caraLahir;
    }

    public void setCaraLahir(String caraLahir) {
        for (char c : caraLahir.toCharArray()) {
            if (Character.isDigit(c)) {
                return;
            }
        }
        this.caraLahir = caraLahir;
    }

    public String getIbu() {
        return Ibu;
    }

    public void setIbu(String Ibu) {
        for (char c : Ibu.toCharArray()) {
            if (Character.isDigit(c)) {
                return;
            }
        }
        this.Ibu = Ibu;
    }

    public String getBapak() {
        return Bapak;
    }

    public void setBapak(String Bapak) {
        for (char c : Bapak.toCharArray()) {
            if (Character.isDigit(c)) {
                return;
            }
        }
        this.Bapak = Bapak;
    }

    void cetak() {
        System.out.println("Tanggal lahir: " + lahir);
        System.out.println("Lokasi kelahiran: " + tempatLahir.cetakAlamat());
        System.out.println("Nama Bapak: " + Bapak);
        System.out.println("Nama Ibu: " + Ibu);
        System.out.println("Metode kelahiran: " + caraLahir);
    }
}
