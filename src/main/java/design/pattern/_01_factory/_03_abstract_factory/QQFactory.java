package design.pattern._01_factory._03_abstract_factory;

public class QQFactory extends SoftFactory{
    @Override
    protected ICall callFunction() {
        return new QQCall();
    }

    @Override
    protected IChat chatFunction() {
        return new QQChat();
    }

    @Override
    protected IMoments onlineFunction() {
        return new QQMoments();
    }
}
