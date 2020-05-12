package top.woilanlan.holding;

import java.util.*;

/**
 * 队列规则：在给定一组队列中的元素的情况下，确定下一个弹出队列的元素的规则。
 * 先进先出声明的是下一个元素应该是等待时间最长的元素
 * 优先级队列：声明下一个弹出元素是最需要的元素（具有最高的优先级）
 * 调用 offer() 方法来插入一个对象时，这个对象会在队列中被排序，
 * 默认的排序将使用对象在队列中的自然顺序
 */
public class PriorityQueueDemo {
    public static void show() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++)
            priorityQueue.offer(rand.nextInt(i + 10));
        QueueDemo.printQ(priorityQueue);

        List<Integer> ints = Arrays.asList(25, 22, 20,
                18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<Integer>(ints);
        QueueDemo.printQ(priorityQueue);
        // Collections.reverseOrder()
        // 返回一个比较器，该比较器对实现Comparable接口的对象集合强制执行与自然顺序相反的操作。
        priorityQueue = new PriorityQueue<Integer>(
                ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        QueueDemo.printQ(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPQ =
                new PriorityQueue<String>(strings);
        QueueDemo.printQ(stringPQ);
        stringPQ = new PriorityQueue<String>(
                strings.size(), Collections.reverseOrder());
        stringPQ.addAll(strings);
        QueueDemo.printQ(stringPQ);

        Set<Character> charSet = new HashSet<Character>();
        for (char c : fact.toCharArray())
            charSet.add(c); // Autoboxing
        PriorityQueue<Character> characterPQ = new PriorityQueue<Character>(charSet);
        QueueDemo.printQ(characterPQ);
    }
}
