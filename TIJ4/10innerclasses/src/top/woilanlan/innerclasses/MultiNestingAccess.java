package top.woilanlan.innerclasses;

import top.woilanlan.innerclasses.MNA.A;

class MNA{
    private void f(){}
    class A{
        private void g(){}
        public class B{
            void h(){
                g();
                f();
            }
        }
    }
}


/**
 * MultiNestingAccess
 * 一个内部类被嵌套多少层并不重要
 * 它能透明的访问所有它所嵌入的外围类的所有成员
 */
public class MultiNestingAccess {

    public static void show() {
        MNA mna = new MNA();
        MNA.A a = mna.new A();
        MNA.A.B b = a.new B();
        b.h();
    }
}