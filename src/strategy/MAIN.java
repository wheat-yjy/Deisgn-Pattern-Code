package strategy;

public class MAIN {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.compute();
        context.setStrategy(new ConcreteStrategyB());
        context.compute();
        context.setStrategy(new ConcreteStrategyC());
        context.compute();
    }

}
