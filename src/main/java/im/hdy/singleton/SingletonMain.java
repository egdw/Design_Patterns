package im.hdy.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton);
    }
}
