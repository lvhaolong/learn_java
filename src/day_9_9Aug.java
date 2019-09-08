public class day_9_9Aug {
    public static void main(String[] args) {
        //创建字符串对象
        String s="helloworld";

        //int length();获取字符串的长度，其实也就是字符个数
        System.out.println(s.length());
        System.out.println("-------");

        //String concat (String str):将将指定的字符串连接到该字符串的末尾；
        String s1="helloworld";
        String s2=s.concat("**hello itheima");
        System.out.println(s2);

        //char charAt(int index):获取指定索引处的字符
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println("-------------");

        //int indexof(String str):获取str在字符串对象中第一次出现的索引，没有返回-1
        System.out.println(s.indexOf("1"));
        System.out.println(s.indexOf("owo"));
        System.out.println(s.indexOf("ak"));
        System.out.println("-----------");

        //String substring(int start):从start开始截取字符串结尾
        System.out.println(s.substring(0));
        System.out.println(s.substring(5));
        System.out.println("-------");

        //String substring(int start,int end):从start到end截取字符串，含start，不含end。
        System.out.println((s.substring(0,s.length())));
        System.out.println(s.substring(3,8));

    }
}
