package design.pattern._01_factory._03_abstract_factory;

public class QQCall implements ICall {
    @Override
    public void call() {
        System.out.println("QQ的打电话功能");
    }
}
