package top.woilanlan.exceptions;
import java.io.FileNotFoundException;
import java.io.IOException;

import static top.woilanlan.util.Print.*;

class WrapCheckedException {
    void throwRuntimeException(int type) {
        try {
            switch(type) {
                case 0: throw new FileNotFoundException();
                case 1: throw new IOException();
                case 2: throw new RuntimeException("Where am I?");
                default: return;
            }
        } catch(Exception e) { // Adapt to unchecked:
            // 把 “被检查的异常” 包装进 RuntimeException
            throw new RuntimeException(e);
        }
    }
}

class SomeOtherException extends Exception {}

public class TurnOffChecking {

    public static void show() {
        WrapCheckedException wce = new WrapCheckedException();
        // 你可以不使用 try 块，在调用 throwRuntimeException() 方法时，
        // 因为它没有抛出 “被检查的异常”
        wce.throwRuntimeException(3);

        // 当你准备好去捕获异常的时候，可以用 try 块来捕获任何你想捕获的异常
        for(int i = 0; i < 4; i++)
            try {
                if(i < 3)
                    wce.throwRuntimeException(i);
                else
                    throw new SomeOtherException();
            } catch(SomeOtherException e) {
                // 首先要捕获try块肯定会抛出的异常
                print("SomeOtherException: " + e);
            } catch(RuntimeException re) {
                // RuntimeException 放到最后去捕获
                try {
                    //抛出被包装的那个原始异常
                    throw re.getCause();
                } catch(FileNotFoundException e) {
                    print("FileNotFoundException: " + e);
                } catch(IOException e) {
                    print("IOException: " + e);
                } catch(Throwable e) {
                    print("Throwable: " + e);
                }
            }
    }
}
