public class 数组2 {
    public static void main(String[] args) {
        //数据类型[] 数组名 = new 数据类型[数组长度];
        int[] abc = new int[5]; //动态初始化，在内存中开辟5个
//整数类型：bybe,short.int,long默认初化值都是0;
        //浮点类型：float,double默认初始化值都是0.0
        // 字符类型：char默认初始化值‘\u0000'
        //\u0000,每一个0其实代表的是的16进制的0，
        // 那么四个0就是代表处6个二进制位

        System.out.println(abc[0]); //系统给出默认初始值，整数的初始值都是0；
        abc[0]=10;
        System.out.println(abc[0]);
        //[代表一维数组
        //I代表数据类型
        //@是固定的
        //1b6d3586代表以十六进制存储的地址

        System.out.println(abc);//[I@1b6d3586


    }

}
