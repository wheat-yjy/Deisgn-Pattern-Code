package chainOfResponsibility;

public class ConcreteHandlerA extends Handler{
    @Override
    public void handleRequest() {
        if(getSuccessor() != null) {
            // 这里的条件可以是请假批准里的天数比较，三天主任批，十天老总批，通过这个来动态指定处理请求的对象
            System.out.println("The request is passed to   " + getSuccessor());
            getSuccessor().handleRequest();
        } else {
            System.out.println("The request is handled here, ConcreteHandler A");
        }
    }
}
