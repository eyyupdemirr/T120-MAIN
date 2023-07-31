package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_TumElementleriToplama {
    public static void main(String[] args) {
        int[] arrTek = {3, 7, 1, 9, 2, 5};
        // Bu array'in tum elementlerini toplayin

        int toplam = 0;

        for (int i = 0; i < arrTek.length; i++) {

            toplam = toplam + arrTek[i];

        }
        System.out.println(toplam);
        System.out.println("============================");
        // arr[i] inner array'leri getirir
        // arr[i][j] bize int elementleri verir
        // yani kat sayisi kadar index'e yani forLoop'a ihtiyacimiz var

        int[][] sayilar = {{1, 2, 5}, {7, 4}, {9}, {3, 0, 1, 6, 8}};


        toplam = 0; //toplami eski islemden dolayi sifiirlamak lazim int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {

            for (int j = 0; j < sayilar[i].length; j++) {

                toplam = toplam + sayilar[i][j];

            }

        } System.out.println(toplam);


    }
}
