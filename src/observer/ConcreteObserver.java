package observer;

public class ConcreteObserver implements Observer{

    public int data;
    public String name;

    public ConcreteObserver(String na) {
        name = na;
    }

    @Override
    public void update(int data) {
        System.out.println(name + " receive the new data: " + data);
    }
}
