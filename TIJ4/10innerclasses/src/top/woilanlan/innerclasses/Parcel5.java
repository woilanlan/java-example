package top.woilanlan.innerclasses;

/**
 * Parcel5 局部内部类
 * 为什么要定义内部类？
 * 你实现了某类型的接口，可以创建并返回对其的引用
 * 要解决一个复杂的问题，想要创建一个类来辅助你的解决方案，但又不希望这个类时公共可用的
 */
public class Parcel5 {

    public Destination destination(String s){
        class PDestination implements Destination{
            private String label;
    
            public PDestination(String label) {
                this.label = label;
            }
    
            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void show() {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasminia");
    }
}