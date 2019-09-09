public class day_5_8_se {
    public static void main(String[] args) {
       //数组获取最大值元素
        int[] arr=new int[]{1,4,2,8,6};
        int a=arr[0];
        for (int i=1;i<arr.length;i++) {
            if(a<arr[i]) {
                a=arr[i];
            }


        }
        System.out.println(a);
    }
}
