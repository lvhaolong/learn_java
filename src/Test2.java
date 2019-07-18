public class Test2 {
    public static void main(String[]args) {
        int count=0;
        int i=100;
        while(i<=999) {
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/100;
            if(i==ge*ge*ge+shi*shi*shi+bai*bai*bai) {
                count++;
                System.out.println(i);


            }

            i++;
        }
        System.out.println(count);
    }

}
