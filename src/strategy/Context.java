package strategy;

public class Context {

    Strategy strategy;

    public void compute() {
        strategy.compute();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

}
