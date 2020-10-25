package LX2;

public class Student extends People {
    String lesson;
    Student(String id,String name,String sex,String lesson){
        super(id,name,sex);
        setLesson(lesson);
    }
    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
    public String toString() {
        return "{"+"学生学号:"+getId()+" 姓名:"+getName()+" 性别:"+getSex()+" 所选课程:"+lesson+"}";
    }
}
