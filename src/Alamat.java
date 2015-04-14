
public class Alamat {

    private String nmrRumah, jalan, desKel, kabKot, prov; //harus ada

    /*Constructor menyesuaikan keharusan atribut
     Sehingga inisialisasi awal minimal memiliki atribut wajib.
     */
    public Alamat(String nmrRumah, String jalan, String desKel, String kabKot, String prov) {
        this.nmrRumah = nmrRumah;
        this.jalan = jalan;
        this.setDesKel(desKel);
        this.setKabKot(kabKot);
        this.setProv(prov);
    }

    public String getNmrRumah() {
        return nmrRumah;
    }

    public void setNmrRumah(String nmrRumah) {
        this.nmrRumah = nmrRumah;
    }

    public String getJalan() {
        return jalan;
    }

    public void setJalan(String jalan) {
        this.jalan = jalan;
    }

    public String getDesKel() {
        return desKel;
    }

    public void setDesKel(String desKel) {
        for (char c : desKel.toCharArray()) {
            if (Character.isDigit(c)) {
                return;
            }
        }
        this.desKel = desKel;
    }

    public String getKabKot() {
        return kabKot;
    }

    public void setKabKot(String kabKot) {
        for (char c : kabKot.toCharArray()) {
            if (Character.isDigit(c)) {
                return;
            }
        }
        this.kabKot = kabKot;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        for (char c : prov.toCharArray()) {
            if (Character.isDigit(c)) {
                return;
            }
        }
        this.prov = prov;
    }

    String cetakAlamat() {
        return (nmrRumah + ", " + jalan + ", " + desKel + ", " + kabKot + ", " + prov);
    }
}
