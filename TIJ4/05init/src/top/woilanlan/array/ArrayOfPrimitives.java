package top.woilanlan.array;

/**
 * ArrayOfPrimitives 数组初始化
 */
public class ArrayOfPrimitives {

    public void show() {
        int[] a1 = {1,2,3,4,5};
        int[] a2;
        a2 =a1;
        for (int i = 0; i < a2.length; i++) {
            a2[i] +=1;
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.println("a1["+i+"] = "+a1[i]);
        }
    }
}