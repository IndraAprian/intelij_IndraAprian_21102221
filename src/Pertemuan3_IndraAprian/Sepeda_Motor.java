package Pertemuan3_IndraAprian;

public class Sepeda_Motor {

    //Atribute
    String merk;
    String tipe ;
    int harga;

    //Constractor
    public Sepeda_Motor(){}

    //Constractor ber parameter
    public Sepeda_Motor(String merk, String tipe, int harga) {
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }

    //Method

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void showinfo(){
        System.out.println("merek :" + merk);
        System.out.println("Tipe  :" + tipe);
        System.out.println("harga :" +harga);
        System.out.println();
    }
}
