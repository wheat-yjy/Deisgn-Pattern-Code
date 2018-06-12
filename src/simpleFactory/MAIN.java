package simpleFactory;

public class MAIN {
    public static void main(String[] args) {
        Creator c = new Creator();
        System.out.println("demanding concrete product 0");
        c.factory(0);
        System.out.println("demanding concrete product 1");
        c.factory(1);
        System.out.println("demanding concrete product 2");
        c.factory(2);
    }
}
