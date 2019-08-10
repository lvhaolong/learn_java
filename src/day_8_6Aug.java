import java.util.Random;

/*
获取1-n之间的随机数，包含n
 */
public class day_8_6Aug {
    public static void main(String[] args) {
        int n=50;
        Random r=new Random();
        int number=r.nextInt(n)+1;
        System.out.println("number:"+number);
    }
}
