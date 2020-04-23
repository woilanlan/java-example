package top.woilanlan.polymorphism;

class Grain{
    public String toString() {
        return "Grain";
    }
}
class Wheat extends Grain{
    public String toString() {
        return "Wheat";
    }
}
class Mill{
    Grain process(){
        return new Grain();
    }
}

class WheatMill extends Mill{
    Wheat process(){
        return new Wheat();
    }
}

/**
 * CovariantReturn 协变返回类型
 */
public class CovariantReturn {

    public static void show() {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        m = new WheatMill();
        g= m.process();
        System.out.println(g);
    }
}