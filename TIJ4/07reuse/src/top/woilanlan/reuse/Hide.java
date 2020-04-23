package top.woilanlan.reuse;

class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return c;
    }

    // 方法重载
    float doh(float f) {
        System.out.println("doh(float)");
        return f;
    }
}

class Milhouse {
}

class Bart extends Homer {

    // 属于方法重载
    void doh(Milhouse m) {
        System.out.println("doh(Milhouse)");
    }

    //方法覆写（重写）
    @Override
    char doh(char c) {
        return super.doh(c);
    }
}



/**
 * Hide
 * 重载与重写
 */
public class Hide {

    public static void show() {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}