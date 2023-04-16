package design.pattern._02_singleton;

public class Enum_Test {
    public static void main(String[] args) {
        Object obj = new Object();
        EnumSingleton.INSTANCE.setData(obj);
        System.out.println(EnumSingleton.INSTANCE.getData());

    }
}
