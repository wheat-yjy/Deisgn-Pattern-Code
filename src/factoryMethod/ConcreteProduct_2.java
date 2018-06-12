package factoryMethod;

public class ConcreteProduct_2 implements Product{

    public ConcreteProduct_2() {
        System.out.println("in the product 2");
    }

    @Override
    public int function() {
        return 0;
    }
}
