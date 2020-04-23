package top.woilanlan.reuse;

/**
 * Soap 肥皂
 */
class Soap{
    private String s;
    Soap(){
        System.out.println("Soap()");
        s = "constructed";
    }

    @Override
    public String toString() {
        return "Soap [s=" + s + "]";
    }
    
}

/**
 * Bath
 * 初始化
 */
public class Bath {

    // 在定义对象的地方，在构造器被调用之前被初始化
    private String s1="Happy",s2="happy",s3,s4;
    private Soap castile;
    private int i;
    private float toy;

    public Bath(){
        //在类的构造器中初始化
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castile = new Soap();
    }
    // 实例初始化
    {i = 47;}

    @Override
    public String toString() {
        if(s4==null){
            s4= "Joy";      //懒性初始化
        }
        return "Bath [castile=" + castile + ", i=" + i + ", s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + ", s4=" + s4
                + ", toy=" + toy + "]";
    }

    public static void show() {
        Bath b = new Bath();
        System.out.println(b);
    }
    
}