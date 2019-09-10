//导包
import java.util.Random;
public class day_13_9_se {
    public static void main(String[] args) {
        //用Random产生随机数
        //2.创建键盘录入数据的对象
        Random r=new Random();
       for (int i=0;i<3;i++) {
           //3.随机生成一个数据
           int number=r.nextInt(10);
           //4.输出数据
           System.out.println("number:"+number);

       }
    }
}
