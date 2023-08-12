package day34_inheritance;

public class DRunner {

    public static void main(String[] args) {

        Corolla corolla=new Corolla();

        System.out.println(corolla);//direk yazdirirsak referamsi yazdirir.
        // Corolla class'indaki ozellikler
        System.out.println(corolla.uretimYeri); // C Sakarya / Turkiye
        System.out.println(corolla.model); // C Corolla
        System.out.println(corolla.aku); // C Inci aku
        System.out.println(corolla.sanziman); // cvt


        // Araba class'indan aldigi ozellikler
        System.out.println(corolla.yakit); // yakit turu belirtilmedi
        corolla.yakit ="Benzin";
        System.out.println(corolla.yakit); // Benzin
        System.out.println(corolla.yil); // 1900
        System.out.println(corolla.renk); // renk belirtilmedi



    }





}
