package top.woilanlan;

/**
 * Flower
 */
public class Flower {

    int petalCount = 0;
    String s = "initial value";

    Flower(int petals){
        petalCount = petals;
        System.out.println("Constructor w/ int arg only , petalCount = "+petalCount);
    }
    
    Flower(String ss){
        System.out.println("Constructor w/ String arg only , s = "+ss);
        s= ss;
    }

    Flower(String s,int petals){
        //可以用this调用一个构造器，但却不能调用两个
        //必须将构造器调用置于最起始处
        this(petals);
        //this(s);

        //参数s的名称和数据成员s的名字相同，使用this.s来代表数据成员，避免歧义
        this.s = s;

        System.out.println("String & int args");
    }

    Flower(){
        this("hi",47);
        System.out.println("default constructor ( no args)");
    }

    public void printPetalCount() {
        //禁止在其他方法中调用构造器
        //this();
        System.out.println("petalCount = "+ petalCount+" s = "+ s);
    }
}