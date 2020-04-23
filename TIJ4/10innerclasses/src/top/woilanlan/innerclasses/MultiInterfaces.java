package top.woilanlan.innerclasses;

interface A {}

interface B {}

class X implements A,B {}

class Y implements A {
    B makeB(){
        //匿名内部类
        return new B() {};
    }
}


/**
 * MultiInterfaces
 * 必须在一个类中以某种方式实现两种接口，
 * 由于接口的灵活性，使用单一类，或者使用内部类。
 * 
 * 使用内部类最吸引人的原因是：
 * 每个内部类都能独立地继承自一个（接口的）实现，
 * 所以无论外围类是否已经继承了某个（接口的）实现，对内部类都没有影响
 * 
 */
public class MultiInterfaces {

    static void takesA(A a){}
    static void takesB(B a){}

    public static void show() {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }
}