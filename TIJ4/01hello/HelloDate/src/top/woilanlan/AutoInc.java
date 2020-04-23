package top.woilanlan;

/**
 * AutoIac
 */
public class AutoInc {

    public void show(){
        int i = 1;
        System.out.println("i: "+i);
        //先执行运算，再生成值
        System.out.println("++i : "+ ++i);
        //先生成值，再运算
        System.out.println("i++ : "+ i++);
        System.out.println("i: "+i);
        System.out.println("--i : "+ --i);
        System.out.println("i-- : "+ i--);
        System.out.println("i: "+i);
    }
}