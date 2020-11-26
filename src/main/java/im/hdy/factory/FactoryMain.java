package im.hdy.factory;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product productOne = factory.createProduct(new ConcereProduct1());
        Product productTwo = factory.createProduct(new ConcereProduct2());
        productOne.operation();
        productTwo.operation();
    }
}
