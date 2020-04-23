package top.woilanlan.innerclasses;

/**
 * TestBed
 * 使用嵌套类来放置测试代码
 * 这生成了一个独立的类TestBed$Tester,可以使用这个类来做测试，
 * 但是不必在发布的产品中包含它，
 * 在将产品打包前可以简单的删除TestBed$Tester.class
 */
public class TestBed {

    public void f() {
        System.out.println("f()");
    }

    public static class Tester{
        public static void show() {
            TestBed t = new TestBed();
            t.f();
        }
    }
}