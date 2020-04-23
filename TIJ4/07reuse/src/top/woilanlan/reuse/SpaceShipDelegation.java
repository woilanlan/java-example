package top.woilanlan.reuse;

/**
 * SpaceShipDegation
 * 代理
 */
public class SpaceShipDelegation {

    private String name;

    private SpaceShipControls control = new SpaceShipControls();
    
    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    

    // Delegated methods 代理方法（public）

    public void up(int velocity) {
        control.up(velocity);
    }

    public void down(int velocity) {
        control.down(velocity);
    }

    public void left(int velocity) {
        control.left(velocity);
    }

    public void right(int velocity) {
        control.right(velocity);
    }

    public void forward(int velocity) {
        control.forward(velocity);
    }

    public void back(int velocity) {
        control.back(velocity);
    }

    public void turboBoost() {
        control.turboBoost();
    }
    
    public static void show() {
        SpaceShipDelegation protector = new SpaceShipDelegation("NESA Protector");
        protector.forward(100);
        System.out.println(protector);
    }

    @Override
    public String toString() {
        return "SpaceShipDelegation [control=" + control + ", name=" + name + "]";
    }
}