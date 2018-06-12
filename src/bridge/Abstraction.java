package bridge;

public abstract class Abstraction {

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    Implementor implementor;

    public abstract void operation();

}
