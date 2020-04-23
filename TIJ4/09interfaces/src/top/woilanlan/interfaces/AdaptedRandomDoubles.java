package top.woilanlan.interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * AdaptedRandomDoubles
 * 适配器模式
 * 可以在任何现有类之上添加新的接口
 */
public class AdaptedRandomDoubles extends RandomDoubles implements Readable {
    private int count;
    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0){
            return -1;
        }
        String result = Double.toString(next())+" ";
        cb.append(result);
        return result.length();
    }
    public static void show() {
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));
        while(s.hasNextDouble()){
            System.out.print(s.nextDouble()+" ");
        }
    }
}