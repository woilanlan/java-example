package top.woilanlan.interfaces;

interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Implementation1 implements Service{

    Implementation1() {}    //包访问

    @Override
    public void method1() {
        System.out.println("Implementation1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1 method2");
    }
}

class Implementation1Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implementation1();
    }
}

class Implementation2 implements Service{
    Implementation2() {}    //包访问

    @Override
    public void method1() {
        System.out.println("Implementation2 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2 method2");
    }
}

class Implementation2Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implementation2();
    }
}

/**
 * Factories 接口与工厂
 * 接口是实现多重继承的途径，而生成遵循某个接口的典型方式就是工厂方法设计模式
 */
public class Factories {

    //如果不是用工厂方法，你的代码就必须在某处指定将要创建的Service的确切类型，以便调用合适的构造器
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void show() {
        serviceConsumer(new Implementation1Factory());
        //实现完全的可互换
        serviceConsumer(new Implementation2Factory());
    }
}