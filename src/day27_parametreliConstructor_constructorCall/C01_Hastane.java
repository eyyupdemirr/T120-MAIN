package day27_parametreliConstructor_constructorCall;

public class C01_Hastane {
    static String hastaneAdi = "Yildiz Hastanesi";
    static String hastaneTelefonu = "03122456754";
    String personelIsmi = "Isim atanmadi";
    String personelTelefonu = "telefon atanmadi";

    @Override
    public String toString() {
        return "C01_Hastane{" +
                "personelIsmi='" + personelIsmi + '\'' +
                ", personelTelefonu='" + personelTelefonu + '\'' +
                '}';
    }
}
