package top.woilanlan.reuse;

class Poppet{
    private int i;
    Poppet(int i){
        this.i = i;
    }
}

/**
 * BlankFinal 空白final
 * 必须在域的定义处或者每个构造器中用表达式对final进行赋值
 * 一个类中的final域就可以做到根据对象而有所不同，但又保持恒定不变的特性 
 */
public class BlankFinal {

    private final int i = 0;
    private final int j;
    private final Poppet p;

    public BlankFinal(){
        j =1;
        p = new Poppet(1);
    }

    public BlankFinal(int x){
        j = x;
        p = new Poppet(x);
    }

    public static void show() {
        new BlankFinal();
        new BlankFinal(47);
    }
}