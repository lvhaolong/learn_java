import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/*
数值添加到集合
生成6个1-33之间的随机整数，添加到集合，并遍历
 */
public class day_2_10_se {
    public static void main(String[] args) {


        Random sc = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        //添加随机数到集合
        for (int i=0;i<6;i++) {
            int r=sc.nextInt(33)+1;
            list.add(r);

            for ( i=0;i<list.size();i++) {
                System.out.println(list.get(i));
            }

        }

    }
}
