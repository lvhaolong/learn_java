/*
猜数字小游戏
游戏开始时，会随机生成一个1-100之间的整数number.玩家猜测一个数字guessNumber,
会与number作比较，系统提示大了或者小了，直到玩家猜中，游戏结束。
 */
import java.util.Random;
import java.util.Scanner;

public class day_16_9_se {
    public static void main(String[] args) {
        Random sc=new Random();
        int number=sc.nextInt(100)+1;

       while (true) {

            Scanner a=new Scanner(System.in);
            int guessNumber=a.nextInt();
            if (guessNumber<number) {
                System.out.println("你输入的数小了");
            } else if (guessNumber>number) {
                System.out.println("你输入的数大了");
            } else {
                System.out.println(guessNumber);
                break;
            }

        }

        
    }
}
