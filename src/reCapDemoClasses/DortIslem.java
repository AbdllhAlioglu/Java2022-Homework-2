package reCapDemoClasses;

public class DortIslem {

    public int topla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

    public int Cikar(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }

    public int Carp(int... sayilar) {
        int sonuc = 1;
        for (int sayi : sayilar) {
            sonuc *= sayi;
        }
        return sonuc;
    }

    public int Bol(int sayi1, int sayi2) {
        return sayi1 / sayi2;
    }
}
