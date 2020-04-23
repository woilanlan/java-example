package top.woilanlan.reuse;

class Game{
    Game(int i){
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        System.out.println("BoardGame constructor");
    }
}

/**
 * Chess
 * 带参数的构造器
 * 如果没有默认的基类构造器，或者想调用一个带参数的基类构造器，
 * 就必须使用关键字super显式的编写调用基类构造器的语句
 */
public class Chess extends BoardGame{

    Chess(){
        super(11);
        System.out.println("Chess Constructor");
    }

    public static void show() {
        Chess x = new Chess();
        System.out.println(x);
    }
}