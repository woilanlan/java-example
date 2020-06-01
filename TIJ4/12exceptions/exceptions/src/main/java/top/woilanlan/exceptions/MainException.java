package top.woilanlan.exceptions;

import java.io.FileInputStream;

public class MainException {
    // 把异常传递给控制台
    public static void show() throws Exception {
        // Open the file:
        FileInputStream file = new FileInputStream("MainException.java");
        // Use the file ...
        // Close the file:
        file.close();
    }
}
