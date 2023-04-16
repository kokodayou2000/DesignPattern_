package design.pattern._02_singleton;

/**
 * 懒汉模式
 */
public class _02_Lazy {
    private static _02_Lazy instance;

    private _02_Lazy(){}

    public static  _02_Lazy getInstance(){
        if (instance == null){
            instance = new _02_Lazy();
        }
        return instance;
    }

}
