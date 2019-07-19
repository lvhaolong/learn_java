/*
A:需求：根据键盘输入的行数和列数。在控制台输出星形
B:方法调用：
  *单独调用
  *输出调用（错误）
  *赋值调用（错误）
 */
import java.util.Scanner;
public class Test16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int row=sc.nextInt();
        System.out.println("请输入一个整数：");
        int colum = sc.nextInt();
        print(row,colum);




    }
    /*
    在控制台输出矩形星形
    1.明确返回值类型，经分析没有具体的返回传真类型，void
    2.明确参数列表int a,int b
     */
    public static void print(int a,int b) {
        for (int i=1;i<=a;i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }







}
