package design.principle._07_Composite_reuse_principle.error;

public  class BlackLaptop extends BusinessLaptop{
    void color(){
        System.out.println("黑色的");
        super.type();
    }
}
