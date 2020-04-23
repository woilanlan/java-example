package top.woilanlan;


class Person {
    public void eat(Apple apple) {
        System.out.println("eat apple");
        apple.getPeeled();
    }
}

class Apple {
    Apple getPeeled(){
        System.out.println("getPeeled");

        //为了将其自身传递给外部方法，必须使用this关键字
        return Peeler.peel(this); 
    }
}

class Peeler {
    //外部工具方法，可以应用于许多不同的类。
    static Apple peel(Apple apple){
        System.out.println("remove peel");
        return apple;
    }
}

/**
 * PassingThis
 */
public class PassingThis {

    public void show() {
        new Person().eat(new Apple());
    }
}