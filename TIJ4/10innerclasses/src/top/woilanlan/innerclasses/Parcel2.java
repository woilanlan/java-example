package top.woilanlan.innerclasses;

/**
 * Parcel2
 * 如果想从外部类的非静态方法之外的任意位置创建某个内部类的对象，
 * 那么必须具体的指明这个对象的类型：OuterClassName.InnerClassName
 */
public class Parcel2 {

    class Contents{
        private int i = 11;
        public int value() {
            return i;
        }
    }
    class Destination{
        private String label;
        public Destination(String label) {
            this.label = label;
        }
        String readLabel(){
            return label;
        }
    }
    public Contents contents() {
        return new Contents();
    }
    public Destination to(String s){
        return new Destination(s);
    }
    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }
    public static void show() {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        Parcel2 q = new Parcel2();
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("Borneo");
    }
}