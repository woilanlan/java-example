package top.woilanlan.reuse;

class WaterSource{
    private String s;
    WaterSource(){
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

/**
 * SprinklerSystem 自动消防系统
 */
public class SprinklerSystem {

    private String value1,value2,value3,value4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return "SprinklerSystem [f=" + f + ", i=" + i + ", source=" + source + ", value1=" + value1 + ", value2="
                + value2 + ", value3=" + value3 + ", value4=" + value4 + "]";
    }
    
    public static void show() {
        SprinklerSystem spinklers = new SprinklerSystem();
        System.out.println(spinklers);
    }
    
}