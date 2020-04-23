package top.woilanlan.interfaces;

interface I1 {
    void f();
}

interface I2 {
    int f(int i);
}

interface I3 {
    int f();
}

class C {
    public int f() {
        return 1;
    }
}

class C2 implements I1, I2 {

    @Override
    public int f(int i) {
        return 1; // 方法重载
    }

    @Override
    public void f() {

    }

}

class C3 extends C implements I2 {

    // 实现接口，进行方法重载
    @Override
    public int f(int i) {
        return 1; 
    }

}

class C4 extends C implements I3 {

    // 继承父类方法和要实现的方法相同
    // 如果不需要重写父类方法，可以省略
    @Override
    public int f() {
        return super.f();
    }
    
}

// 编译报错：The return types are incompatible for the inherited methods I1.f(), C.f()
// class C5 extends C implements I1{ }

// The return types are incompatible for the inherited methods I1.f(), I3.f()
// interface I4 extends I1,I3{}

/**
 * InterfaceCollision
 * 避免在组合的不同接口中是使用相同的方法名
 */
public class InterfaceCollision {

    public static void show() {
        
    }
}