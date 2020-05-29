package top.woilanlan.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 构造器内抛出异常
 * 打开一个文件并且每次读取其中的一行。
 */
public class InputFile {
    private BufferedReader in;

    public InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
            // 其他可能抛出异常的代码
        } catch (FileNotFoundException e) {
            System.out.println("Could not open " + fname);
            // 文件还没有打开，因此不能去关闭它
            throw e;
        } catch (Exception e) {
            // 所有其他被捕获的异常都必须关闭文件
            try {
                in.close();
            } catch (IOException e2) {
                System.out.println("in.close() unsuccessful");
            }
            throw e; // 构造函数中异常被重新抛出，避免调用方误认为对象创建完毕
        } finally {
            // 不要在这里关闭文件
        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            // 处理异常
            // 将异常转换成 RuntimeException，表示一个编程错误
            throw new RuntimeException("readLine() failed");
        }
        return s;
    }

    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() successful");
        } catch (IOException e2) {
            throw new RuntimeException("in.close() failed");
        }
    }
}
