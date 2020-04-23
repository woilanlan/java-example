package top.woilanlan.innerclasses;

interface Game{
    boolean move();
}

interface GameFactory{
    Game getGame();
}

class Checkers implements Game{

    private Checkers(){}
    private int moves = 0;
    private static final int MOVES = 3;
    @Override
    public boolean move() {
        System.out.println("Checkers move "+ moves);
        return ++moves != MOVES;
    }
    public static GameFactory factory = new GameFactory(){
    
        @Override
        public Game getGame() {
            return new Checkers();
        }
    };
}

class Chess implements Game{

    private Chess(){}
    private int moves = 0;
    private static final int MOVES = 4;
    @Override
    public boolean move() {
        System.out.println("Checkers move "+ moves);
        return ++moves != MOVES;
    }
    public static GameFactory factory = new GameFactory(){
        @Override
        public Game getGame() {
            return new Chess();
        }
    };
}

/**
 * Games
 */
public class Games {

    public static void playGame(GameFactory factory) {
        Game g = factory.getGame();
        while(g.move()){
            ;
        }
    }

    public static void show() {
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }
}