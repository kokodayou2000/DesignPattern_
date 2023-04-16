package design.pattern._01_factory._03_abstract_factory;

public class WeiXinFactory extends SoftFactory{
    @Override
    protected ICall callFunction() {
        return new WeiXinCall();
    }

    @Override
    protected IChat chatFunction() {
        return new WeiXinChat();
    }

    @Override
    protected IMoments onlineFunction() {
        return new WeiXinMoments();
    }
}
