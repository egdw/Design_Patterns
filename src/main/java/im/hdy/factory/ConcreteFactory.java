package im.hdy.factory;

public class ConcreteFactory extends Factory {
    @Override
    public Product createProduct(Product product) {
        return product;
    }

    @Override
    public Product createProductByName(String productName) {
        if ("ConcereProduct1".equals(productName)) {
            return new ConcereProduct1();
        } else if ("ConcereProduct1".equals(productName)) {
            return new ConcereProduct2();
        }
        return null;
    }
}
