package COM.AKMAL.PBO.Pertemuan4.Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("NAMA : AKMAL");
        System.out.println("NIM  : 21102029");
        System.out.println();

        Scanner input = new Scanner(System.in);
        WarungMakan wm = new WarungMakan();
        Menu m = new Menu();
        Menu m1 = new Menu();
        Menu m2 = new Menu();
        Menu m3 = new Menu();

        wm.nama_warung = " Warung MAIL ";
        wm.alamat = "PNG";
        wm.no_telp = " 085671234567";

        m1.no_makanan = 1;
        m1.nama_makanan = "Seblak";
        m1.harga = 10000;
        m1.Stok = 10;

        m2.no_makanan = 2;
        m2.nama_makanan = "Seblak Spesial";
        m2.harga = 15000;
        m2.Stok = 4;

        m3.no_makanan = 3;
        m3.nama_makanan = "Seblak Spesial + Ayam";
        m3.harga = 20000;
        m3.Stok = 20;

        wm.detailwarung();
        m1.detailMakanan();
        m2.detailMakanan();
        m3.detailMakanan();

        System.out.print("Masukkan Nomor Makanan : ");
        m.no_makanan = input.nextInt();
        if (m.no_makanan == 1){
            System.out.print("Masukkan Jumlah Pesanan : ");
            wm.beliMakanan(m1, input.nextInt());
            m1.totalharga();
            wm.cekStok(m1);

        } else if (m.no_makanan == 2){
            System.out.print("Masukkan Jumlah Pesanan : ");
            wm.beliMakanan(m2, input.nextInt());
            m2.totalharga();
            wm.cekStok(m2);

        } else if (m.no_makanan == 3){
            System.out.print("Masukkan Jumlah Pesanan : ");
            wm.beliMakanan(m3, input.nextInt());
            m3.totalharga();
            wm.cekStok(m3);

        }
        input.close();
    }
}
