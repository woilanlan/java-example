package top.woilanlan.interfaces;

interface CanFight{
    void fight();
}

interface CanSwim{
    void swim();
}

interface CanFly{
    void fly();
}

class ActionCharacter{
    public void fight(){

    }
}

class Hero extends ActionCharacter implements CanFight,CanSwim,CanFly{

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
    
}

/**
 * Adventure java的多重继承
 * 使用接口的核心原因：
 * 1、为了能够向上转型为多个基类型
 * 2、防止客户端程序员创建该类的对象，并确保这仅仅是建立一个接口
 * 
 * 如果知道某事物应该成为一个基类，那么第一选择应该是使它成为一个接口。
 */
public class Adventure {

    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }
    public static void v(CanFly x) {
        x.fly();
    }
    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void show() {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }
    
}