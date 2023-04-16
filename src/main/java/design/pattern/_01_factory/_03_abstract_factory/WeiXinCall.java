package design.pattern._01_factory._03_abstract_factory;

public class WeiXinCall implements ICall {
    @Override
    public void call() {
        System.out.println("微信的打电话功能");
    }
}
