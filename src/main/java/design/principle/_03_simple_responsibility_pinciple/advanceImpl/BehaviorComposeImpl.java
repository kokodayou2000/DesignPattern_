package design.principle._03_simple_responsibility_pinciple.advanceImpl;

import design.principle._03_simple_responsibility_pinciple.IBehavior;
import design.principle._03_simple_responsibility_pinciple.IBehaviorComposer;
import design.principle._03_simple_responsibility_pinciple.ILive;
import design.principle._03_simple_responsibility_pinciple.IWork;
import design.principle._03_simple_responsibility_pinciple.impl.LiveImpl;
import design.principle._03_simple_responsibility_pinciple.impl.WorkImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class BehaviorComposeImpl implements IBehaviorComposer {

    private ArrayList<IBehavior> behaviors = new ArrayList<>();

    @Override
    public void add(IBehavior behavior) {
        behaviors.add(behavior);
    }

    public void doSomething(){
        behaviors.stream().forEach((o)->{
            if (o instanceof IBehavior){
                //只获取本类的，不要获取父类的方法，比如equals,toString等方法
                Method[] method = o.getClass().getDeclaredMethods();
                try {
                    for (Method method1 : method) {
                        method1.invoke(o);
                    }
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }

        });

    }

}
