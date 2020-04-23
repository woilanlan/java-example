package top.woilanlan.polymorphism.music;

/**
 * Stringed 弦乐
 */
class Stringed extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Stringed.play()"+n);
    }
}

/**
 * Brass 管乐
 */
class Brass extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Brass.play()"+n);
    }
}

/**
 * Music2
 */
public class Music2 {

    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }

    public static void show() {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }
}