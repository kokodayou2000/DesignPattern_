package design.pattern._01_factory._02_factory_function;

public class _02_factory_function {
    public static void main(String[] args) {
        BenzFactory benzFactory = new BenzFactory();
        benzFactory.create().CarBrand();

        BWMFactory bwmFactory = new BWMFactory();
        bwmFactory.create().CarBrand();


    }
}
