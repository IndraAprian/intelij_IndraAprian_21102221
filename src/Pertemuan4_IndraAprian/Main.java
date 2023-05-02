package Pertemuan4_IndraAprian;

public class Main {

    public static void main(String[] args) {
        Manajer manajer = new Manajer();
        Pegawai pegawai = new Pegawai();

        manajer.nip  = 21102221;
        manajer.nama = "Indra";

        pegawai.nip = 123456789;
        pegawai.nama = "Akmal";

        manajer.showinfo();
        manajer.extrainfo();
        manajer.bonus(1000000);

        pegawai.showinfo();
        pegawai.extrainfo();

    }
}
