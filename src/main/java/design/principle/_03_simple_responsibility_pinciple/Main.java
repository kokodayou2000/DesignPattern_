package design.principle._03_simple_responsibility_pinciple;

import design.principle._03_simple_responsibility_pinciple.impl.BehaviorComposeImpl;
import design.principle._03_simple_responsibility_pinciple.impl.LiveImpl;
import design.principle._03_simple_responsibility_pinciple.impl.WorkImpl;

public class Main {
    public static void main(String[] args) {
        BehaviorComposeImpl behaviorCompose = new BehaviorComposeImpl();
        behaviorCompose.add(new WorkImpl());
        behaviorCompose.doSomething();
        behaviorCompose.add(new LiveImpl());
        behaviorCompose.doSomething();

    }
}
