public class class2 {
    public static void main(String[] args) {
        phone1 p1=new phone1();
        p1.setBrand("三星");
        p1.setPrice(5288);
        System.out.println(p1.getBrand()+"..."p1.getPrice());
        p1.call();
        p1.sendmessage();
        p1.playGame();
    }
}

class phone1 {
    private String brand;
    private int price;

    public void setBrand(String brand) {
        this.brand=brand;
    }

    public String getBrand() {//获取品牌
        return brand;          //this可以省略，你不加系统会默认给你加
    }

    public void setPrice(int price) {//设置价格
        this.price=price;
    }

    public int getPrice() {           //获取价格
        return price;
    }
    public void sendmessage() {
        System.out.println("发信息");
    }
    public void call() {
        System.out.println("打电话");
    }
    public void playGame() {
        System.out.println("打游戏");
    }
}