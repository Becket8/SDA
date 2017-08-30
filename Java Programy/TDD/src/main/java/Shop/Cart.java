package Shop;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> listOfProducts = new ArrayList<Product>();

    public void addProduct(Product product) {
        listOfProducts.add(product);
    }

    public void addProducts(List<Product> products) {
        listOfProducts.addAll(products);
    }

    public void deleteProduct(Product product) {
        listOfProducts.remove(product);
    }

    public double sumPrice(List<Product> listOfProducts) {
        double sum = 0;
        for (Product p : listOfProducts) {
            sum = +p.getPrice();
        }

        return sum;
    }

    public void addDiscount(int percent) {
        /*for (Product p : listOfProducts) {
            double newPrice = p.getPrice() - (p.getPrice() * percent / 100);
            p.setPrice(newPrice);
        }*/
        listOfProducts.forEach(p->p.setPrice(p.getPrice() - (p.getPrice() * percent / 100)));
    }

    public int getCartSize(Product listOfProducts) {


    }
}
