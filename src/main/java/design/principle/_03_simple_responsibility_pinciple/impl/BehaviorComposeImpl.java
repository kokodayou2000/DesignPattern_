package design.principle._03_simple_responsibility_pinciple.impl;

import design.principle._03_simple_responsibility_pinciple.IBehavior;
import design.principle._03_simple_responsibility_pinciple.IBehaviorComposer;
import design.principle._03_simple_responsibility_pinciple.ILive;
import design.principle._03_simple_responsibility_pinciple.IWork;

import java.util.ArrayList;

public class BehaviorComposeImpl implements IBehaviorComposer {

    private ArrayList<IBehavior> behaviors = new ArrayList<>();

    @Override
    public void add(IBehavior behavior) {
        behaviors.add(behavior);
    }

    public void doSomething(){
        behaviors.stream().forEach((o)->{
            if (o instanceof ILive){
                o = new LiveImpl();
                ((LiveImpl) o).eat();
                ((LiveImpl) o).study();
                ((LiveImpl) o).wash();
                ((LiveImpl) o).sleep();
            }else if (o instanceof IWork){
                o = new WorkImpl();
                ((WorkImpl) o).eat();
                ((WorkImpl) o).goof();
                ((WorkImpl) o).overtime();
            }

        });

    }

}
