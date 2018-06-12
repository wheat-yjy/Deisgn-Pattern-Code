package decorator;

public class ConcreteDecorator_1 extends Decorator{

    private String description = "ConcreteDecorator_1";

    public ConcreteDecorator_1(Component c) {
        super(c);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + description;
    }
}
