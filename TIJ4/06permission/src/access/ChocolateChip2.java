package access;

import access.dessert.Cookie2;

/**
 * ChocolateChip
 */
public class ChocolateChip2 extends Cookie2 {

    public ChocolateChip2() {
        System.out.println("ChocolateChip Constructor");
    }

    public void chomp() {
        bite();
    }

    public static void show() {
        ChocolateChip2 x = new ChocolateChip2();
        x.chomp();
    }
    
}