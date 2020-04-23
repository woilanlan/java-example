package top.woilanlan.array;

class Other {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s + " ");
        }
    }
}

/**
 * DynamicArray
 */
public class DynamicArray {

    public static void show() {
        
        //在方法调用处创建的数组
        Other.main(new String[] { "fied", "de", "dum", });
    }
}