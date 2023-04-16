package design.pattern._02_singleton;

public class Container_Test {
    public static void main(String[] args) {
        Obj b1 =(Obj) ContainerSingleton.getBean("design.pattern._02_singleton.Obj");
        b1.print();
        System.out.println(b1);

        Obj b2 =(Obj) ContainerSingleton.getBean("design.pattern._02_singleton.Obj");
        b2.print();
        System.out.println(b2);


    }
}
