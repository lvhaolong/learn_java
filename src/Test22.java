/*
比较两个数据是否相等
参数类型分别为两个int类型，两个double类型，并在main方法中进行测试
 */
public class Test22 {
    public static void main(String[] args) {
        boolean x=abc(10,20);
        System.out.println(x);
        boolean y=abc(10.0,10.0);
        System.out.println(y);

    }
    /*
    比较两个数据是否相等
    1.返回值类型boolean
    2.参数列表int a,int b
     */
    public static boolean abc(int a,int b) {
        return a==b;

    }
    public static boolean abc(double a,double b) {
        return a==b;
    }

}
