package top.woilanlan.reuse;

class Instrument{
    public void play() {
        
    }
    static void tune(Instrument i){
        i.play();
    }
}

/**
 * Wind
 * 向上转型
 * 将Wind引用转换为Instrument引用
 */
public class Wind extends Instrument{

    public static void show() {
        Wind wind = new Wind();
        Instrument.tune(wind);
    }
}