package factoryMethod;

public class MAIN {
    public static void main(String[] args) {
        Creator c1 = new ConcreteCreator_1();
        c1.createProduct();
        Creator c2 = new ConcreteCreator_2();
        c2.createProduct();
    }
}
