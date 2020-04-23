package top.woilanlan;


class Book {
    boolean checkOut = false;

    public Book(boolean checkOut) {
        this.checkOut = checkOut;
    }

    //所有的Book对象在被当作垃圾回收前都应该被签入
    void checkIn(){
        checkOut = false;
    }

    //验证终结条件
    protected void finalize(){
        if(checkOut){
            System.out.println("Error: checked out");
            //你应该总是假设基类版本的finalize()也要做某些重要的事情
            //super.finalize();
        }
    }
    
}

/**
 * TerminationCondition
 */
public class TerminationCondition {

    public void show() {
        Book novel = new Book(true);
        novel.checkIn();    //清理
        
        new Book(true);     //删除引用，忘记清理

        System.gc();       //强制完成垃圾收集
    }
}