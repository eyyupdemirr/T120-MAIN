package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_ArrayOlustur {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip
        //         array’i olusturan ve bize donduren bir method olusturun.

        System.out.println(Arrays.toString(arrayOlustur()));

    }
    public static int[] arrayOlustur(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen array in uzunlugunu giriniz");
        int uzunluk=scanner.nextInt();
        int[] arr=new int[uzunluk];

        for (int i = 0; i < arr.length; i++) {
            scanner=new Scanner(System.in);
            System.out.println("array icin element giriniz");
            arr[i]=scanner.nextInt();

        }
        return arr;

    }
}


































