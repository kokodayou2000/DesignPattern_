package design.pattern._01_factory._03_abstract_factory;

public class _03_abstract_factory {
    public static void main(String[] args) {
        SoftFactory weiXinFactory = new WeiXinFactory();
        weiXinFactory.callFunction().call();
        weiXinFactory.chatFunction().chat();
        weiXinFactory.onlineFunction().moment();

        SoftFactory qqFactory = new QQFactory();
        qqFactory.callFunction().call();
        qqFactory.chatFunction().chat();
        qqFactory.onlineFunction().moment();

    }
}
