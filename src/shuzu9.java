import java.security.PublicKey;

/*
*数组获取最值（获取数组中的最大值最小值）
 */
public class shuzu9 {
    public static void main(String[] args) {
        int[] arr={33,11,22,44,55};
        int max=getmax(arr);
        System.out.println(max);

    }
    /*
    获取数组中最大值
    1.返回值类型int
    2.参数列表int[] arr
     */
    public static int getmax(int[] arr2) {
        int max=arr2[0];
        for (int i=0;i<=arr2.length;i++) {
            if (arr2[i]<max) {
                arr2[i]=max;
            }
        }
        return max;


    }



}
