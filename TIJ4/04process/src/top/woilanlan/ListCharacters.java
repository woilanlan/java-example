package top.woilanlan;

import java.util.Random;

/**
 * ListCharacters
 */
public class ListCharacters {

    public void show() {
        for(char c=0;c<128;c++){
            if(Character.isLowerCase(c)){
                System.out.println("value: "+(int)c+" character: "+c);
            }
        }
    }

    public void commaOperator(){
        for(int i=1,j=i+10;i<5;i++,j=i*2){
            System.out.println("i = "+i+" j = "+j);
        }
    }

    public void foreachFloat(){
        Random rand = new Random(47);
        float[] f = new float[10];
        for (int i = 0; i < f.length; i++) {
            f[i] = rand.nextFloat();
        }
        for (float g : f) {
            System.out.println(g);
        }
    }

    public void foreachString() {
        for (char c : "woilanlan".toCharArray()) {
            System.out.print(c+" ");
        }
    }
}