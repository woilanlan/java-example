package top.woilanlan.polymorphism.music3;

import top.woilanlan.polymorphism.music.Note;

class Instrument {

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

class Wind extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Wind.play()" + n);
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Wind");
    }

    @Override
    public String what() {
        return "Wind";
    }
}

class Percussion extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Percussion.play()" + n);
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Percussion");
    }

    @Override
    public String what() {
        return "Percussion";
    }
}

class Stringed extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Stringed.play()" + n);
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Stringed");
    }

    @Override
    public String what() {
        return "Stringed";
    }
}

class Brass extends Wind{
    @Override
    public void play(Note n) {
        System.out.println("Brass.play()" + n);
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind{
    @Override
    public void play(Note n) {
        System.out.println("Woodwind.play()" + n);
    }

    @Override
    public String what() {
        return "Woodwind";
    }
}

/**
 * Music3
 */
public class Music3 {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void show() {
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
        };
        tuneAll(orchestra);
    }
}