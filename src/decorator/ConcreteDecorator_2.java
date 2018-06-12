package decorator;

public class ConcreteDecorator_2 extends Decorator{

    private String description = "ConcreteDecorator_2";

    public ConcreteDecorator_2(Component c) {
        super(c);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + description;
    }
}
