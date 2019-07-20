
import java.util.Scanner;
public class Test19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个整数并且在一到九之间");
        int shi = 0;
        if(sc.hasNextInt()){
            shi=sc.nextInt();
        }else {
            System.out.println("");
            //return;
        }


        printf(shi);


    }
    public static void printf(int a) {
        for(int i=1;i<=a;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }
    }



}
