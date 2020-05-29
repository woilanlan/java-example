package top.woilanlan.exceptions;

/**
 *
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
