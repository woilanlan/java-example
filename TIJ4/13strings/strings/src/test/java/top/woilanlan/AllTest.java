package top.woilanlan;

import org.junit.Test;
import top.woilanlan.strings.*;

public class AllTest {

    @Test
    public void test1(){
        Immutable.show();
    }

    @Test
    public void test2(){
        Concatenation.show();
    }

    @Test
    public void test3(){
        WhitherStringBuilder ws = new WhitherStringBuilder();
        String[] fields = {"aaa", "bbb", "ccc","ddd"};
        //long start = System.currentTimeMillis();  //以毫秒作为单位
        long start = System.nanoTime();     //以纳秒作为单位
        ws.implicit(fields);
        long start2 = System.nanoTime();
        ws.explicit(fields);
        long end = System.nanoTime();
        System.out.println(start2-start);
        System.out.println(end-start2);
    }

    @Test
    public void test4(){
        UsingStringBuilder.show();
    }

    @Test
    public void test5(){
        ArrayListDisplay.show();
    }

    @Test
    public void test6(){
        InfiniteRecursion.show();
    }

    @Test
    public void test7(){
        SimpleFormat.show();
    }

    @Test
    public void test8(){
        Turtle.show();
    }

    @Test
    public void test9(){
        Receipt.show();
    }

    @Test
    public void test10(){
        Conversion.show();
    }

    @Test
    public void test11(){
        DatabaseException.show();
    }
}
