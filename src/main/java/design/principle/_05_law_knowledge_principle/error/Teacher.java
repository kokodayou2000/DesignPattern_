package design.principle._05_law_knowledge_principle.error;

import java.util.HashMap;
import java.util.List;

public class Teacher {


    HashMap<String,Integer> map = new HashMap<>();
    {
        map.put("男",0);
        map.put("女",0);
    }
    public void checkNumberStu(List<Student> studentList){

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
