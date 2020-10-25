package LX2;

public class Course {
    String code;
    String LessonName;
    String site;
    String time;

    Course(String code, String LessonName, String site, String time) {
        setCode(code);
        setLessonName(LessonName);
        setSite(site);
        setTime(time);
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLessonName(String lessonName) {
        LessonName = lessonName;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String toString() {
        return "{" + "课程编号:" + code + " 课程名称:" + LessonName + " 上课地点:" + site + " 上课时间:" + time + "}";
    }
}
