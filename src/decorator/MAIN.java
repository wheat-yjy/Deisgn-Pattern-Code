package decorator;

public class MAIN {
    public static void main(String[] args) {
        Component cc = new ConcreteComponent();
        System.out.println(cc.getDescription());
        cc = new ConcreteDecorator_1(cc);
        System.out.println(cc.getDescription());
        cc = new ConcreteDecorator_2(cc);
        System.out.println(cc.getDescription());
    }
}
