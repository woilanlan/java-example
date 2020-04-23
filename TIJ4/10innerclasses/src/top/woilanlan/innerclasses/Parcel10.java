package top.woilanlan.innerclasses;

/**
 * Parcel10
 * 匿名内部类既可以扩展类，也可以实现接口，但不能两者兼备
 * 如果是实现接口，也只能实现一个接口。
 */
public class Parcel10 {

    public Destination destination(String dest,float price){
        return new Destination(){
            private int cost;

            // Instance initialization for each object
            {
                cost = Math.round(price);
                if (cost>100) {
                    System.out.println("Over budget!");
                }
            }

            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void show() {
        Parcel10 p = new Parcel10();
        p.destination("Tasmania", 101.395F);
    }
}