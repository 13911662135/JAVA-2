package LX2;

public class Teacher extends People {
    Course c;

    Teacher(String id, String name, String sex, Course c) {
        super(id, name, sex);
        this.c = c;
    }

    public String toString() {
        return "{" + "教师编号:" + id + " 教师姓名:" + name + " 性别:" + sex + " 所授课程:" + c.LessonName + "}";
    }
}
