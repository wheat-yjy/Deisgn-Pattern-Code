package bridge;

public class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(Implementor implementor) {
        setImplementor(implementor);
    }

    public void operation() {
        System.out.println("in the refinedAbstraction");
        implementor.operationImp();
    }
}
