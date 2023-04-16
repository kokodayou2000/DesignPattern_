package design.principle._03_simple_responsibility_pinciple.advanceImpl;


import design.principle._03_simple_responsibility_pinciple.IBehavior;
import design.principle._03_simple_responsibility_pinciple.IDoAnyThing;
import design.principle._03_simple_responsibility_pinciple.IEat;
import design.principle._03_simple_responsibility_pinciple.IStudy;

public class Main {
    public static void main(String[] args) {
        BehaviorComposeImpl behaviorCompose = new BehaviorComposeImpl();
        behaviorCompose.add((IEat) () -> System.out.println("我吃"));
        behaviorCompose.add((IStudy) () -> System.out.println("我学"));
        behaviorCompose.add((IDoAnyThing) ()-> System.out.println("我做任何事"));
        behaviorCompose.doSomething();
    }
}
