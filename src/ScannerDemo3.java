/*输入多个数字，并求其总和与平均数，每输入一个数字用回车确认，
通过输入非数字来结束输入并输出执行结果。
 */
import java.util.Scanner;
public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double sum=0;
        int m=0;
        while (scan.hasNextLine()) { //判断是不还有输入的数据

            double 了x=scan.nextDouble(); //x是一个双精度的数据【7777777777
            m=m+1;
            sum=sum+1;
        }
        System.out.println(m+"个数的和为"+sum);
        System.out.println(m+"个数的平均值是："+(sum/m));
        scan.close();
    }

}
