package top.woilanlan.innerclasses;

/**
 * Parcel3
 */
public class Parcel3 {

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
    public static void show() {
        Parcel3 p = new Parcel3();
        Parcel3.Contents c = p.new Contents();
        Parcel3.Destination d = p.new Destination("Tasmania");
    }
}