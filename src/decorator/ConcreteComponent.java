package decorator;

public class ConcreteComponent extends Component{

    private String description = "ConcreteComponent";

    @Override
    public String getDescription() {
        return description;
    }
}
