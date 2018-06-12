package proxy;

public class Proxy implements Subject{

    RealSubject rs = new RealSubject();

    public void request() {
        System.out.println("in the proxy");
        rs.request();
    }

}
