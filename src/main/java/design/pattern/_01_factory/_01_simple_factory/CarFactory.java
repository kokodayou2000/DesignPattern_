package design.pattern._01_factory._01_simple_factory;

public class CarFactory {
    public ICar create(String className){
        try {
            return (ICar) Class.forName(className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
