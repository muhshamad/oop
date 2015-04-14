
public class YangDilapor {

    private String nama, id; //harus ada, kecuali id
    private Alamat asal, lahir; //harus ada, kecuali lahir
    
    //Fasilitas Exception ada pada class ini
    public YangDilapor(){
    }
    
    public YangDilapor(String nama, Alamat asal) throws Exception {
        this.setNama(nama);
        this.setAsal(asal);
        this.id = "Tidak tersedia";
        this.lahir = null;
    }

    public YangDilapor(String nama, Alamat asal, String id, Alamat lahir) throws Exception {
        this.setNama(nama);
        this.asal = asal;
        this.id = id;
        this.lahir = lahir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) throws Exception{
        for (char c : nama.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new Exception("Nama harus tidak mengandung angka!");
            }
        }
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Alamat getLahir() {
        return lahir;
    }

    public void setLahir(Alamat lahir) {
        this.lahir = lahir;
    }

    public Alamat getAsal() {
        return asal;
    }

    public void setAsal(Alamat asal) {
        this.asal = asal;
    }
}
