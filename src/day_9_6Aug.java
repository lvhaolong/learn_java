import java.util.ArrayList;
import java.util.Random;

/*
定义获取所有偶数元素集合的方法（ArrayList类型作为返回值）
 */
public class day_9_6Aug {
    public static void main(String[] args) {
        //创建Ramdom对象
        Random random = new Random();
        //创建ArrayList对象
        ArrayList<Integer> list = new ArrayList<>();

        //添加随机数到集合
        for (int i = 0; i < 20; i++) {
            int r = random.nextInt(1000) + 1;
            list.add(r);
        }
        //调用偶数集合的方法
        ArrayList<Integer> arrayList = getArrayList(list);
        System.out.print(arrayList);
    }
    public static ArrayList<Integer>getArrayList(ArrayList<Integer> list) {
        //创建小集合，来保存偶数
        ArrayList<Integer>smllList=new ArrayList<>();
        //遍历list
        for (int i=0;i<list.size();i++) {
            //获取元素
            Integer num=list.get(i);
            //判断为偶数，添加到小集合中
            if (num%2==0) {
                smllList.add(num);
            }
        }
        //返回小集合
        return smllList;


    }
}
