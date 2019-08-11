import java.util.ArrayList;
import java.util.Random;

public class day_9_4Aug {
    public static void main(String[] args) {
        //创建Random对象
        Random random=new Random();
        //创建ArrayList对象
        ArrayList<Integer> list = new ArrayList<>();
        //添加随机数以集合
        for (int i=0;i<6;i++) {
            int r=random.nextInt(33)+1;
            list.add(r);
        }
        //遍历集合输出
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }

}
