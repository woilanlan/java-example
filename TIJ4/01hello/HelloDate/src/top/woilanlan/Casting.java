package top.woilanlan;

/**
 * Casting 类型转换操作符
 */
public class Casting {

    public void show() {
        int i=200;
        //编译器会自动进行int到long的转换
        long lng = (long)i;
        lng = i;
        System.out.println(lng);
        long lng2= 200;
        lng2 =200;
        //窄化转换，必须显式地进行类型转换
        i = (int) lng2;
    }

    //窄化转换，截尾和舍入
    public void castingNumbers() {
        double above = 0.7d,below = 0.4d;
        float fabove = 0.7f,fbelow = 0.4f;
        System.out.println("(int)above : "+ (int)above);
        System.out.println("(int)below : "+ (int)below);
        System.out.println("(int)fbelow : "+ (int)fbelow);
        System.out.println("(int)fabove : "+ (int)fabove);

        //舍入
        System.out.println("Math.round(above)"+Math.round(above));
        System.out.println("Math.round(below)"+Math.round(below));
        System.out.println("Math.round(fabove)"+Math.round(fabove));
        System.out.println("Math.round(fbelow)"+Math.round(fbelow));
    }
}