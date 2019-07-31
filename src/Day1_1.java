
public class Day1_1 {
    public static void main(String[] args) {
        int[] array={10,20,30,45,50};
        //打印格式为【10，20，30，40，50】
        System.out.println("[");
        for(int i=0;i<array.length;i++) {
            if (i==array.length-1) {
                System.out.println(array[i]+"]");
            }
            System.out.print(array[i]+",");
        }
    }
}
