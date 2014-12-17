/*	
	手机：
		属性：品牌，价格，颜色
		行为：打电话，发短信，上网

		转换为Java中的类
		
	手机类:
		成员变量：品牌，价格，颜色
		成员方法：打电话，发短信，上网
*/

public class Phone{
	//品牌
	String brand;
	//颜色
	String color;
	//价格
	int price;
	
	//打电话的方法
	public void call(String name){
		System.out.println("给"+name+"打电话");
	}
	
	//发短信的方法
	public void sendMessage(){
		System.out.println("群发短信");
	}

	//上网的方法
	public void online(){
		System.out.println("上网");
	}
}