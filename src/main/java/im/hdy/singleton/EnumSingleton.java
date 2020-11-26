package im.hdy.singleton;

//基于枚举的单例模式
public enum EnumSingleton {
    INSTANCE;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
