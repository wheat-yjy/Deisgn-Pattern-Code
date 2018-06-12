package abstractFactory;

import factoryMethod.ConcreteProduct_1;

// 抽象工厂模式其实是赋予了产品又一个层级, 来自写代码的时候的领悟
public class MAIN {
    public static void main(String[] args) {
        Creator c1 = new ConcreteCreator_1();
        System.out.println("demanding product A1 & B1");
        c1.factoryA();
        c1.factoryB();
        Creator c2 = new ConcreteCreator_2();
        System.out.println("demanding product A2 & B2");
        c2.factoryA();
        c2.factoryB();
    }
}
