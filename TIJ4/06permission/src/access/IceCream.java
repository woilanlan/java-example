package access;

/**
 * 默认访问权限没有任何关键字，通常是指包访问权限
 * 当前包中的所有其他类对那个成员都有访问权限，但对于包之外的所有类，这个成员是private
 * 一个编译单元只能隶属于一个包，所以经由包访问权限，
 * 处于同一个编译单元中的所有类彼此之间都是自动可访问的。
 */
class Sundae{
    private Sundae(){}
    
    static Sundae makeASundae(){
        return new Sundae();
    }
}

/**
 * 当编写一个java源代码文件时，此文件通常被称为编译单元，每个编译单元都必须有一个后缀名.java
 * 而在编译单元内则可以有一个public类，该类名称必须与文件名称相同
 * 每个编译单元只能有一个public类
 * 如果在该编译单元之中还有额外的类，那么在包之外的是无法看见这些类的。
 */
public class IceCream {

    public void test() {
        //Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
    }
}