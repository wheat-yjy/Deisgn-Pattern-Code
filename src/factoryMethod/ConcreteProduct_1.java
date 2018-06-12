package factoryMethod;

public class ConcreteProduct_1 implements Product{

    public ConcreteProduct_1() {
        System.out.println("in the product 1");
    }

    @Override
    public int function() {
        return 0;
    }
}
