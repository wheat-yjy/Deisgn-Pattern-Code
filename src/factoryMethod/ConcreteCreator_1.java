package factoryMethod;

public class ConcreteCreator_1 implements Creator {

    @Override
    public Product createProduct() {
        System.out.println("creating product 1");
        return new ConcreteProduct_1();
    }
}
