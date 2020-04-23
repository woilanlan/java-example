package top.woilanlan.polymorphism.music;

/**
 * Instrument 乐器
 */
public class Instrument {

    public void play(Note n) {
        System.out.println("Instrument.play()");
    }
    public String what() {
        return "Instrument";
    }

    public void adjust() {
        System.out.println("Adjusting Instrument");
    }
}