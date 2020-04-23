package top.woilanlan.innerclasses;

interface Incrementable {
    void increment();
}

// 简单实现
class Callee1 implements Incrementable {

    private int i = 0;

    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

class MyIncrement {
    public void increment() {
        System.out.println("Other operation");
    }

    static void f(MyIncrement mi) {
        mi.increment();
    }
}

// Callee2继承MyIncrement，已有了一个不同的increment()方法，
// 与Incrementable接口期望的increment()方法完全不相关，
// 所以只能使用内部类独立的实现Incrementable
class Callee2 extends MyIncrement {
    private int i = 0;

    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }

    private class Closure implements Incrementable{
        @Override
        public void increment() {
            // 指明外部类的方法，否则将无穷递归
            Callee2.this.increment();
        } 
    }
    Incrementable getCallbackReference(){
        return new Closure();
    }
}

class Caller{
    private Incrementable callbackReference;

    public Caller(Incrementable cbh) {
        this.callbackReference = cbh;
    }
    void go(){
        callbackReference.increment();
    }  
}

/**
 * Callbacks
 * 闭包和回调
 */
public class Callbacks {

    public static void show() {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}