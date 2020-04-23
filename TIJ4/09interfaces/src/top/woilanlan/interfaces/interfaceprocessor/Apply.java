package top.woilanlan.interfaces.interfaceprocessor;

/**
 * Apply
 * 客户端程序员遵循接口来编写他们自己的类
 */
public class Apply {

    public static void process(Processor p,Object s) {
        System.out.println("Using Processor "+p.name());
        System.out.println(p.process(s));
    }

    public static String s = "If she weighs the same as a duck , she is mode of wood";
    
    public static void show() {
        Apply.process(new Upcase(), s);    
        Apply.process(new Downcase(), s);    
        Apply.process(new Splitter(), s);    
    }
}