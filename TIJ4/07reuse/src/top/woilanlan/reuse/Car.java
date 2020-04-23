package top.woilanlan.reuse;

class Engine {
    public void start() {

    }

    public void rev() {

    }

    public void stop() {

    }
}

class Wheel {
    public void inflate(int psi) {

    }
}

class Window {
    public void rollup() {

    }

    public void rolldown() {

    }
}

class Door {
    public Window window = new Window();

    public void open() {

    }

    public void close() {

    }
}

/**
 * Car 在组合与继承之间选择
 * 
 * 组合技术通常用于想在新类中使用现有类的功能而非它的接口。 
 * 即在新类中嵌入某个对象，让其实现所需要的功能，
 * 但新类的用户看到的只是为新类所定义的接口，而非嵌入对象的接口
 *
 * 在继承的时候，使用某个现有类，并开发一个它的特殊版本。
 * 意味着你在使用一个通用类，并为了某种特殊需要而将其特殊化。
 * 
 * 用一个“交通工具”对象来组成一部“车子”是毫无意义的，
 * 因为“车子”并不包含交通工具，它仅是一种交通工具
 * 
 * 是一种的关系是用继承来表达的
 * 有一个的关系是用组合来表达的
 */
public class Car {

    /**
     * 在这个例子中car的组合也是问题分析的一部分，
     * 所以使成员成为public将有助于客户端程序员了解怎么使用类，
     * 也降低了类开发者所面临的代码复杂度
     * 一般情况下应该使域成为private,
     * 更好的方式是建立get/set方法
     */
    public Engine engine = new Engine();
    public Wheel[] wheels = new Wheel[4];
    public Door left = new Door(), right = new Door();

    public Car(){
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
    }

    public static void show() {
        Car car = new Car();
        car.left.window.rollup();
        car.wheels[0].inflate(72);
    }

}