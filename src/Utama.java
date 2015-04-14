
import java.util.Date;

public class Utama {

    public static void main(String[] args) {
        Alamat Kendari = new Alamat("No. 3", "Jl. Gersamata", "Kel. Wua-Wua", "Kota. Kendari", "Prov. Sultra");
        Alamat Jakarta = new Alamat("No. 34B", "Jl. Otista Gg. Solihun", "Kel. Bidaracina", "Kota. Jakarta Timur", "Prov. DKI Jakarta");
        YangDilapor Shamad=new YangDilapor();        
        try {
            Shamad = new YangDilapor("M6uh. Shamad", Kendari);
        } catch (Exception e) {
            System.out.println("Terjadi error: "+e.getMessage());
        }
        System.out.println('\n');
        System.out.println("//Revisi:");
        try {
            Shamad = new YangDilapor("Muh. Shamad", Kendari);
        } catch (Exception e) {
            System.out.println("Terjadi error: "+e.getMessage());
        }
        Migrasi Kuliah = new Migrasi(Jakarta, new Date());
        Petugas Aziz = new Petugas("Moch. Azryl Aziz", "B221", "Penjaga 03", new Date(), new Date());
        Registrasi AA00001 = new Registrasi(Shamad, new Date(), "AA00001", Kuliah, Aziz);
        cetakRegistrasi(AA00001);
    }

    static void cetakRegistrasi(Registrasi regist) {
        System.out.println("=======INFORMASI KEPENDUDUKAN========");
        System.out.println("Telah dilaporkan bahwa terdapat " + regist.getStatus()
                + " dengan rincian sebagai berikut:");
        System.out.println("Nomor Registrasi: " + regist.getKodeReg());
        System.out.println("ID : " + regist.getOrang().getId());
        System.out.println("Nama : " + regist.getOrang().getNama());
        System.out.println("Alamat asal: " + regist.getOrang().getAsal().cetakAlamat());
        if (regist.getLahir() != null) {
            regist.getLahir().cetak();
        } else if (regist.getMati() != null) {
            regist.getMati().cetak();
        } else {
            regist.getMigrasi().cetak();
        }
        System.out.println("=====================================");
    }
}
