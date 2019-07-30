public class 封装 {
    public static void main(String[] args) {
        封装1 p1=new 封装1();
        p1.name="张三";
       //p1.age=-17;
        p1.speak();
    }

}
class 封装1 {
    String name;
    private int age;
    public void speak() {
        System.out.println(name+"..."+age);
    }
}
