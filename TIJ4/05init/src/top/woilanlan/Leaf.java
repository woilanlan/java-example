package top.woilanlan;

/**
 * Leaf
 */
public class Leaf {

    int i=0;

    //明确指出对当前对象的引用时，才需要使用this关键字
    //返回对当前对象的引用
    Leaf increment(){
        i++;
        return this;
    }

    void print(){
        System.out.println("i = " +i);
    }
}