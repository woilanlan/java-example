package top.woilanlan.interfaces.music4;

//如果一个类包含一个或多个抽象方法，该类必须被限定为抽象的。
abstract class Instrument {
    private int i;

    //抽象方法：仅声明而没有方法体
    public abstract void play(Note n);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}

class Wind extends Instrument {

    @Override
    public void adjust() {
    }

    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    @Override
    public String what() {
        return "Wind";
    }
}

class Percussion extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    @Override
    public void adjust() {

    }

    @Override
    public String what() {
        return "Percussion";
    }
}

class Stringed extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    @Override
    public void adjust() {
    }

    @Override
    public String what() {
        return "Stringed";
    }
}

class Brass extends Wind {

    @Override
    public void adjust() {
        System.out.println("Brass.adjust() ");
    }

    @Override
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }
}

class WoodWind extends Wind{

    @Override
    public void play(Note n) {
        System.out.println("WoodWind.play() " + n);
    }

    @Override
    public String what() {
        return "WoodWind";
    }
}

/**
 * Music4 抽象类和抽象方法
 */
public class Music4 {

    static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e){
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
            new WoodWind()
        };
        tuneAll(orchestra);
    }
}