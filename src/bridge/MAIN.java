package bridge;

public class MAIN {

    public static void main(String[] args) {
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(new ConcreteImplementorA());
        refinedAbstraction.operation();
        RefinedAbstraction refinedAbstraction1 = new RefinedAbstraction(new ConcreteImplementorB());
        refinedAbstraction1.operation();
    }

}
