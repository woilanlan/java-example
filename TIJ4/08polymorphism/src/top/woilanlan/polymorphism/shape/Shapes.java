package top.woilanlan.polymorphism.shape;

/**
 * Shapes
 */
public class Shapes {

    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void show() {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for (Shape shp : s) {
            shp.draw();
        }
    }
}