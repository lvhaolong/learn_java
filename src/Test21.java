/*
重载：方法名相同，参数列表不同，与返回值类型无关。
 */
public class Test21 {  //Test21重载
    public static void main(String[] args) {
        int x=add(10,20,30);
        System.out.println(x);



    }
    /*
    求两个整数的和
    1.返回值类型int
    2.参数列表 int a,int b
     */
    public static int add(int a,int b) {
        return a+b;
    }
    public static int add(int a,int b,int c) {
        return a+b+c;
    }


}
