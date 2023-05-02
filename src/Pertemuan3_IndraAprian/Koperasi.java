package Pertemuan3_IndraAprian;

public class Koperasi {

    //Atrubute
    String NamaBarang;
    int HargaSatuan;
    int JumlahBarang;
    int TotalHarga;

    //Constractor
    public void Koperasi(){}

    //Contractor berparameter
    public Koperasi(String NamaBarang, int HargaSatuan, int JumlahBarang) {
        this.NamaBarang = NamaBarang;
        this.HargaSatuan = HargaSatuan;
        this.JumlahBarang = JumlahBarang;

    }

    //Method
    public String getNamaBarang() {
        return NamaBarang;
    }

    public void setNamaBarang(String NamaBarang) {
        this.NamaBarang = NamaBarang;
    }

    public int getHargaSatuan() {
        return HargaSatuan;
    }

    public void setHargaSatuan(int HargaSatuan) {
        this.HargaSatuan = HargaSatuan;
    }

    public int getJumlahBarang() {
        return JumlahBarang;
    }

    public void setJumlahBarang(int JumlahBarang) {
        this.JumlahBarang = JumlahBarang;
    }

    public int getTotalHarga() {
        return TotalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        TotalHarga = totalHarga;
    }

    public void showinfo(){
        System.out.println("Nama Barang    :" + NamaBarang);
        System.out.println("Harga Satuan   :" + HargaSatuan);
        System.out.println("Jumlah Barang  :" + JumlahBarang);
        System.out.println("Total Harga    :" + TotalHarga);
        System.out.println();
    }
}
