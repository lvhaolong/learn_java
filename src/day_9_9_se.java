//Scanner的使用
//1.导包
import java.util.Scanner;
public class day_9_9_se {
    public static void main(String[] args) {
        //2.创建键盘输入数据的对象
        Scanner sc=new Scanner(System.in);

        //3.接收数据
        System.out.println("请录入一个整数：");
        int i=sc.nextInt();

        //4.输出数据
        System.out.println("i:"+i);

    }
}
