package design.principle._05_law_knowledge_principle.error;

public class Main {
    public static void main(String[] args) {
        //教导主任需要对学生男女比例进行了解
        //教导主任只需要对老师发布任务即可
        //教导主任不需要对学生有任何交流即可完成任务

        Dean dean = new Dean();
        Teacher t1 = new Teacher();
        dean.getClassNum(t1);



    }
}
