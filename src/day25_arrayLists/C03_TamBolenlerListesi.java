package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_TamBolenlerListesi {
    public static void main(String[] args) {
        // Soru 6-
        //         verilen pozitif bir  tamsayiyi
        //         tam bolebilen tum pozitif tamsayilari
        //         bir liste olarak bize donduren bir method olusturun.

        System.out.println(pozitifTamBolenlerinListesi(1400));




    }
    public static List<Integer> pozitifTamBolenlerinListesi(int sayi){
        List<Integer> tamBolnlerinListesi=new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){
                tamBolnlerinListesi.add(i);

            }
        }
        return tamBolnlerinListesi;
        
    }


}
