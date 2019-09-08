public class day_15_1Aug {
    public static void main(String[] args) {
    }
        private String name;
        private int ag;;
        //学生id
        private int sid;
        //类变量，记录学生数量，分配学号
        public static int numberOfStuent = 0;

        public  void Studty (String name,int age){
            this.name = name;
            this.ag = age;
            //通过numberOfSudent 给学生分配学生
            this.sid = ++numberOfStuent;

        }
        //打印属性值
        public void show () {
            System.out.println("student : name=" + name + ",age=" + ag+ ",sid" + sid);
        }


    }

