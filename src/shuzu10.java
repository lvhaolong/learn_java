/*
    *数组元素反转（就是把元素对调）
 */
public class shuzu10 {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55,66};
        a(arr);
    }

    public static void a(int[] arr) {
         for (int i=0;i<arr.length/2;i++) {
             int t=arr[i];
             arr[i]=arr[arr.length-1-i];
             arr[arr.length-1-i]=t;
         }
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

    }

}

