public class day_8_10_se {
    public static void main(String[] args) {
         class Student {
             //成员变量
             private String name;
             private int age;

             //构造方法
             public Student() {
             }

             public Student(String name, int age) {
                 this.name = name;
                 this.age = age;
             }

             //成员方法
             public void setName(String name) {
                 this.name=name;
             }
             public String getName() {
                 return name;
             }

             public void setAge(int age) {
                 this.age=age;
             }

             public int getAge() {
                 return age;
             }
         }

        //无参构造使用
        Student s=new Student();
         s.setName("柳岩");
         s.getAge();
         System.out.println(s.getName()+"---"+s.getAge());

         //带参构造使用
        Student s2=new Student("赵丽颖",18);
        System.out.println(s2.getName()+"---"+s2.getAge());

    }

}
