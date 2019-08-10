public class day_8_9Aug {
    public static void main(String[] args) {
        //创建学生数组
        Student[] students=new Student[3];
        //创建学生对象
        Student s1=new Student("张三",12);
        Student s2=new Student("张三",12);
        Student s3=new Student("张三",12);

        public class Student {
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



}
