package top.woilanlan.interfaces.music5;

import top.woilanlan.interfaces.music4.Note;

interface Instrument{
    int VALUE = 5 ; //static & final
    void play(Note n);  //Automatically public
    void adjust();
}

class Wind implements Instrument{

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() "+ n);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion implements Instrument{

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() "+ n);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed implements Instrument{
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() "+ n);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind{
    @Override
    public String toString() {
        return "Brass";
    }
}

class WoodWind extends Wind{
    @Override
    public String toString() {
        return "WoodWind";
    }
}

/**
 * Music5 接口
 * 接口中的方法默认是 public
 * 接口中的成员变量默认是 static和final的
 */
public class Music5 {

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