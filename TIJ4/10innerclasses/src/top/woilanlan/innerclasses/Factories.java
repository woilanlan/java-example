package top.woilanlan.innerclasses;

interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Implementation1 implements Service{

    private Implementation1() {
    }

    @Override
    public void method1() {
        System.out.println("Implementation1 method1");
    }
    
    @Override
    public void method2() {
        System.out.println("Implementation1 method2");
    }
    public static ServiceFactory factory = new ServiceFactory(){

        @Override
        public Service getService() {
            return new Implementation1();
        }
    };
}

class Implementation2 implements Service{

    private Implementation2() {
    }

    @Override
    public void method1() {
        System.out.println("Implementation2 method1");
    }
    
    @Override
    public void method2() {
        System.out.println("Implementation2 method2");
    }
    public static ServiceFactory factory = new ServiceFactory(){

        @Override
        public Service getService() {
            return new Implementation2();
        }
    };
}

/**
 * Factories 再访工厂方法
 * 现在Implementation1和Implementation2的构造器都可以是private的
 * 并且没有任何必要去创建作为工厂的具类名
 * 另外，你经常只需要单一的工厂对象，
 * 因此本例中它被创建为Service实现中的一个static域
 */
public class Factories {

    public static void serviceConsumer(ServiceFactory factory) {
        Service s = factory.getService();
        s.method1();
        s.method2();
    }

    public static void show() {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}