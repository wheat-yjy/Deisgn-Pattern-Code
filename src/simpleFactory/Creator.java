package simpleFactory;

public class Creator {
    public Product factory(int pid) {
        Product p = null;
        switch (pid) {
            case 0: {
                p = new ConcreteProduct_0();
                break;
            }
            case 1: {
                p = new ConcreteProduct_1();
                break;
            }
            case 2: {
                p = new ConcreteProduct_2();
                break;
            }
        }
        return p;
    }
}
