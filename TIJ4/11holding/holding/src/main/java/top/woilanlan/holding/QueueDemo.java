package top.woilanlan.holding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * 从LinkedList向上转换到队列
 * 队列是一个典型的先进先出的容器，
 * 从容器的一端放入事物，从另一段取出，事物放入容器的顺序与取出的顺序是相同的
 * 队列常被当作一种可靠的将对象从程序的某个区域传输到另一个区域的途径
 * LinkedList 实现了 Queue 接口
 */
public class QueueDemo {

    public static void printQ(Queue queue) {
        // 检索但不删除此 List 的头(第一个元素)。
        while (queue.peek() != null)
            System.out.print(queue.remove() + " "); //检索并删除此 List 的头
        System.out.println();
    }

    public static void show() {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++)
            queue.offer(rand.nextInt(i + 10));  // 将指定的元素添加为此列表的末尾
        printQ(queue);

        Queue<Character> qc = new LinkedList<Character>();
        for (char c : "Brontosaurus".toCharArray())
            qc.offer(c);
        printQ(qc);
    }
}
