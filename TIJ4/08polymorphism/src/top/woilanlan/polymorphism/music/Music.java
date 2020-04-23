package top.woilanlan.polymorphism.music;

/**
 * Music
 */
public class Music {

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void show() {
        Wind flute = new Wind();
        tune(flute);    //向上转型
    }
}