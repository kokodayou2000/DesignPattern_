package design.pattern._02_singleton;

/**
 * 饿汉模式
 */
public class _01_Hungry {
    private static final _01_Hungry instance = new _01_Hungry();

    private _01_Hungry(){}

    public static _01_Hungry getInstance(){
        return instance;
    }

}
