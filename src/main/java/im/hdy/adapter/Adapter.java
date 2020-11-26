package im.hdy.adapter;

public class Adapter extends Adaptee implements Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        super();
        this.adaptee = adaptee;
    }

    public void request() {
        System.out.println("适配器开始转换。。");
        adaptee.specificRequest();
        System.out.println("适配器运行结束。。");
    }



}
