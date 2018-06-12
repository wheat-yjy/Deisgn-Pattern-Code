package strategy;

public class ConcreteStrategyA implements Strategy{
    @Override
    public void compute() {
        System.out.println("in the strategy A");
    }
}
