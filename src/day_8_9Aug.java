
         /*   class Student {
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

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }
*/

public class day_8_9Aug {


    public static void main(String[] args) {
        //创建学生数组
        Student[] students = new Student[3];
        //创建学生对象
      //  Student s1 = new Student("国家人口",14);
       // Student s2 = new Student("晨鸣",12);
       // Student s3 = new Student("睚睦",15);

        //students[0] = s1;
       // students[1] = s2;
       // students[2] = s3;
        for (int x = 0; x < students.length; x++) {
            Student s = students[x];
            //System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}

