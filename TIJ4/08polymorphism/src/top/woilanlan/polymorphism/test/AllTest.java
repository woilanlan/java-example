package top.woilanlan.polymorphism.test;

import org.junit.Test;

import top.woilanlan.polymorphism.CovariantReturn;
import top.woilanlan.polymorphism.FieldAccess;
import top.woilanlan.polymorphism.Frog;
import top.woilanlan.polymorphism.PolyConstructors;
import top.woilanlan.polymorphism.PrivateOverride;
import top.woilanlan.polymorphism.RTTI;
import top.woilanlan.polymorphism.ReferenceCounting;
import top.woilanlan.polymorphism.Sandwich;
import top.woilanlan.polymorphism.StaticPolymorphism;
import top.woilanlan.polymorphism.Transmogrify;
import top.woilanlan.polymorphism.music.*;
import top.woilanlan.polymorphism.music3.Music3;
import top.woilanlan.polymorphism.shape.Shapes;

/**
 * 多态：也称动态绑定
 */
public class AllTest {
    
    @Test
    public void test1() {
        Music.show();
    }

    @Test
    public void test2() {
        Music2.show();
    }

    @Test
    public void test3() {
        Shapes.show();
    }

    @Test
    public void test4() {
        Music3.show();
    }

    @Test
    public void test5() {
        PrivateOverride.show();
    }

    @Test
    public void test6() {
        FieldAccess.show();
    }

    @Test
    public void test7() {
        StaticPolymorphism.show();
    }

    @Test
    public void test8() {
        Sandwich.show();
    }

    @Test
    public void test9() {
        Frog.show();                  
    }

    @Test
    public void test10() {
        ReferenceCounting.show();             
    }

    @Test
    public void test11() {
        PolyConstructors.show();             
    }

    @Test
    public void test12() {
        CovariantReturn.show();             
    }

    @Test
    public void test13() {
        Transmogrify.show();             
    }

    @Test
    public void test14() {
        RTTI.show();             
    }
}