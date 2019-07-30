public class class1  {
    public static void main(String[] args) {
    person p1=new person();
    p1.name="张三";
   // p1.age=23;
   // p1.speak();
        p1.setAge(-17);
        System.out.println(p1.getAge());


    }
}
class preson {
    String name;   //姓名
     private int age;
     public void setAge(int a) {
         if (a>0&&a<200)

         age=a;
         { else {
             System.out.println("...");
         }


     public int getAge() {
         return age;
     }
    public void speak() {
        System.out.println(name+"..."+age);
    }
}