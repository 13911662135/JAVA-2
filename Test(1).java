package LX2;

import java.util.Scanner;

public class Test {
    public static void main(String[] arg){
        Course c = new Course("01","JAVA","201","13:00");
        Teacher t = new Teacher("01","玛卡巴卡","可能是男的",c);
        Student s = new Student("01","李明","男","无");
        System.out.println(c+"\n"+t+"\n"+s);
        System.out.println("选课输入1，不选课滚");
        Scanner i = new Scanner(System.in);
        String x = i.nextLine();
        switch (x){
            case "1":
                System.out.println("输入课程编号");
                Scanner y = new Scanner(System.in);
                int u = y.nextInt();
                switch(u){
                    case 1:
                        s.setLesson(c.LessonName);
                        break;
                    default:
                        System.out.println("没看课程列表？？？滚蛋");
                        System.exit(-1);
                }
                break;
            default:
                System.out.println("不选课进你妈呢？？？滚");
                System.exit(-1);
        }
        System.out.println("退课输1，不退输0");
        Scanner w = new Scanner(System.in);
        int z = w.nextInt();
        if(z == 1){
            s.setLesson("未选课");
            System.out.println(s);
        }
        else if(z == 0){
            System.out.println("祝您生活愉快嘻嘻"+"\n"+s);
        }
        else{
            System.out.println("看不懂提示？？？速速爬开，算我求你");
            System.exit(-1);
        }
    }
}
