package top.woilanlan.reuse;

/**
 * SpaceShip
 * 使用继承
 */
public class SpaceShip extends SpaceShipControls{

    private String name;
    public SpaceShip(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "SpaceShip [name=" + name + "]";
    }

    public static void show() {
        SpaceShip protector = new SpaceShip("NESA protector");
        protector.forward(100);
        System.out.println(protector);
    }
}