package design.pattern._02_singleton;

public class Safe_Lazy_doubleCheck {

    private static volatile Safe_Lazy_doubleCheck instance;

    private Safe_Lazy_doubleCheck(){}

    public static Safe_Lazy_doubleCheck getInstance(){

        if (instance == null){
            synchronized (Safe_Lazy_doubleCheck.class){
                if (instance == null){
                    instance = new Safe_Lazy_doubleCheck();
                }
            }
        }
        return instance;
    }
}
