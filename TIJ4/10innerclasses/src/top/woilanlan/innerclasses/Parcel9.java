package top.woilanlan.innerclasses;

/**
 * Parcel9
 * 在匿名类中定义字段时，还能够对其执行初始化操作
 */
public class Parcel9 {

    //在匿名内部类中使用在其外部定义的对象，参数引用必须是final的
    public Destination destination(String dest){
        return new Destination(){
            private String label = dest;
        
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void show() {
        Parcel9 p = new Parcel9();
        p.destination("Tasmania");
    }
}