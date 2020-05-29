package top.woilanlan.exceptions;

class BaseballException extends Exception {}

class Foul extends BaseballException {}

class Strike extends BaseballException {}

abstract class Inning {
    public Inning() throws BaseballException {}

    public void event() throws BaseballException {}

    public abstract void atBat() throws Strike, Foul;

    public void walk() {}
}

class StormException extends Exception {}

class RainedOut extends StormException {}

class PopFoul extends Foul {}

interface Storm {
    public void event() throws RainedOut;

    public void rainHard() throws RainedOut;
}


/**
 * 异常限制
 */
public class StormyInning extends Inning implements Storm {

    // 可以为构造函数添加新的异常，但必须处理父类构造函数异常
    // 构造函数初始化会先调用父类的构造函数
    public StormyInning() throws BaseballException,RainedOut {
    }

    public StormyInning(String s) throws BaseballException,Foul {
        super();
    }

    // 重写父类方法，不能抛出新的异常。
//    @Override
//    public void walk() throws PopFoul {
//        super.walk();
//    }

    // 实现接口中的方法，但父类有同名的方法，遵守重写父类方法，不能抛出新的异常。
//    @Override
//    public void event() throws RainedOut {}

    // 在父类中没有这个方法，可以跑出异常
    @Override
    public void rainHard() throws RainedOut {
    }

    // 可以选择不抛出任何异常
    @Override
    public void event() {
    }

    // 重写的方法，能抛出继承的异常
    @Override
    public void atBat() throws PopFoul {
        //throw new PopFoul();
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
