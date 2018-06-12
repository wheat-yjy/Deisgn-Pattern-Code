package observer;

public class MAIN {
    public static void main(String[] args) {
        ConcreteSubject a = new ConcreteSubject();

        ConcreteObserver coa = new ConcreteObserver("COA");
        ConcreteObserver cob = new ConcreteObserver("COB");
        ConcreteObserver coc = new ConcreteObserver("COC");
        ConcreteObserver cod = new ConcreteObserver("COD");

        a.registerObserver(coa);
        a.registerObserver(cob);
        a.registerObserver(coc);
        a.registerObserver(cod);

        a.setData(50);

        a.removeObserver(coc);

        a.setData(20);
    }
}
