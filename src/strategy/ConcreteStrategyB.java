package strategy;

public class ConcreteStrategyB implements Strategy{
    @Override
    public void compute() {
        System.out.println("in the strategy B");
    }
}
