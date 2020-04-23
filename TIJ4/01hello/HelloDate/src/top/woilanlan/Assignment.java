package top.woilanlan;

/**
 * Assignment
 */
public class Assignment {
    public static void show(){
        int a = 2/5;
        int b = 2%5;
        System.out.println("a="+a+"b="+b);
    }
    
    public void show2(){
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println(t1.level+"-"+t2.level);
        //注意赋值问题
        t1 = t2;
        System.out.println(t1.level+"-"+t2.level);
        t1.level = 27;
        System.out.println(t1.level+"-"+t2.level);
    }

    public void f(Letter l){
        l.c = 'z';
    }

    public void show3(){
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("init: "+x.c);
        f(x);
        System.out.println("change: "+x.c);
    }
}