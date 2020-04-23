package top.woilanlan;

/**
 * Equals
 */
public class Equivalence {

    public void show(){
        //注意取值是否大于127
        Integer n1 = Integer.valueOf(47);
        Integer n2 = Integer.valueOf(47);
        //基本类型可以直接比较
        //引用类型比较的是对象的引用
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);

        Integer n3 = Integer.valueOf(128);
        Integer n4 = Integer.valueOf(128);
        System.out.println(n3 == n4);
        System.out.println(n3 != n4);
    }

    public void equalsMethod(){
        Integer n3 = Integer.valueOf(128);
        Integer n4 = Integer.valueOf(128);
        //比较两个对象的实际内容是否相同。
        System.out.println(n3.equals(n4));
    }

    public void equalsMethod2() {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = t2.level = 100;
        //equals()的默认行为是比较引用
        //除非在自己的新类中覆盖equals()方法
        System.out.println(t1.equals(t2));
    }
    
}