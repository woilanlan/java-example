package top.woilanlan.reuse;


class Villain{
    private String name;
    protected void set(String nm){
        name = nm;
    }
    public Villain(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Villain [name=" + name + "]";
    }
    
}


/**
 * Orc
 * protected关键字
 */
public class Orc extends Villain{

    private int orcNumber;

    public Orc(String name,int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }
    
    public void change(String name,int orcNumber) {
        set(name);  //可以访问
        this.orcNumber = orcNumber;
    }

    @Override
    public String toString() {
        return "Orc [orcNumber=" + orcNumber + "]"+super.toString();
    }

    public static void show() {
        Orc orc = new Orc("Limburger", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}