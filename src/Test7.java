public class Test7 {
    public static void main(String[] args) {
        /*
        我想在控制台输出2次：“Jave基础班“
        我想在控制台输出7次：”Jave基础班“
        我想在控制台输出13次：“Jave基础班“
        */
        for (int x=1;x<=10;x++) {
            if (x%3==0) {
              //  break;//2
                continue;//7
                //System.out.println("Jave基础班");
            }
            System.out.println("Jave基础班");

        }
    }
}
