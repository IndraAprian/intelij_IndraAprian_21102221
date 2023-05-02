package Pertemuan2_IndraAprian;

import java.util.Scanner;
public class Unguided2 {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("NAMA : Indra Aprian Kurniawan");
        System.out.println("NIM  : 21102221");
        System.out.println();
        System.out.println();

        String nama;
        int umur, Pilih;
        System.out.println("=====================================");
        System.out.println("-- Form Pendaftaran Mahasiswa Baru --");
        System.out.println("=====================================");
        System.out.print("Masukan Nama Anda : ");
        nama = input.nextLine();
        System.out.print("Masukan Umur Anda : ");
        umur = input.nextInt();

        if (umur <= 17) {
            clearScreen();
            System.out.println("Program tidak berjalan, Umur Anda Belum Mencukupi");


        }else if(nama == "") {
            System.out.println("ERROR, Mohon masukkan nama terlebih dahulu !!!");
        } else{
            clearScreen();
            System.out.println("Pilih Jurusan :");
            System.out.println("1. Teknik Informatika");
            System.out.println("2. Sistem Informasi");
            System.out.println("3. Rekayasa Perangkat Lunak");
            System.out.print("Masukan Pilihan : ");
            Pilih = input.nextInt();
            if (Pilih == 1) {
                System.out.println("====DATA DIRI====");
                System.out.println("Nama    : " + nama);
                System.out.println("Umur    : " + umur);
                System.out.println("Jurusan : Teknik Informatika");
            } else if (Pilih == 2) {
                System.out.println("====DATA DIRI====");
                System.out.println("Nama    : " + nama);
                System.out.println("Umur    : " + umur);
                System.out.println("Jurusan : Sistem informasi");
            } else if (Pilih == 3) {
                System.out.println("====DATA DIRI====");
                System.out.println("Nama    : " + nama);
                System.out.println("Umur    : " + umur);
                System.out.println("Jurusan : Sistem informasi");
            } else {
                System.out.println("Program eror, Pilihan tidak tersedia");
            }
        }
        input.close();
    }
}
