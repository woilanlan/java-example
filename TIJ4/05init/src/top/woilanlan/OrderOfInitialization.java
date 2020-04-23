package top.woilanlan;

class Window{
    Window(int marker){
        System.out.println("Window("+marker+")");
    }
}

class House{
    Window w1 = new Window(1);

    House(){
        System.out.println("House");
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void f(){
        System.out.println("f()");
    }
    Window w3 = new Window(3);

}

/**
 * OrderOfInitialization 初始化顺序
 * 变量定义的先后顺序决定了初始化顺序
 * 它们会在任何方法（包括构造器）被调用之前得到初始化。
 */
public class OrderOfInitialization {

    public void show() {
        House h = new House();
        h.f();
    }
}