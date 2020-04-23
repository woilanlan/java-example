package top.woilanlan.polymorphism;

class Actor{
    public void act() {
        
    }
}

class HappyActor extends Actor{
    public void act() {
        System.out.println("HappyActor");
    }
}

class SadActor extends Actor{
    public void act() {
        System.out.println("SadActor");
    }
}

class Stage{
    private Actor actor = new HappyActor();
    public void change(){
        actor = new SadActor();
    }
    public void performPlay() {
        actor.act();
    }
}
/**
 * Transmogrify 用继承进行设计
 * 用继承表达行为间的差异，并用字段（成员变量）表达状态上的变化
 * 通过继承得到了两个不同的类，用于表达act()方法的差异，
 * 而Stage通过运用组合使自己的状态发生变化。
 * 在这种情况下状态的改变也就产生了行为的改变
 */
public class Transmogrify {

    public static void show() {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}