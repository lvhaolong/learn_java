public class class1  {
    public static void main(String[] args) {
    person p1=new person();
    p1.name="张三";
    p1.speak();
    }
}
class preson {
    String name;   //姓名
    int age;
    public void setAge(int a) {
        age=a;
    }

     public int getAge() {
         return age;
     }
    public void speak(){
        System.out.println(name+"..."+age);
    }
}