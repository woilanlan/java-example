package top.woilanlan.exceptions;

/**
 * InputFile 对象如果构造失败，进入外部的 catch 子句，dispose() 方法不会被调用
 * 如果构造成功，在构建之后立即创建一个新的 try 语句块，
 * 在这种方式下，执行清理的 finally 在构造成功时将总会执行。
 */
public class Cleanup {

    public static void show() {
        try {
            String path = Cleanup.class.getResource("/").getPath();
            InputFile in = new InputFile(path+ "Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null)
                    ; // 在这里逐行处理
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("InputFile construction failed");
        }
    }
}
