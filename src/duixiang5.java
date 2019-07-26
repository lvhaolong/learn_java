public class duixiang5 {
    public static void main(String[] args) {
        printf(10);
        sdudent s=new sdudent();//创建对象，并将对象的地址值赋值给s
        print(s);
    }
    public static void printf(int x) {  //基本数据类型当作形式参数
        System.out.println(x);
    }
    public static void print(sdudent s) {  //引用数据类型当作形式参数
        s.name="张三";
        s.age=23;
        s.speak();
    }
}
/*
*A:方法的参数是类名public void print(student s){}//print(new student());
* 如果你看到了一人方法的形式参数是一个类类型（引用类型），这里其实需要的是该类的对象。
 */
class sdudent {
    String name;
    int age;

    public void speak() {
        System.out.println(name+"..."+age);
    }
}





