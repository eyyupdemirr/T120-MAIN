package day34_inheritance;

public class HRunner {
    public static void main(String[] args) {
        GAvciKuslar avciKusKartal = new GAvciKuslar();


        // AvciKuslar Class'indan aldigi özellikler
        avciKusKartal.hareket(); // ucarlar
        avciKusKartal.beslenme(); // et yerler
        avciKusKartal.pence(); // pencelidir
        avciKusKartal.gaga(); // sivri gagali
        // Kuslar Class'indan aldigi özellikler
        avciKusKartal.kanat(); // kanatlidirlar
        avciKusKartal.solunum(); // akcigerle nefes alirlar
        avciKusKartal.cogalma(); // yumurtayla cogalirlar
        // Hayvanlar Class'indan aldigi özellikler
        avciKusKartal.omur(); // yasar ve olurler

        System.out.println(avciKusKartal.toString());//gene sadece referansi yazdirir



    }
}
