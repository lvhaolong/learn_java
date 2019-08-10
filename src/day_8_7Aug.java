import java.util.Random;
import java.util.Scanner;

public class day_8_7Aug {
    public static void main(String[] args) {
        Random r=new Random();
        int number=r.nextInt(100)+1;
        while (true) {
            //键盘录入我们要猜的数据
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入你要猜的数字（1-100）：");
            int guessNumber=sc.nextInt();

            //比较这两个数据（if语句）
            if (guessNumber>number) {
                System.out.println("你猜的数据"+guessNumber+"大了");
                } else if (guessNumber<number) {
                System.out.println("你猜的数据"+guessNumber+"小了");

            } else {
                System.out.println("恭喜你，猜中了");
                break;

            }

        }
    }
}
