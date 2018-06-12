package proxy;

public class RealSubject implements Subject{

    public void request() {
        System.out.println("in the realSubject");
    }

}
