package chainOfResponsibility;

public class Handler {

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    private Handler successor;

    public void handleRequest() {

    }
}
