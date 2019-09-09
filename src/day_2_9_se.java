public class day_2_9_se {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        //调用方法，传递数组
        prinArray(arr);

    }


    /*
    创建方法，方法接收数组类型的参数
    进行数组的遍历
     */
    public static void prinArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


