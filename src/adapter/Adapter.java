package adapter;

public class Adapter extends Adaptee implements Target {

    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
       this.adaptee = adaptee;
    }

    @Override
    public void Request() {
        System.out.println("demanding in the Adapter");
        adaptee.specificRequest();
    }
}
