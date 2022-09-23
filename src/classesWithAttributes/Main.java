package classesWithAttributes;

public class Main {

    public static void main(String[] args) {


        Product product = new Product();

        product.setId(1);
        product.setDescription("Asus PC");
        product.setPrice(4000);
        product.setName("Laptop");
        product.setStockAmount(10);
        System.out.println(product.getKod());

        Product product1 = new Product(2,"Telefon","LG Tel",2500,25, product.getKod());

        ProductManager productManager = new ProductManager();

        productManager.Add(product);

        productManager.bilgiVer(product);
        productManager.bilgiVer(product1);


    }
}
