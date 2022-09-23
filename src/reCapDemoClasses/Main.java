package reCapDemoClasses;

public class Main {
    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();

        int toplamaSonuc=dortIslem.topla(2,3,6,2,7,5,3,2);
        int cıkarmaSonuc=dortIslem.Cikar(5,2);
        int carpmaSonuc=dortIslem.Carp(1,2,3,4,5);
        int bölmeSonuc=dortIslem.Bol(6,3);

        System.out.println("Toplama Sonucu : " + toplamaSonuc);
        System.out.println("Çıkarma Sonucu : " + cıkarmaSonuc);
        System.out.println("Çarpma Sonucu : " + carpmaSonuc);
        System.out.println("Bölme Sonucu : " + bölmeSonuc);
    }
}
