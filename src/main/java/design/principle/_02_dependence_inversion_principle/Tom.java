package design.principle._02_dependence_inversion_principle;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Tom {

    private ICourse course;

    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.setCourse(new EnglishCourse());
        tom.getCourse().study();
        //tom突然想学一个新的课程了
        tom.setCourse(() -> System.out.println("我想学java了"));
        tom.getCourse().study();
    }
}
