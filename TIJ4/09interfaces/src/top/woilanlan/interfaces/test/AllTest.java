package top.woilanlan.interfaces.test;

import org.junit.Test;

import top.woilanlan.interfaces.AdaptedRandomDoubles;
import top.woilanlan.interfaces.Adventure;
import top.woilanlan.interfaces.Factories;
import top.woilanlan.interfaces.Games;
import top.woilanlan.interfaces.HorrorShow;
import top.woilanlan.interfaces.InterfaceCollision;
import top.woilanlan.interfaces.RandomDoubles;
import top.woilanlan.interfaces.RandomWords;
import top.woilanlan.interfaces.TestRandVals;
import top.woilanlan.interfaces.classprocessor.Apply;
import top.woilanlan.interfaces.interfaceprocessor.FilterProcessor;
import top.woilanlan.interfaces.music4.Music4;
import top.woilanlan.interfaces.music5.Music5;
import top.woilanlan.interfaces.nesting.NestingInterface;

/**
 * AllTest
 */
public class AllTest {

    @Test
    public void test1() {
        Music4.show();
    }

    @Test
    public void test2() {
        Music5.show();
    }

    @Test
    public void test3() {
        Apply.show();
    }

    @Test
    public void test4() {
        top.woilanlan.interfaces.interfaceprocessor.Apply.show();
    }

    @Test
    public void test5() {
        FilterProcessor.show();
    }

    @Test
    public void test6() {
        Adventure.show();
    }

    @Test
    public void test7() {
        HorrorShow.show();
    }

    @Test
    public void test8() {
        InterfaceCollision.show();
    }

    @Test
    public void test9() {
        RandomWords.show();
    }

    @Test
    public void test10() {
        RandomDoubles.show();
    }

    @Test
    public void test11() {
        AdaptedRandomDoubles.show();
    }

    @Test
    public void test12() {
        TestRandVals.show();
    }

    @Test
    public void test13() {
        NestingInterface.show();
    }

    
    @Test
    public void test14() {
        Factories.show();
    }

    @Test
    public void test15() {
        Games.show();
    }
}