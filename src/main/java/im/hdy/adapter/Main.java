package im.hdy.adapter;

public class Main {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new USAdaptee());
        adapter.request();
        Adapter adapter1 = new Adapter(new JapanAdaptee());
        adapter1.request();
    }
}
