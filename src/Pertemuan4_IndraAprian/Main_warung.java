package Pertemuan4_IndraAprian;

import java.util.Scanner;
public class Main_warung {

    public static void main(String[] args) {
        //Menggunakan scanner untuk inputan dari keyboard
        Scanner input = new Scanner(System.in);
        //inisial menu
        WarungMakan wm = new WarungMakan();
        menu m = new menu();
        menu m1 = new menu();
        menu m2= new menu();
        menu m3= new menu();

        System.out.println();
        System.out.println("NAMA : FRANTINO SENEGAL");
        System.out.println("NIM  : 21102225");

        wm.nama_warung = "Warung Lesehan Tino";
        wm.alamat = "Kebondalem Pemalang";
        wm.no_telp = "082134297755";

        m1.no_makanan = 1;
        m1.nama_makanan = "Nasi Goreng";
        m1.harga = 10000;
        m1.stock= 10;

        m2.no_makanan = 2;
        m2.nama_makanan = "Nasi Goreng Spesial";
        m2.harga = 15000;
        m2.stock= 4;

        m3.no_makanan = 3;
        m3.nama_makanan = "Nasi Goreng Spesial + Telur";
        m3.harga = 20000;
        m3.stock= 20;

        wm.detailWarung();
        m1.detailMakanan();
        m2.detailMakanan();
        m3.detailMakanan();

        System.out.print("Masukkan Nomor Makanan      : ");
        m.no_makanan = input.nextInt();
        //Menggunakan Percabangan
        //untuk memilih menu 1
        if(m.no_makanan == 1){

            System.out.print("Masukkan Jumlah Pesanan     : ");
            wm.beliMakanan(m1, input.nextInt());
            m1.totalHarga();
            wm.cekStok(m1);
            // untuk memilih menu 2
        }else if (m.no_makanan == 2){
            System.out.print("Masukkan Jumlah Pesanan     : ");
            wm.beliMakanan(m2, input.nextInt());
            m2.totalHarga();
            wm.cekStok(m2);
            //untuk memilih menu 3
        }else if(m.no_makanan == 3){
            System.out.print("Masukkan Jumlah Pesanan    : ");
            wm.beliMakanan(m3, input.nextInt());
            m3.totalHarga();
            wm.cekStok(m3);
        }
        //berhenti memilih menu
        input.close();
    }
}
