package design.pattern._02_singleton.refelect;

import java.io.Serializable;


public class SerializableSingleton implements Serializable {
    //即使是饿汉模式，在序列化的状态也无法保证单例
    private final static SerializableSingleton INSTANCE = new SerializableSingleton();

    private SerializableSingleton(){}

    public static SerializableSingleton getInstance(){
        return INSTANCE;
    }

    public Object readResolve(){
        return INSTANCE;
    }
}
