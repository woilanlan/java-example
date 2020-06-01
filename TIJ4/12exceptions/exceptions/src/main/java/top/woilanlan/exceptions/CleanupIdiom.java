package top.woilanlan.exceptions;

class NeedsCleanup { // 对象构造不会失败
    private static long counter = 1;
    private final long id = counter++;

    public void dispose() {
        System.out.println("NeedsCleanup " + id + " disposed");
    }
}

class ConstructionException extends Exception {
}

class NeedsCleanup2 extends NeedsCleanup {
    // 对象构造可能失败
    public NeedsCleanup2() throws ConstructionException {
    }
}

/**
 * 在创建需要清理的对象之后，立即进入一个 try-finally 语句块
 */
public class CleanupIdiom {

    public static void show() {
        // Section 1:
        NeedsCleanup nc1 = new NeedsCleanup();
        try {
            // ...
        } finally {
            nc1.dispose();
        }

        // Section 2:
        // 如果对象构造不会失败，可以将他们放在一起
        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try {
            // ...
        } finally {
            nc3.dispose(); // Reverse order of construction
            nc2.dispose();
        }

        // Section 3:
        // 如果对象构造可能失败，你必须每一个都去捕获异常
        try {
            NeedsCleanup2 nc4 = new NeedsCleanup2();
            try {
                NeedsCleanup2 nc5 = new NeedsCleanup2();
                try {
                    // ...
                } finally {
                    nc5.dispose();
                }
            } catch (ConstructionException e) { // nc5 constructor
                System.out.println(e);
            } finally {
                nc4.dispose();
            }
        } catch (ConstructionException e) { // nc4 constructor
            System.out.println(e);
        }
    }
}
