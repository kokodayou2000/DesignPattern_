package design.principle._02_dependence_inversion_principle;

//耦合性太高
public class ErrorStudentTom {
    public String tomStudyEnglish(){
        return "tom 正在学习英语";
    }
    public String tomStudyChinese(){
        return "tom 正在学习语文";
    }
    public String tomStudyMath(){
        return "tom 正在学习数学";
    }

}

