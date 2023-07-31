package day14_forLoops;

import java.util.Scanner;

public class C04_Faktoriyel {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //         bu sayinin faktoryel degerini hesaplayin.
        //         Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 20 den kucuk sayi gir");
        int sayi=scanner.nextInt();
        int faktoriyel=1;
        if (sayi>20){
            System.out.println("Lutfen 20 den kucuk sayi gir");
        }else {
            for (int i = 1; i <= sayi; i++) {
                faktoriyel*=i;                               //faktoriyela=faktoriyel*i
                System.out.println(faktoriyel);
                }
            System.out.println("  "+faktoriyel);
        }







    }
}
