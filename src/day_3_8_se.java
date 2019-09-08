public class day_3_8_se {
    //数组的越界
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(arr[3]);//错误

        //数组空指针异常
        arr=null;//不会保存内存地址，不允许再操作数组了
        System.out.println(arr[0]);
    }
}
