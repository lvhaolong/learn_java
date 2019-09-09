
public class day_4_9_se {
    public static void main(String[] args) {
        //代码分析
        int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        change(a, b);
        System.out.println(a);
        System.out.println(b);
    }
    public static void change(int a,int b) {
        a=a+b;
        b=b+a;
    }


}
/*
分析方法中没有返回值，ab只是在一个局布变量中
 */
/*
自己做的
1
2
3
5
*/

/*
运行
1
2
1
2
 */

