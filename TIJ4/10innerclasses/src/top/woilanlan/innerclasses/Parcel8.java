package top.woilanlan.innerclasses;

/**
 * Parcel8
 * 基类需要一个有参数的构造器的匿名内部类
 */
public class Parcel8 {

    public Wrapping wrapping(int x) {
        return new Wrapping(x) {

            @Override
            public int value() {
                return super.value()*47;
            }
            
        };
    }
    public static void show() {
        Parcel8 p = new Parcel8();
        p.wrapping(10);
    }
}