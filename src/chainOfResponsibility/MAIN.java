package chainOfResponsibility;

public class MAIN {

    public static void main(String[] args) {
        Handler handler = new ConcreteHandlerA();
        Handler handler1 = new ConcreteHandlerB();
        handler.setSuccessor(handler1);
        handler.handleRequest();
    }

}
