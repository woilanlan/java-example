package top.woilanlan.innerclasses;

/**
 * Parcel7b 
 * 匿名内部类是下述形式的简化形式
 */
public class Parcel7b {

    class MyContents implements Contents{
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    public Contents contents(){
        return new MyContents();
    }
    public static void show() {
        Parcel7b p = new Parcel7b();
        Contents c =  p.contents();
    }
}