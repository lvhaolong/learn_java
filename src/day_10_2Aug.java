public class day_10_2Aug {
    public static void main(String[] args) {
        //创建字符串对象
        String s="aa|bb|cc";
        String[] strArray=s.split("|");//["aa","bb","cc"]
        for (int x=0;x<strArray.length;x++) {
            System.out.println(strArray[x]);//aa bb cc
        }
    }
            }
