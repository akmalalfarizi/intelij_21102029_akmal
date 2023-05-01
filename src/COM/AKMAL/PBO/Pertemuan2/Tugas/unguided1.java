package COM.AKMAL.PBO.Pertemuan2.Tugas;

import java.util.Scanner;
public class unguided1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;

        System.out.println("-- Program menampilkan Bilangan genap --");
        System.out.print("Input batas billangan :");
        bilangan = input.nextInt();


        for (int i = 1; i <= bilangan; i++) {
            if (i % 2 == 0) {
                System.out.println("Angka-" + i);
            }
        }
        input.close();
    }
}
