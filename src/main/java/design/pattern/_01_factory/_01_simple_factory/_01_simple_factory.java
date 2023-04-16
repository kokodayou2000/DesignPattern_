package design.pattern._01_factory._01_simple_factory;


/**
 * 简单工厂模式
 * 使用的反射
 * 创建的品牌相当于图纸，将图纸交给工厂，工厂根据图纸设计出实例
 */
public class _01_simple_factory {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        ICar iCar = factory.create("design.pattern._01_factory._01_simple_factory.BWM");
        iCar.CarBrand();


    }
}
