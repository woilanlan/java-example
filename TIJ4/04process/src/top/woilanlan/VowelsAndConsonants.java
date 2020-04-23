package top.woilanlan;

import java.util.Random;

/**
 * VowelsAndConsonants
 */
public class VowelsAndConsonants {

    public void show() {
        Random random = new Random(47);
        for (int i = 0; i < 100; i++) {
            //将产生0-26之间的一个值，加上偏移量'a'，即可产生小写字母
            int c = random.nextInt(26) + 'a';
            System.out.print((char) c + ", " + c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case '0':
                case 'u':
                    System.out.println("vowel");
                    break;
                case 'y':
                case 'w':
                    System.out.println("Sometimes a vowel");
                    break;
                default:
                    System.out.println("consonant");
                    break;
            }
        }

    }
}