package design.principle._07_Composite_reuse_principle.error;

public class WhiteLaptop extends BusinessLaptop{
    void color(){
        System.out.println("白色的");
        super.type();
    }
}
