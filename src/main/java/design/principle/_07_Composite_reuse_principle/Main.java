package design.principle._07_Composite_reuse_principle;

public class Main {
    public static void main(String[] args) {
        //
        Dell inspiron = new Dell();
        inspiron.setType(() -> {
            System.out.println("轻薄本");
        });
        inspiron.setColor(()->{
            System.out.println("银色的");
        });

        inspiron.type.getType();
        inspiron.color.getColor();

    }
}
