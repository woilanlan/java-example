package top.woilanlan.innerclasses;

/**
 * ClassInterface 接口内部的类
 * 放到接口中的任何类都自动是public和static,
 * 因为类是static，只是将嵌套类置于接口的命名空间内，这并不违反接口的规则。
 * 
 * 如果你想要创建某些公共代码，使得它们可以被某个接口的所有不同实现所共用
 * 那么使用接口内部的嵌套类会显得很方便。
 */
public interface ClassInterface {

    void howdy();

    class Test implements ClassInterface{

        @Override
        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void show() {
            new Test().howdy();
        }
        
    }
}