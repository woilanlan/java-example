package top.woilanlan;

import org.junit.Test;
import top.woilanlan.holding.*;

/**
 * AllTest
 */
public class AllTest {

    @Test
    public void test1() {
        ApplesAndOrangesWithoutGenerics.show();
    }

    @Test
    public void test2(){
        ApplesAndOrangesWithGenerics.show();
    }

    @Test
    public void test3(){
        GenericsAndUpcasting.show();
    }

    @Test
    public void test4(){
        SimpleCollection.show();
    }

    @Test
    public void test5(){
        AddingGroups.show();
    }

    @Test
    public void test6(){
        AsListInference.show();
    }
}