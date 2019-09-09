public class day_7_9_se {
    public static void main(String[] args) {
         class phone {
             //成员变量
             String brand;//品牌
             int price;//价格
             String color;//颜色


             //成员方法
             //打电话
             public void call(String name) {
                 System.out.println("给" + name + "打电话");
             }

             //发短信
             public void sendMessage() {
                 System.out.println("群发短信");
             }

         }

             phone p=new phone();
                p.brand="苹果";
                p.price=1223;
                p.color="红";
                System.out.println(p.brand);
                System.out.println(p.color);
                System.out.println(p.price);

                p.call("乔布斯");
                p.sendMessage();
         }


    }

