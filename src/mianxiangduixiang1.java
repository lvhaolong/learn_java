public class mianxiangduixiang1 {
    public static void main(String[] args) {
        //创建对象的格式：类名 对象名=new 类名（）；
    }
}
/*
案例演示
*属性：姓名，年龄，性别
*行为：学习，睡觉
 */
class Student {
    String name;
    int age;
    String gender;

    public void study() {
        System.out.println("学生学习");
    }
    public void sleep() {
        System.out.println("学生睡觉");
    }
}