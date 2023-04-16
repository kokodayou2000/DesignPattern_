package design.principle._05_law_knowledge_principle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Teacher {

    List<Student> studentList;

    public Teacher (){
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
    }

    HashMap<String,Integer> map = new HashMap<>();
    {
        map.put("男",0);
        map.put("女",0);
    }
    public void checkNumberStu(){

        studentList.forEach((o)->{
            if (o.getGender().equals("男")){
                map.put("男",map.get("男")+1);
            }else {
                map.put("女",map.get("女")+1);
            }
        });

        System.out.println("男生数量 ："+map.get("男"));
        System.out.println("女生数量 ："+map.get("女"));
    }
}
