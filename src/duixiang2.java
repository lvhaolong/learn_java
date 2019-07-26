public class duixiang2 {
    public static void main(String[] args) {
        //创建对象
        phone p=new phone();
        //调用对象的属性并赋值
        p.brand="锤子";
        p.price=998;
        System.out.println(p.brand+"..."+p.price);
        //调用成员方法
        p.call();
        p.playGame();
        p.sondMessage();
    }
}
/*
模仿学生类，让学生自己完成
    *属性：品牌（brand)价格（price）
    *行为：打电话（call),发信息（sendMossage)玩游戏（playGame)
 */
class phone {
    String brand;
    int price;

    public void call() {
        System.out.println("打电话");
    }

    public void sondMessage() {
        System.out.println("发信息");


    }
    public void playGame() {
        System.out.println("玩游戏");
    }


}


