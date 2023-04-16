package design.principle._02_dependence_inversion_principle;

public class EnglishCourse implements ICourse{
    @Override
    public void study() {
        System.out.println("我在学英语");
    }
}
