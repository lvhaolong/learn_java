public class Test11 {
    public static void main(String[] args) {
       /* int a=10;
        int b=20;
        int sum=a+b;
        System.out.println(sum);

        int c=30;
        int d=40;
        int sum2=c+d;
        System.out.println(sum2);

        */
       int sum=add(10,20);
       System.out.println(sum);
    }
    /*求两个整数的和
    1.整数的和结果应该还是整数
    2.有两个未知内容参与运算

    如何写方法
    1.明确返回值类型
    2.明确参数列表
     */
    public static int add(int a,int b) {
        int sum=a+b;
        return sum;
    }
}
