/*
A:键盘输入两个数据，返回两个数中的较大值
B:键盘输入两个数据，返回两个数中的较大值
 */
import java.util.Scanner;
public class Test13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int x=sc.nextInt();
        System.out.println("请输入第二个整数：");
        int y=sc.nextInt();
        int max=maxget(x,y);
        System.out.println(max);
    }
    /*
    返回连个整数的较大值
    1.明确返回值类型 int
    2.明确参数列表 int a,int b
     */
    public static int maxget(int a,int b) {
        return a>b? a : b;
    }



}
