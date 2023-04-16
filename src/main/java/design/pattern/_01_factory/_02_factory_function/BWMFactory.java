package design.pattern._01_factory._02_factory_function;

public class BWMFactory implements ICarFactory{
    @Override
    public ICar create() {
        return new BWN();
    }
}
