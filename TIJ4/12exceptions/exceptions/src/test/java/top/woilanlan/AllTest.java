package top.woilanlan;

import org.junit.Test;
import top.woilanlan.exceptions.*;

public class AllTest {

    @Test
    public void test1() {
        InheritingExceptions.show();
    }

    @Test
    public void test2() {
        FullConstructors.show();
    }

    @Test
    public void test3() {
        LoggingExceptions.show();
    }

    @Test
    public void test4() {
        LoggingExceptions2.show();
    }

    @Test
    public void test5() {
        ExtraFeatures.show();
    }

    @Test
    public void test6() {
        ExceptionMethods.show();
    }

    @Test
    public void test7() {
        WhoCalled.show();
    }

    @Test
    public void test8() {
        Rethrowing.show();
    }

    @Test
    public void test9() {
        RethrowNew.show();
    }

    @Test
    public void test10() {
        DynamicFields.show();
    }

    @Test
    public void test11() {
        NeverCaught.show();
    }

    @Test
    public void test12() {
        FinallyWorks.show();
    }

    @Test
    public void test13() {
        OnOffSwitch.show();
    }

    @Test
    public void test14() {
        WithFinally.show();
    }

    @Test
    public void test15() {
        AlwaysFinally.show();
    }

    @Test
    public void test16() {
        MultipleReturns.show();
    }

    @Test
    public void test17() {
        LostMessage.show();
    }

    @Test
    public void test18() {
        ExceptionSilencer.show();
    }

    @Test
    public void test19() {
        StormyInning.show();
    }

    @Test
    public void test20() {
        Cleanup.show();
    }

    @Test
    public void test21() {
        CleanupIdiom.show();
    }

    @Test
    public void test22() {
        Human.show();
    }

    @Test
    public void test23() throws Exception {
        MainException.show();
    }

    @Test
    public void test24() throws Exception {
        TurnOffChecking.show();
    }
}
