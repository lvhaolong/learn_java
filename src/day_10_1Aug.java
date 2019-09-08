public class day_10_1Aug {
    public static void main(String[] args) {
        //创建字符串对象
        String s="abcde";
        //char[] tocharArray():把字符串转换为字符数组
        char[] chs=s.toCharArray();
        for(int x=0;x<chs.length;x++) {
            System.out.println(chs[x]);
        }
        System.out.println("-------");

        //byte[] getBytes ():把字符串转换为字节数组
        byte[] bytes=s.getBytes();
        for(int x=0;x<bytes.length;x++) {
            System.out.println(bytes[x]);
        }
        System.out.println("---------");
        //替换字母it为大写IT
        String str="itcast itheima";
        String replace=str.replace("it","IT");
        System.out.println(replace);//ITcast ITheima
        System.out.println("----------");

    }
}
