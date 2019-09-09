public class day_1_9_se {
    public static void main(String[] args) {
        //数组的反转
        int[] arr={1,2,3,4,5};
        /*
        循环中定义变量min=0最小索引
        max=arr.length-1最大索引
        min++,max--
         */

        for (int min=0, max=arr.length-1;max>=min;max--,min++) {
            int t=arr[min];
            arr[min]=arr[max];
            arr[max]=t;
        }
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
  }

}
