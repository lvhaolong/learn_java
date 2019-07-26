public class mianxiangduixiang1 {
    public static void main(String[] args) {
        //创建对象的格式：类名 对象名=new 类名（）；
        /*对象名：其实就是合法的标识符，
         如果是一个单词所有字母小写，
         如果多个单词，从第二个单词开始首字母大写
        */
        Student a=new Student();
       //*D:如何使用成员变量呢？
        //*对象名.变量名
        a.name="张三";
        a.age=23;
        System.out.println(a.name+"..."+a.age);

        //*E：如何使用成员方法呢？
        //*对象名.方法名（...）
        a.study();
        a.sleep();




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