package chainOfResponsibility;

public class ConcreteHandlerB extends Handler{
    @Override
    public void handleRequest() {
        if(getSuccessor() != null) {
            System.out.println("The request is passed to   " + getSuccessor());
            getSuccessor().handleRequest();
        } else {
            System.out.println("The request is handled here, ConcreteHandler B");
        }
    }
}
