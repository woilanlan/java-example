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

    @Test
    public void test12(){
        IntegerMatch.show();
    }

    @Test
    public void test13(){
        Splitting.show();
    }

    @Test
    public void test14(){
        Replacing.show();
    }

    @Test
    public void test15(){
        Rudolph.show();
    }

    @Test
    public void test16(){
        TestRegularExpression.show(new String[]{"abcabcabcdefabc","abc+","(abc)+","(abc){2,}"});
    }

    @Test
    public void test17(){
        Finding.show();
    }

    @Test
    public void test18(){
        Groups.show();
    }

    @Test
    public void test19(){
        StartEnd.show();
    }

    @Test
    public void test20(){
        ReFlags.show();
    }

    @Test
    public void test21(){
        SplitDemo.show();
    }

    @Test
    public void test22() throws Exception {
        TheReplacements.show();
    }

    @Test
    public void test23() throws Exception {
        Resetting.show();
    }

    @Test
    public void test24() throws Exception {
        String path = AllTest.class.getResource("/").getPath();
        JGrep.show(new String[]{path+"JGrep.java", "\\b[Ssct]\\w+"});
    }

    @Test
    public void test25(){
        SimpleRead.show();
    }

    @Test
    public void test26(){
        BetterRead.show();
    }

    @Test
    public void test27(){
        ScannerDelimiter.show();
    }

    @Test
    public void test28(){
        ThreatAnalyzer.show();
    }

    @Test
    public void test29(){
        ReplacingStringTokenizer.show();
    }
}
