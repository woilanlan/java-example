package top.woilanlan;

/**
 * TernaryIfElse
 */
public class TernaryIfElse {

    //三元运算符
    public int ternary(int i){
        return i<10 ? i*100 : i*10;
    }

    public int standardIfElse(int i){
        if(i<10){
            return i*100;
        }else{
            return i*10;
        }
    }

    public void show() {
        System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println(standardIfElse(9));
        System.out.println(standardIfElse(10));
    }
}