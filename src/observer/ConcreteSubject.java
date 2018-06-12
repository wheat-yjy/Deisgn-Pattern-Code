package observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject{

    private ArrayList<Observer> observers;

    public ConcreteSubject() {
        observers = new ArrayList<>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
        notifyObserver();
    }

    private int data;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.isEmpty()) {
            return;
        }
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o: observers) {
            o.update(data);
        }
    }
}
