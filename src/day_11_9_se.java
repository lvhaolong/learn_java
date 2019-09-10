import java.util.Scanner;
//键盘输入三个数据并获取最大值，
public class day_11_9_se {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a=sc.nextInt();
        System.out.println("请输入第二个数：");
        int b=sc.nextInt();
        System.out.println("请输入第三个数：");
        int c=sc.nextInt();
        if (a>b) {
            if (a>c) {
                System.out.println(a);
            } else {

                System.out.println(c);
            }
            if (a<b)
            System.out.println(b);
        }


        }
    }

