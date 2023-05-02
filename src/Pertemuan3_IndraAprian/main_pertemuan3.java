package Pertemuan3_IndraAprian;

public class main_pertemuan3 {

    public static void main(String[] args) {

        System.out.println("=====DEALER FRANTINO=====");
        Sepeda_Motor Suzuki = new Sepeda_Motor();
        Sepeda_Motor Yamaha = new Sepeda_Motor();
        Sepeda_Motor Honda = new Sepeda_Motor();

        Suzuki.merk = "Suzuki";
        Suzuki.tipe = "GSX 150R";
        Suzuki.harga = 20000000;

        Yamaha.merk = "Yamaha";
        Yamaha.tipe = "YZF R15";
        Yamaha.harga = 25000000;

        Honda.merk = "Honda";
        Honda.tipe = "CBR 150";
        Honda.harga = 23500000;

        Suzuki.showinfo();
        Yamaha.showinfo();
        Honda.showinfo();

        Sepeda_Motor vespa = new Sepeda_Motor("Vespa",
                "Vespa Matic", 40000000);
        vespa.showinfo();

        //Sebelum
        System.out.println(
                "Motor Merek : " + vespa.getMerk() +
                        "Dengan Tipe (Befor) : " + vespa.getTipe()
        );
//       //Melakukan proses perubahan
        vespa.setTipe("Sprint");

        //Lihat hasil perubahan
        System.out.println(
                "Motor Merek : " + vespa.getMerk() +
                        "Dengan tipe (after) : " + vespa.getTipe()
        );

    }
}
