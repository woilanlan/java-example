package top.woilanlan.exceptions;

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class Inning {
    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
        // 实际上不需要抛任何东西
    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {
    } // 抛出没有检查的异常
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
    public void event() throws RainedOut;

    public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {

    // 可以为构造函数添加新的异常，但必须处理基构造函数异常:
    public StormyInning()
            throws RainedOut, BaseballException {
    }

    public StormyInning(String s)
            throws Foul, BaseballException {
    }

    // 常规方法必须符合基类:
    //! void walk() throws PopFoul {} //Compile error

    // 接口不能从基类向现有方法添加异常:
    //public void event() throws RainedOut {}

    // 如果这个方法在基类中不存在，这个异常是可以的
    public void rainHard() throws RainedOut {
    }

    // 您可以选择不抛出任何异常，即使基本版本抛出:
    public void event() {
    }

    // 重写的方法会抛出继承的异常:
    public void atBat() throws PopFoul {
    }

    public static void show() {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        //  在派生版本中没有抛出 Strike
        try {
            // 如果你向上抛出会发生什么?
            Inning i = new StormyInning();
            i.atBat();
            // 你必须从方法的基类版本捕获异常:
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
}
