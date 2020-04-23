package top.woilanlan.interfaces;

interface Monster{
    void menace();
}

interface DangerousMonster extends Monster{
    void destroy();
}

interface Lethal{
    void kill();
}

class DragonZilla implements DangerousMonster{

    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }
    
}

interface Vampire extends DangerousMonster,Lethal{
    void drinkBlood();
}

class VeryBadVampire implements Vampire{

    @Override
    public void destroy() {

    }

    @Override
    public void menace() {

    }

    @Override
    public void kill() {

    }

    @Override
    public void drinkBlood() {

    }
    
}

/**
 * HorrorShow
 * 通过继承来扩展接口
 * 一般情况下，只可以将extends用于单一类，但是可以引用多个基类接口
 */
public class HorrorShow {
    public static void u(Monster b) {
        b.menace();
    }
    public static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    public static void w(Lethal l) {
        l.kill();
    }

    public static void show() {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad); 
    }
    
}