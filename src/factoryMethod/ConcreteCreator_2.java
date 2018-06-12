package factoryMethod;

public class ConcreteCreator_2 implements Creator {

    @Override
    public Product createProduct() {
        System.out.println("creating product 2");
        return new ConcreteProduct_2();
    }
}
