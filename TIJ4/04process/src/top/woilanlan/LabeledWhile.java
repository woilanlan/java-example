package top.woilanlan;

/**
 * LabeledWhile
 */
public class LabeledWhile {

    /**
     * 使用标签的唯一理由是因为有循环嵌套的存在，想从多层嵌套中break或者continue
     */
    public void show() {
        int i=0;
        outer:
        while(true){
            System.out.println("Outer while loop");
            while(true){
                i++;
                System.out.println("i = "+i);
                if(i==1){
                    System.out.println("continue");
                    continue;
                }
                if(i==3){
                    System.out.println("continue outer");
                    continue outer;
                }
                if(i==5){
                    System.out.println("break");
                    break;
                }
                if(i==7){
                    System.out.println("break outer");
                    break outer;
                }
            }
        }
    }
}