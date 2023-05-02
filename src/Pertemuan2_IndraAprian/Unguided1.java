package Pertemuan2_IndraAprian;

import java.util.Scanner;

public class Unguided1 {

    public static void main(String[] args) {

        System.out.println("NAMA : Indra Aprian Kurniawan");
        System.out.println("NIM  : 21102221");

        Scanner input=new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("PROGRAM MENENTUKAN BILANGAN GENAP");
        System.out.println("=================================");

        System.out.print("Masukkan Batas Bilangan : ");
        int bilangan = input.nextInt();

        for (int i = 1; i <=bilangan; i++){
            if (i%2==0){
                System.out.println("Angka-" +i);
            }
            input.close();
        }
    }
}
