package top.woilanlan;

/**
 * Literal
 */
public class Literal {

    //直接常量
    public void show() {
        int i1 = 0x2f;  //十六进制
        System.out.println("i1 : "+ Integer.toBinaryString(i1));
        int i2 = 0177;  //八进制，127 
        System.out.println("i2 : "+ Integer.toBinaryString(i2));
        char c = 0xffff;    //65535
        System.out.println("c : "+ Integer.toBinaryString(c));
        byte b = 0x7f;  //127
        System.out.println("b : "+ Integer.toBinaryString(b));
        short s = 0x7fff;   //32767
        System.out.println("s : "+ Integer.toBinaryString(s));

        long n1 = 200L;
        float f1 = 1f;
        double d1 = 1d;
        System.out.println("n1 : "+ n1);
        System.out.println("f1 : "+ f1);
        System.out.println("d1 : "+ d1);
    }

    //指数计数法
    public void exponents() {
        float expFloat = 1.39e-43f;
        System.out.println(expFloat);
        double expDouble = 47e47d;
        System.out.println(expDouble);
    }
}