package design.pattern._01_factory._03_abstract_factory;

public abstract class SoftFactory {

    protected abstract ICall callFunction();
    protected abstract IChat chatFunction();
    protected abstract IMoments onlineFunction();


}
