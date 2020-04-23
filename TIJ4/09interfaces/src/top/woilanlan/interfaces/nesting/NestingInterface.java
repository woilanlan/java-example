package top.woilanlan.interfaces.nesting;

class A{
    interface B{
        void f();
    }
    public class BImp implements B{
        @Override
        public void f() {
        }
    }
    private class BImp2 implements B{
        @Override
        public void f() {
        }
    }
    public interface C{
        void f();
    }
    class CImp implements C{
        @Override
        public void f() {
        }
    }
    private class CImp2 implements C{
        @Override
        public void f() {
        }
    }
    private interface D{
        void f();
    }
    private class DImp implements D{
        @Override
        public void f() {
        }
    }
    public class DImp2 implements D{
        @Override
        public void f() {
        }
    }
    public D getD(){
        return new DImp2();
    }
    private D dRef;
    public void receiveD(D d){
        dRef = d;
        dRef.f();
    }
}
interface E{
    interface G{
        void f();
    }
    // Redunant "public" 冗余
    public interface H{
        void f();
    }
    void g();

    // The interface member type I can only be public
    // private interface I{}
}


/**
 * NestingInterface
 * 嵌套接口
 * 接口可以嵌套在类或其他接口中
 */
public class NestingInterface {

    public class BImp implements A.B{
        @Override
        public void f() {}
    }
    class CImp implements A.C{
        @Override
        public void f() {}
    }
    // 不能够实现一个私有的接口，除非在这个接口定义的类
    // class DImp implements A.D{
    //     @Override
    //     public void f() {}
    // }

    class EImp implements E{
        @Override
        public void g() {
        }  
    }
    class EGImp implements E.G{
        @Override
        public void f() {
        }
    }
    class EImp2 implements E{

        @Override
        public void g() {
        }
        
        class EG implements E.G{
            @Override
            public void f() {
            }   
        }
    }

    public static void show() {
        A a = new A();
        
        //The type top.woilanlan.interfaces.nesting.A.D is not visible
        //可以变更D为包访问权限
        //top.woilanlan.interfaces.nesting.A.D ad = a.getD();

        //Type mismatch: cannot convert from A.D to A.DImp2
        //进行类型强转
        //A.DImp2 di2 = a.getD();

        //The type A.D is not visible
        //a.getD().f();

        A a2 = new A();
        a2.receiveD(a.getD());
    }
}