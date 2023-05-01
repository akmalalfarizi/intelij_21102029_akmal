package COM.AKMAL.PBO.Pertemuan2;

public class Looping {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println("Perulangan for ke- " + i);
        }
        System.out.println("selesai perlangan for");

        int j = 0;
        while (j < 10) {
            System.out.println("Perulangan while ke- " + j);
            j++;
        }
        System.out.println("selesai perulangan while");

        int k = 0;
        do {
            System.out.println("perulangan do-while ke- " + k);
            k++;
        } while (k < 10);
        System.out.println("selesai perulangan do-while");
    }
}
