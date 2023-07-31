package day27_parametreliConstructor_constructorCall;

public class C02_HastaneRunner {
    public static void main(String[] args) {

        C01_Hastane personel1=new C01_Hastane();
        System.out.println(personel1.personelIsmi);
        System.out.println(personel1.personelTelefonu);
        System.out.println(personel1.hastaneAdi);


        personel1.personelIsmi="mettkam";
        personel1.personelTelefonu="5855854";

        C01_Hastane personel2=new C01_Hastane();
        System.out.println(personel2.personelIsmi);
        System.out.println(personel2.personelTelefonu);
























    }
}
