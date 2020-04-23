package top.woilanlan;

import java.util.Random;

/**
 * Bool
 */
public class Bool {

    public void show() {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        System.out.println("i: "+ i);
        System.out.println("j: "+ j);
        System.out.println("i > j is "+ (i>j));
        System.out.println("i < j is "+ (i<j));
        System.out.println("i >= j is "+ (i>=j));
        System.out.println("i <= j is "+ (i<=j));
        System.out.println("i == j is "+ (i==j));
        System.out.println("i != j is "+ (i!=j));
        System.out.println("---------------");
        System.out.println("(i<56) && (j<56) "+ ((i<56) && (j<56)));
        System.out.println("(i<56) || (j<56) "+ ((i<56) || (j<56)));
    }

    public boolean test1(int val) {
        boolean b = (val<1);
        System.out.println("test1 result : "+ b);
        return b; 
    }

    public boolean test2(int val) {
        boolean b = (val<2);
        System.out.println("test2 result : "+ b);
        return b; 
    }

    public boolean test3(int val) {
        boolean b = (val<3);
        System.out.println("test3 result : "+ b);
        return b; 
    }
 
    //短路
    public void shortCircuit(){
        boolean b = test1(0) && test2(2) && test3(3);
        System.out.println("expression is "+ b);
    }
}