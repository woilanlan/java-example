package top.woilanlan.exceptions;

class Annoyance extends Exception {}

class Sneeze extends Annoyance {}

/**
 * 异常匹配
 */
public class Human {
    public static void show() {
        // 匹配到准确的异常
        try {
            throw new Sneeze();
        } catch (Sneeze s) {
            System.out.println("Caught Sneeze");
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }

        // 匹配到异常的基类
        try {
            throw new Sneeze();
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }
    }
}
