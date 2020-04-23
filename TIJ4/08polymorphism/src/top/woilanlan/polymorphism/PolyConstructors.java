package top.woilanlan.polymorphism;

class Glyph{
    void draw(){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int r){
        radius =r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = "+radius);
    }

    @Override
    void draw(){
        System.out.println("RoundGlyph.draw(), radius = "+radius);
    }
}

/**
 * PolyConstructors 构造器内部的多态方法的行为。
 * 
 * 编写构造器时有一条有效的准则：
 * 用尽可能简单的方法使对象进入正常状态
 * 如果可以的话，避免调用其他方法
 * 在构造器内唯一能够安全调用的那些方法使基类的final方法
 */
public class PolyConstructors {

    public static void show() {
        new RoundGlyph(5);
    }
}