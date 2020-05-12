package top.woilanlan;

import org.junit.Test;
import top.woilanlan.exceptions.*;

public class AllTest {

    @Test
    public void test1(){
        InheritingExceptions.show();
    }

    @Test
    public void test2(){
        FullConstructors.show();
    }

    @Test
    public void test3(){
        LoggingExceptions.show();
    }

    @Test
    public void test4(){
        LoggingExceptions2.show();
    }
}
