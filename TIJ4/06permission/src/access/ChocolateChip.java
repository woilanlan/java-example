package access;

import access.dessert.Cookie;

/**
 * ChocolateChip
 */
public class ChocolateChip extends Cookie{

    public ChocolateChip() {
        System.out.println("ChocolateChip Constructor");
    }

    public void chomp() {
        //bite();
    }

    public static void show() {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
    
}