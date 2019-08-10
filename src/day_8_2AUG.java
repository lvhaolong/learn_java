import java.util.Scanner;

public class day_8_2AUG {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a=sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b=sc.nextInt();
        System.out.println("请输入第三个数据：");
        int c=sc.nextInt();

        int temp=(a>b?a:b);
        int max=(temp>c?temp:c);
        System.out.println("max:"+max);


    }
}
