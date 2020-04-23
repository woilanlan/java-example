package top.woilanlan;

/**
 * LabeledFor
 */
public class LabeledFor {

    //如果想在中断循环的同时退出，简单使用一个return即可
    public void show() {
        int i=0;
        outer:
        for(;true;){
            inner:
            for(;i<10;i++){
                System.out.println("i = "+i);
                if(i==2){
                    System.out.println("continue");
                    continue;
                }
                if(i==3){
                    //break会中断for循环，在抵达for循环的末尾之前，递增表达式不会执行
                    System.out.println("break");
                    i++;    //否则i的值将不再增加
                    break;
                }
                if(i==7){
                    //continue outer，会跳到循环顶部，也会跳过递增
                    System.out.println("continue outer");
                    i++;    //否则i的值将不再增加
                    continue outer;
                }
                if(i==8){
                    //从内部循环里跳出外部循环
                    System.out.println("break outer");
                    break outer;
                }

                for (int k = 0; k < 5; k++) {
                    if(k==3){
                        System.out.println("continue inner");
                        continue inner;
                    }
                }

            }
        }
    }
}