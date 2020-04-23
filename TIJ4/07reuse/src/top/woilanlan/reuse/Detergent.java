package top.woilanlan.reuse;

/**
 * 清洁剂
 */
class Cleanser{
    private String s = "Cleanser";
    public void append(String a) {
        s +=a;
    }

    public void dilute() {
        append(" dilute()");
    }
    public void apply() {
        append(" apply()");
    }
    public void scrub() {
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void show() {
        Cleanser x = new Cleanser();
        x.dilute();x.apply();x.scrub();
        System.out.println(x);
    }
}

/**
 * Detergent 洗涤剂
 */
public class Detergent extends Cleanser{

    @Override
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam() {
        append(" foam()");
    }

    public static void show() {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("test base class:");
        Cleanser.show();
    }
}