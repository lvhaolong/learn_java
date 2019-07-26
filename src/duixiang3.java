

public class duixiang3 {
     public static void main(String[] args) {
         car cl=new car();//创建对象
         //调用属性并赋值
         cl.color="red";
         cl.num=8;
         // 调用行为
         cl.run();

         car c2=new car();
         c2.color="black";
         c2.num=4;
         c2.run();

         c2=null;   //用null把原来的地址值覆盖掉了
         cl.run();  //c2里记录的是null,所以报出空指针异常

         car c3=c2;
         c3.run();


     }
}
/*
车的属性
    车的颜色
    车的轮胎数
车的行为
    车运行
 */

class car {
    String color;
    int num;

    public void run() {
        System.out.println(color+"..."+num);
    }
}
