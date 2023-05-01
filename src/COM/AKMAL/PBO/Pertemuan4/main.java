package COM.AKMAL.PBO.Pertemuan4;

public class main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        pegawai pegawai = new pegawai();

        manager.nip = 123;
        manager.nama = "Mamay";

        pegawai.nip = 124;
        pegawai.nama = "mimiy";


        manager.showinfo();
        manager.extraInfo();
        manager.bonus(1000000);

        pegawai.showinfo();
        pegawai.extraInfo();
    }
}
