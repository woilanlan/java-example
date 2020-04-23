package top.woilanlan.interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * RandomWord
 * Readable接口只要求实现read()方法,在read()内部，将输入内容添加到CharBuffer参数中
 * 或者在没有任何输入时返回-1
 */
public class RandomWords implements Readable {

    private static Random rand = new Random(47);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();

    private int count;
    public RandomWords(int count){
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0){
            return -1;  //标识输入结束
        }
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10;  //字符增加的数量
    }

    public static void show() {
        Scanner s = new Scanner(new RandomWords(10));
        while(s.hasNext()){
            System.out.println(s.next());
        }
    }
}