package Pertemuan3_IndraAprian;

public class main_koperasi {

    public static void main(String[] args) {
        System.out.println("NAMA : Indra Aprian Kurniawan");
        System.out.println("NIM  : 21102221");
        System.out.println();

        System.out.println("=====Toko Indra=====");
        Koperasi BukuTulis = new Koperasi("Buku Tulis",
                2000, 20);
        Koperasi Pensil    = new Koperasi("Pensil",
                3000, 10);

        BukuTulis.HargaSatuan = 5000;
        BukuTulis.JumlahBarang = 10;
        BukuTulis.TotalHarga= (BukuTulis.getHargaSatuan()* BukuTulis.getJumlahBarang());

        Pensil.HargaSatuan = 3000;
        Pensil.JumlahBarang = 20;
        Pensil.TotalHarga= (Pensil.getHargaSatuan()* Pensil.getJumlahBarang());

        BukuTulis.showinfo();
        Pensil.showinfo();
        System.out.println("=======================");
        System.out.println(("Total Harga : "+(Pensil.getHargaSatuan()* Pensil.getJumlahBarang()+
                (BukuTulis.getHargaSatuan()*BukuTulis.getJumlahBarang()))));
        System.out.println("=======================");
    }
}
