package design.pattern._01_factory._03_abstract_factory;

public class WeiXinChat implements IChat{
    @Override
    public void chat() {
        System.out.println("微信聊天");
    }
}
