package top.woilanlan.innerclasses;

/**
 * Parcel11 嵌套类
 * 如果不需要内部类对象与其外围类对象之间有联系，
 * 那么可以将内部类声明为static,这通常被称为嵌套类
 * 
 * 普通的内部类对象隐式的保存了一个引用，指向创建它的外围类对象
 * 
 * 嵌套类：
 * 要创建嵌套类的对象，并不需要其外围类的对象
 * 不能从嵌套类的对象中访问非静态的外围类对象。
 * 
 * 普通内部类不能有static数据和static字段，也不能包含嵌套类
 */
public class Parcel11 {

    private static class ParcelContents implements Contents{
        private int i =11;

        @Override
        public int value() {
            return i;
        }
    }
    protected static class ParcelDestination implements Destination{

        private String label;
        
        public ParcelDestination(String label) {
            this.label = label;
        }
        
        @Override
        public String readLabel() {
            return label;
        }

        //能够包含其他的static元素
        public static void f() {}
        static int x = 10;
        static class AnothreLevel{
            public static void f() {}
            static int x = 10;
        }
    }
    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }
    public static Contents contents() {
        return new ParcelContents();
    }
    public static void show() {
        //不需要Parcel11对象，直接调用static方法
        Contents c = contents();
        Destination d = destination("Tasmania");
    }
}