package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_KullanicidanSayiAlipArrayeEkle {
    public static void main(String[] args) {

        int[] arr = {3, 5, 8};

        // Kullanicidan bir sayi alip
        // arr'ye 4.element olarak ekleyin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen array'e eklemek istediginiz sayiyi giriniz");
        int eklenecekSayi = scanner.nextInt();

        arr=C06_ArrayeBirElemanEkleme.arrayeBirElamanEkle(arr,eklenecekSayi);

        System.out.println(Arrays.toString(arr));

        arr=C06_ArrayeBirElemanEkleme.arrayeBirElamanEkle(arr,111111111);
        System.out.println(Arrays.toString(arr));

        arr=C06_ArrayeBirElemanEkleme.arrayeBirElamanEkle(arr,17774111);
        System.out.println(Arrays.toString(arr));


    }
}
