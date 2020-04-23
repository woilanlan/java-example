package top.woilanlan;

/**
 * Rock
 */
public class Rock {

    Rock(){
        System.out.println("Rock ");
    }

    Rock(int i){
        System.out.println("Rock "+i);
    }

    public void show() {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }

    public void show2() {
        for (int i = 0; i < 10; i++) {
            new Rock(i);
        }
    }
}