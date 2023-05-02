package Pertemuan3_IndraAprian;

import java.util.Scanner;
public class main_buku {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {
        int pilih;
        int jumlah, bayar, totalHarga;

        Scanner input = new Scanner(System.in);
        Buku bk1 = new Buku();
        Buku bk2 = new Buku();

        System.out.println("NAMA : Indra Aprian");
        System.out.println("NIM  : 21102221");
        System.out.println();
        System.out.println("===List Buku===");
        bk1.setNo_Buku(1);
        bk1.setJudul_Buku("Pemrograman Berbasis Objek dengan Java");
        bk1.setPengarang("Indrajani");
        bk1.setTahun_Terbit(2007);
        bk1.setHarga(70000);

        bk2.setNo_Buku(2);
        bk2.setJudul_Buku("Dasar Pemrograman Java");
        bk2.setPengarang("Abdul Kadir");
        bk2.setTahun_Terbit(2004);
        bk2.setHarga(30000);

        bk1.showinfo();
        bk2.showinfo();

        System.out.println("=========================================");
        System.out.print("Masukkan No Buku yang ingin dibeli     : ");
        pilih = input.nextInt();
        System.out.print("Masukkan jumlah buku yang ingin dibeli : ");
        jumlah = input.nextInt();

        if (pilih == 1){
            totalHarga = bk1.getHarga() * jumlah;
            System.out.println("Total Harga = " + totalHarga);
            System.out.print("Masukkan Jumlah uang : ");
            bayar = input.nextInt();
            if (bayar <= totalHarga){
                clearScreen();
                System.out.println("Mohon maaf uang anda tidak cukup.");
            }else {
                clearScreen();
                System.out.println();
                System.out.println("===Rincian pembelian buku===");
                bk1.showinfo();
                System.out.println("===Rincian Pembayaran===");
                System.out.println("Jumlah Bayar :" + bayar);
                System.out.println("Kembalian    :" + (bayar-totalHarga));
            }
        }else if (pilih == 2){
            totalHarga = bk2.getHarga() * jumlah;
            System.out.println("Total Harga : " + totalHarga);
            System.out.println("Masukkan Jumlah Uang : " );
            bayar = input.nextInt();
            if (bayar <= totalHarga){
                System.out.println("Mohon maaf uang anda tidak cukup.");
            }else {
                System.out.println("=== Rincian Pembayaran ===");
                bk2.showinfo();
                System.out.println("=== Rincian Pembayaran");
                System.out.println("Jumlah Bayar :" + bayar);
                System.out.println("Kembalian    :" + (bayar-totalHarga));
            }
        }else {
            System.out.println("Pilihan Tidak Tersedia");
        }
        input.close();
    }

}
