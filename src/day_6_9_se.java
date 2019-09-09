
public class day_6_9_se {

    public static void main(String[] args) {
        //类的定义格式
        class Student {
            //成员变量
            String name;//姓名
            int age;//年龄

            //成员方法
            //学习的方法
            public void study() {
                System.out.println("好好学习，天天向上");
            }

            //吃饭的方法
            public void eat() {
                System.out.println("学习饿了要吃饭");
            }
        }



        //创建对象格式：类名 对象名=new 类名（）；
        Student s = new Student();
        System.out.println("s:" + s);//cn.itcast.Student@100363

        //直接输出成员变量值
        System.out.println("姓名"+s.name);//null
        System.out.println("年龄："+s.age);//0
        System.out.println("----------");

        //给成员变量赋值
        s.name="赵丽颖";
        s.age=18;

        //再次输出成员变量的值
        System.out.println("姓名："+s.name);//赵丽颖
        System.out.println("年龄："+s.age);//18
        System.out.println("--------");

        //调用成员方法
        s.study();//"好好学习，天天向上
        s.eat();//"学习饿了要吃饭”









    }
}


