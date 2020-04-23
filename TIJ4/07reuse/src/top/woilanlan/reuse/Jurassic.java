package top.woilanlan.reuse;

class SmallBrain{

}

final class Dinosaur{
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();
    void f(){} 
}

//不可被继承
/* class Further extends Dinosaur{
    
} */

/**
 * Jurassic
 * 当将某个类的整体定义为final时，该类将不能被继承
 */
public class Jurassic {

    public static void show() {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j ++;
    }
}