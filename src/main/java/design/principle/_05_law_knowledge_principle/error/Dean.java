package design.principle._05_law_knowledge_principle.error;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dean {
    public void getClassNum(Teacher t) {

        //创建学生信息
        //教导主任这里有学生表
        List<Student> studentList;
        studentList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(2);
            if (num == 1){
                studentList.add(new Student("男"));
            }else {
                studentList.add(new Student("女"));
            }
        }
        //将学生表交给老师
        t.checkNumberStu(studentList);
    }


}
