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

    public void sumPrice(List<Product> listOfProducts) {
        

    }

    public void addDiscount(int percent) {

    }

    public int getCartSize(Product listOfProducts) {

    }
}
