package top.woilanlan.innerclasses;

/**
 * Parcell
 * 创建内部类
 */
public class Parcel {

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
    //在Parcell类内部，使用内部类就像使用其他类一样
    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }
    public static void show() {
        Parcel p = new Parcel();
        p.ship("Tasmaina");
    }

}