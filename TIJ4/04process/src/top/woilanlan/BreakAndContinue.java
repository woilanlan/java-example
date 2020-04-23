package top.woilanlan;

/**
 * BreakAndContinue
 */
public class BreakAndContinue {

    public int[] rang(int max) {
        int[] array = new int[max];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    public void shwo() {
        for (int i = 0; i < 100; i++) {
            if (i == 74)
                break;  //中断循环
            if (i % 9 != 0)
                continue;   //跳过本次循环剩余部分，继续下一次循环。
            System.out.print(i + " ");
        }

        System.out.println("");

        for (int i : rang(100)) {
            if (i == 74)
                break;
            if (i % 9 != 0)
                continue;
            System.out.print(i + " ");
        }

        System.out.println("");

        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269)
                break;
            if (i % 10 != 0)
                continue;
            System.out.print(i + " ");
        }
    }
}