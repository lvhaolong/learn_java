import java.util.ArrayList;

/*
定义以指定格式打印集合的方法（ArrayList类型作为参数），
使用@分隔每个元素。格式参照｛元素@元素@元素@元素｝。
 */
public class day_9_5Aug {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String>list=new ArrayList<>();
        //添加字符串到集合中
        list.add("张三丰");
        list.add("宋远");
        list.add("宁日");
        list.add("张三");
        list.add("吕清柔");

        //调用方法
        printArrList(list);

    }
    public static void printArrList(ArrayList<String>list) {
        //拼接左括号
        System.out.print("{");
        //遍历集合
        for (int i=0;i<list.size();i++) {
            //获取元素
            String j=list.get(i);
            //拼接@符号
            if (i!=list.size()-1) {
                System.out.print(j+"@");
            } else {
                System.out.print(j+"}");
            }
        }
    }
}
