package top.woilanlan.holding;

import java.util.LinkedList;

/**
 * 栈：通常指 “后进先出”的容器，有时候栈也被称为叠加栈，最后“压入”栈的元素，第一个弹出“栈”
 * LinkedList 具有能够实现栈的所有功能的方法。
 *
 * 通过泛型，引入了在栈的类定义中最简单的可行示例
 * 类名之后的<T>告诉编译器这将是一个参数化类型，
 * 而其中的参数类型，在类被使用时将会被实际类型替换
 * @param <T>
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T v){
        storage.addFirst(v);
    }
    //提供栈顶元素但并不将其从栈顶移除
    public T peek(){
        return storage.getFirst();
    }
    //移除并返回栈顶元素
    public T pop(){
        return storage.removeFirst();
    }
    public boolean empty(){
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
