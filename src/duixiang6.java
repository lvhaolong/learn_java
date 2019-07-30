public class duixiang6 {
    public static void main(String[] args) {
       /* Car cl=new Car();  //创建有名字的对象
        cl.run();
        cl.run();

        new Car().run();  //匿名对象调用方法
        new Car().run();  //匿名对象只适合对方法的一次调用 ，
        // 因为调用多次就会产生多个对象，不如用有名字的对象。
        //匿名对象是否可以调用属性并赋值？有什么意义？
        */
       /*
       匿名对象可以调用属性，但是没有意义，因为调用后就变成垃圾
       如果需要赋值还是用有名字对象
        */
       new Car().color="red";
         new Car().num=8;
       new Car().run();
    }



}
class Car {
    String color; //颜色
    int num;
    public void run() {
        System.out.println(color+"..."+num);
    }
}
