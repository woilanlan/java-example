package access;

/**
 * 1、创建一个static方法，它创建一个新的Soup1对象并返回一个对它的引用
 * 在返回引用之前在Soup1上做一些额外的工作或者记录到底创建了多少个Soup1对象
 */
class Soup1{
    private Soup1(){}

    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

/**
 * 单例模式
 * 始终只能创建它的一个对象
 * Soup2的对象是作为Soup2的一个static private成员而创建的，所以有且只有一个
 * 通过public access()方法进行访问
 */
class Soup2{
    private Soup2(){}

    private static Soup2 ps1 = new Soup2();

    public static Soup2 access() {
        return ps1;
    }

    public void f() {
        
    }
}

/**
 * Lunch
 * 通过将所有的构造器指定为private来阻止直接创建某个类的实例
 * 
 * 2、
 */
public class Lunch {

    void testPrivate(){
        //Soup1 soup = new Soup1();
    }

    void testStatic(){
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton(){
        Soup2.access().f();
    }
}