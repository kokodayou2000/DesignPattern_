package design.pattern._02_singleton.refelect;

import design.pattern._02_singleton.Safe_Lazy_doubleCheck;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Double_Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //试用反射创建对象不一致的单例对象
        Class<Safe_Lazy_doubleCheck> clazz = Safe_Lazy_doubleCheck.class;
        Constructor<Safe_Lazy_doubleCheck> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        Safe_Lazy_doubleCheck o1 = c.newInstance();
        Safe_Lazy_doubleCheck o2 = c.newInstance();

        System.out.println(o1 == o2);


    }
}
