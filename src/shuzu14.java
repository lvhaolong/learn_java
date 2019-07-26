/*
需求：公司年销售额求和
第一季度：22，66，44
第二季度：77，33，88
第三季度：25，45，65
第四季度: 11，66，99
 */
public class shuzu14 {
    public static void main(String[] args) {
        int[][] arr={{22,66,44},{77,33,44},{25,45,65},{11,66,99}};
        int sum=0;
        for (int i=0;i<arr.length;i++)
            for (int j=0;j<arr[i].length;j++) {
                sum=sum+arr[i][j];
            }
        System.out.println(sum);
    }
}
