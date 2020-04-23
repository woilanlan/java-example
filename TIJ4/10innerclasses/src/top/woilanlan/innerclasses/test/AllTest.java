package top.woilanlan.innerclasses.test;

import org.junit.Test;

import top.woilanlan.innerclasses.*;
import top.woilanlan.innerclasses.controller.GreenhouseController;

/**
 * AllTest
 */
public class AllTest {

    @Test
    public void test1() {
        Parcel.show();
    }

    @Test
    public void test2() {
        Parcel2.show();
    }
    
    @Test
    public void test3() {
        Sequence.show();
    }

    @Test
    public void test4() {
        DotThis.show();
    }

    @Test
    public void test5() {
        DotNew.show();
    }

    @Test
    public void test6() {
        Parcel3.show();
    }

    @Test
    public void test7() {
        TestParcel.show();
    }

    @Test
    public void test8() {
        Parcel5.show();
    }

    @Test
    public void test9() {
        Parcel6.show();
    }

    @Test
    public void test10() {
        Parcel7.show();
    }

    @Test
    public void test11() {
        Parcel7b.show();
    }

    @Test
    public void test12() {
        Parcel8.show();
    }

    @Test
    public void test13() {
        Parcel9.show();
    }

    @Test
    public void test14() {
        AnonymousConstructor.show();
    }

    @Test
    public void test15() {
        Parcel10.show();
    }

    @Test
    public void test16() {
        Factories.show();
    }

    @Test
    public void test17() {
        Games.show();
    }

    @Test
    public void test18() {
        Parcel11.show();
    }

    @Test
    public void test19() {
        ClassInterface.Test.show();
    }

    @Test
    public void test20() {
        TestBed.Tester.show();
    }

    @Test
    public void test21() {
        MultiNestingAccess.show();
    }

    @Test
    public void test22() {
        MultiInterfaces.show();
    }

    @Test
    public void test23() {
        MultiImplementation.show();
    }

    @Test
    public void test24() {
        Callbacks.show();
    }

    @Test
    public void test25() {
        String[] args = new String[]{"5000"};
        GreenhouseController.show(args);
    }

    @Test
    public void test26() {
        InheriteInner.show();
    }

    @Test
    public void test27() {
        BigEgg.show();
    }

    @Test
    public void test28() {
        BigEgg2.show();
    }

    @Test
    public void test29() {
        LocalInnerClass.show();
    }
}