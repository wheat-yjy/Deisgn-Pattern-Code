package adapter;

public class Adapter implements Target {

    Adaptee adaptee;

    public Adapter() {
       this.adaptee = new Adaptee();
    }

    @Override
    public void Request() {
        System.out.println("demanding in the Adapter");
        adaptee.specificRequest();
    }
}
