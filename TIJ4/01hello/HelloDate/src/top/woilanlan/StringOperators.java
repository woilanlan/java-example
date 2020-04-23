package top.woilanlan;

/**
 * StringOperators 字符串操作符
 */
public class StringOperators {

    public void show() {
        int x=0 ,y = 1,z=2;
        String s = "x,y,z";
        System.out.println(s+x+y+z);
        System.out.println(x+" "+s);

        s += "(summed) = ";
        System.out.println(s+(x+y+z));
        
        //显示方法：Integer.toString()
        System.out.println(""+x);
    }
}