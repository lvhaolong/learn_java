/*
*数组查表法（根据键盘录入索引，查找对应星期）
 */
import java.util.Scanner;
public class shuzu11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        System.out.println("星期"+a(week));


    }

    /*
    根据索引返回对应的星期
    1.返回值类型char
    2.参数列表int week
     */
    public static int a(int week) { //int替换成char是错误的
        int[] arr = {' ', '一', '二', '三', '四', '五', '六', '日'};

        return arr[week];
    }



}


