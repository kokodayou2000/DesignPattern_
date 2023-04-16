package design.pattern._02_singleton.refelect;

import java.io.*;

public class SerializableSingletonTest {
    public static void main(String[] args) {

        SerializableSingleton s1 = null;
        //创建对象，加载到内存中
        SerializableSingleton s2 = SerializableSingleton.getInstance();
        FileOutputStream fos = null;
        try{
            //执行保存的文件名称
            fos = new FileOutputStream("SerializableSingleton.obj");
            //创建流
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //写入
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            //创建读取流
            FileInputStream fis = new FileInputStream("SerializableSingleton.obj");
            //创建对象的写入流
            ObjectInputStream ois = new ObjectInputStream(fis);
            //创建对象
            s1 = (SerializableSingleton)ois.readObject();
            ois.close();
            System.out.println(s1);
            System.out.println(s2);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
