package im.hdy.singleton;

//兼顾安全和效率的单例模式
public class SafeEffectiveSingleton {
    private static volatile SafeEffectiveSingleton singleton;

    private SafeEffectiveSingleton() {
    }

    public static SafeEffectiveSingleton getSingleton(){
        if (singleton == null) {
            synchronized (SafeEffectiveSingleton.class) {
                singleton = new SafeEffectiveSingleton();
            }
        }
        return singleton;
    }
}
