/*
    数组元素查找（查找指定元素第一次在数组中出现的索引）
 */
public class shuzu12 {
    public static void main(String[] args) {
        int[] arr2 = {11, 22, 33, 44, 55, 66,77};
        int c=a(arr2 ,33);//不是int c=int a(arr2,33)
        System.out.println(c);
    }



    /*
    查找元素索引
    1.返回值类型int
    明确参数列表，int[] arr,int value
     */
    public static int a(int[] arr, int b) {

        for (int i = 0; i <= arr.length - 1; i++) {

            if (b==arr[i])
                return i;


        }

        return -1;
    }

}



