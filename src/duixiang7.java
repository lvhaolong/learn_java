public class duixiang7 {
    public static void main(String[] args) {
        rar c1=new rar();
       /* c1.color="red";
        c1.num=8;
        c1.run();*/
        //method(c1);

        method(new rar());
        rar c2=new rar();
        //method(c2);
        method(new rar()); //匿名对象可以当作参数传递


    }
    //抽取方法提高代码的复用性
    public static void method(rar cc) { //rar cc=new rar();
        cc.color="red";
        cc.num=8;
        cc.run();
    }
}
class rar {
    String color; //颜色
    int num;
    public void run() {
        System.out.println(color+"..."+num);
    }
}
