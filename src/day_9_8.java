public class day_9_8 {
    public static void main(String[] args) {
        //创建字符串对象
        String s1="hello";
        String s2="hello";
        String s3="HELLO";

        //boolean equals(object obj):比较字符串的内容是否相同
        System.out.print(s1.equals(s2));//ture
        System.out.print(s2.equals(s3));//false
        System.out.print("----------");
        //boolean equalsIgnoreCase(String str):比较字符串的内容是否相同，忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));//true
        System.out.println(s1.equalsIgnoreCase(s3));//true

        System.out.println("------------");

    }
}
