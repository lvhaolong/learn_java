public class day_15_9_se {
    public static void main(String[] args) {
        class Student {
            private String name;
            private int age;

            public Student() {
            }

            public Student(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge(int age) {
                return age;

            }
            public void setAge(int age) {
               this.age=age;
            }


        }
        //创建学生数组
        Student[] students=new Student[3];

        //创建学生对象
        Student s1=new Student("张天",34);
        Student s2=new Student("掌上电脑",25);
        Student s3=new Student("本地",56);

        //把学生对象作为元素赋值学生数值
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        //遍历学生数组
        for (int x=0;x<students.length;x++) {
            Student s=students[x];
            System.out.println(s.getName()+"---"+s.getAge(12));
        }

    }
}
