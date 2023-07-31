package day23_multiDimensionalArrays;

public class C05_SonIndexdekiElementlerinToplami {
    public static void main(String[] args) {

        // Soru 5- Verilen 2 katli bir array’de
        //         her bir inner array’in son elementlerinin
        //         toplaminini yazdiran bir method olusturun.

        int[][] sayilar = {{3, 4, 500}, {1, 400}, {5, 2, 100}, {1, 9, 0, 1000}};

        sonElementleriTopla(sayilar);


    }

    public static void sonElementleriTopla(int[][] sayi) {
        int toplam = 0;
        for (int i = 0; i < sayi.length; i++) {
            for (int j = sayi[i].length - 1; j <= sayi[i].length - 1; j++) {
                toplam += sayi[i][j];
                System.out.println("son sayilarin toplami  " + toplam);


            }

        }
        System.out.println("son sayilarin toplami  " + toplam);

    }
}
