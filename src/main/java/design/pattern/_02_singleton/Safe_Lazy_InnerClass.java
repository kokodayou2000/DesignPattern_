package design.pattern._02_singleton;

public class Safe_Lazy_InnerClass {
    private Safe_Lazy_InnerClass(){}

    public static final Safe_Lazy_InnerClass getInstance(){
        return LazyHolder.LAZY;
    }

    //内部类是会在方法调用前初始化的，避免了线程安全的问题
    private static class LazyHolder{
        private static final Safe_Lazy_InnerClass LAZY = new Safe_Lazy_InnerClass();
    }
}
