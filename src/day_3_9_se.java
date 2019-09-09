public class day_3_9_se {
    public static void main(String[] args) {

        //调用方法，接收数组的返回值
             //接收到的是数组的内存地址
        int[] brr = getArray();
        for (int i = 0; i <= brr.length; i++) {
            System.out.println(brr[i]);
        }
    }
    /*
    创建方法，返回值是数组类型
    return返回数组的地址
     */
    public static int[] getArray() {
        int[] arr={1,3,5,7,9};
        //返回数组的地址，返回到调用者
        return arr;
    }
}
