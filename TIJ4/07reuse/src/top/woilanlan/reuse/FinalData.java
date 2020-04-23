package top.woilanlan.reuse;

import java.util.Random;

class Value{
    int i;
    public Value(int i){
        this.i = i;
    }
}

/**
 * FinalData
 * final数据
 */
public class FinalData {

    private static Random rand = new Random(47);
    private String id;
    public FinalData(String id){
        this.id = id;
    }

    //对于基本类型，final使数值恒定不变
    //带有编译时数值的final基本类型，可以用做编译期常量
    private final int valueOne = 9; 
    private static final int VALUE_TWO = 99;
    
    /**
     * 典型的常量定义方式
     * 定义为public,则可以被用于包之外
     * 定义为static,则强调只有一份
     * 定义为final,则说明它是一个常量
     * 带有恒定初始值（即编译期常量）的final static 基本类型全用大写字母命名
     * 并且字与字之间用下划线隔开。
    */
    public static final int VALUE_THREE = 39;

    //在运行时使用随机生成的数值来初始化
    //在对象fd1和fd2中，i4的值初始化后就不可以再修改
    //INT_5 定义为static，只在第一次装载时初始化，而不是每次创建新对象时都初始化。
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);

    //对于对象引用，final使引用恒定不变，
    //一旦引用被初始化指向一个对象,就无法再把它改为指向另一个对象
    //但是对象本身却是可以被修改的。
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);

    private final int[] a = {1,2,3,4,5,6};

    public String toString(){
        return id + ": " + "i4 = " + i4 + ", INT_5 = "+INT_5;
    }

    public static void show() {
        FinalData fd1 = new FinalData("fd1");
        // fd1.valueOne++;
        
        fd1.v2.i++;
        fd1.v1 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++;
        }

        //fd1.v2 = new Value(0);
        //fd1.VAL_3 = new Value(1);
        //fd1.a = new int[3];
        
        System.out.println(fd1);
        System.out.println("Create new FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
}