package classesWithAttributes;

public class ProductManager {

    public void bilgiVer(Product product) {
        System.out.println("*******************************************");
        System.out.println("ürün ID : " + product.getId());
        System.out.println("Ürün Kodu : " + product.getKod());
        System.out.println("Ürün Adı : " + product.getName());
        System.out.println("Ürün Açıklaması : " + product.getDescription());
        System.out.println("Ürün Fiyatı : " + product.getPrice());
        System.out.println("Ürün Stok Adeti : " + product.getStockAmount());
        System.out.println("*******************************************");

    }

    public void Add(Product product) {

        System.out.println("Ürün eklendi : " + product.getName());
    }

    public void Add() {

    }
}
