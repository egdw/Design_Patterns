package im.hdy.singleton;

//线程安全的方式
public class SafeSingleton {
    private static volatile SafeSingleton singleton;

    private SafeSingleton() {
    }

    public static SafeSingleton getSingleton(){
        synchronized (SafeSingleton.class) {
            if (singleton == null) {
                singleton = new SafeSingleton();
            }
        }
        return singleton;
    }
}
