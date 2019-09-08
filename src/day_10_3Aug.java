//定义一个方法，把数组｛1，2，3｝按照指定个格式拼接成一个字符串。
//格式参照如下：[world1#world2#world3]
public class day_10_3Aug {
    public static void main(String[] args) {
        //定义一个int类型数组
        int[] arr={1,2,3};

        //调用方法
        String s=arrayToString(arr);
        //输出结果
        System.out.println("s:"+s);
    }
    /*
    *写方法实现把数组中的元素按照指定的格式拼接成一个字符串
    * 两个明确：
    * 返回值类型：String
    * 参数列表：int[] arr
     */
    public static String arrayToString(int[] arr) {
        //创建字符串s
        String s=new String("[");
        //遍历数组，并拼接字符串
        for (int x=0;x<arr.length;x++) {
            if (x==arr.length-1) {
                s=s.concat(arr[x]+"]");
            } else {
                s=s.concat(arr[x]+"#");
            }
        }
        return s;
    }
}
