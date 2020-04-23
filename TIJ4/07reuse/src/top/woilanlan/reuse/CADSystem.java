package top.woilanlan.reuse;

class Shape {
    Shape(int i) {
        System.out.println("Shape constructor");
    }

    void dispose() {
        System.out.println("Shape dispose");
    }
}

class Circle extends Shape {

    Circle(int i) {
        super(i);
        System.out.println("Drawing Circle");
    }

    @Override
    void dispose() {
        System.out.println("Erasing Circle");
        super.dispose();
    }
}

class Triangle extends Shape {

    Triangle(int i) {
        super(i);
        System.out.println("Drawing Triangle");
    }

    @Override
    void dispose() {
        System.out.println("Erasing Triangle");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;

    public Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Line: " + start + "," + end);
    }

    @Override
    void dispose() {
        System.out.println("Erasing Line " + start + "," + end);
        super.dispose();
    }
}

/**
 * CADSystem
 * 确保正确的清理
 */
public class CADSystem extends Shape {

    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];

    CADSystem(int i) {
        super(i);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j, j * j);
        }
        c = new Circle(i);
        t = new Triangle(i);
        System.out.println("CADSystem constructor");
    }

    @Override
    void dispose() {
        System.out.println("CADSystem.dispose()");
        //the order of cleanup is the reverse of the order innitialization
        //清除的顺序与初始化的顺序相反
        t.dispose();
        c.dispose();
        for(int i = lines.length -1;i>=0;i--){
            lines[i].dispose();
        }
        super.dispose();
    }

    public static void show() {
        CADSystem x = new CADSystem(47);
        try{

        }finally{
            x.dispose();
        }
    }

    
}