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

    @Test
    public void test7(){
        PrintingContainers.show();
    }

    @Test
    public void test8(){
        ListFeatures.show();
    }

    @Test
    public void test9(){
        SimpleIteration.show();
    }

    @Test
    public void test10(){
        CrossContainerIteration.show();
    }

    @Test
    public void test11(){
        ListIteration.show();
    }

    @Test
    public void test12(){
        LinkedListFeatures.show();
    }

    @Test
    public void test13(){
        StackTest.show();
    }

    @Test
    public void test14(){
        StackCollision.show();
    }

    @Test
    public void test15(){
        SetOfInteger.show();
    }

    @Test
    public void test16(){
        SortedSetOfInteger.show();
    }

    @Test
    public void test17(){
        SetOperations.show();
    }

    @Test
    public void test18(){
        UniqueWords.show();
    }
}