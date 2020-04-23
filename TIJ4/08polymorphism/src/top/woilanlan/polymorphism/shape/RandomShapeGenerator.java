package top.woilanlan.polymorphism.shape;

import java.util.Random;

/**
 * RandomShapeGenerator 工厂
 */
public class RandomShapeGenerator {

    private Random rand = new Random(47);
    public Shape next() {
        switch (rand.nextInt(3)) {
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            default:
                return new Circle();
        }
    }
}