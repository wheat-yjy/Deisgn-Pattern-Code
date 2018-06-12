package singleInstance;

public class EagerSingleton {
    //这里采用的是懒汉式加载，如果用注释里的语句，getInstance方法不需要条件判断 直接return就好
    //private static final EagerSingleton m_instance = new EagerSingleton();
    private static EagerSingleton m_instance = null;
    private EagerSingleton() {}

    public static synchronized EagerSingleton getInstance() {
        if(m_instance == null) {
            m_instance = new EagerSingleton();
        }
        return m_instance;
    }
}
