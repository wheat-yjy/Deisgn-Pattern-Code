package decorator;

public abstract class Decorator extends Component {

    Component component;

    public Decorator(Component c) {
        this.component = c;
    }

    @Override
    public String getDescription() {
        return component.getDescription();
    }

}

