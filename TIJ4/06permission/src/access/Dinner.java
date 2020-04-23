package access;

import org.junit.Test;

import access.dessert.Cookie;

/**
 * Dinner
 */
public class Dinner {

    @Test
    public void testCookie() {
        Cookie x = new Cookie();
        // x.bite();    //不能访问
    }
}