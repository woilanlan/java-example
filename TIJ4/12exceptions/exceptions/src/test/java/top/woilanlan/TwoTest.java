package top.woilanlan;

import org.junit.Test;
import top.woilanlan.exceptions.*;

public class TwoTest {

    @Test
    public void test1(){
        Rethrowing.show();
    }

    @Test
    public void test2(){
        RethrowNew.show();
    }

    @Test
    public void test3(){
        DynamicFields.show();
    }

    @Test
    public void test4(){
        NeverCaught.show();
    }
}
