//测试PhoneTest类的成员变量和成员方法
public class PhoneTest{
	public static void main(String[] args){
		//实例化
		Phone p = new Phone();//创建一个Phone对象
		System.out.println(p.brand+"-----"+p.color+"------"+p.price);
		
		//给成员变量赋值
		p.brand = "xiaomi";
		p.color = "black";
		p.price = 1850;
		System.out.println(p.brand+"-----"+p.color+"------"+p.price);
		
		
		//调用方法
		p.call("kangkang");
		p.sendMessage();
		p.online();
	}
}