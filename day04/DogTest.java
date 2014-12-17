//测试Dog的成员变量和成员方法
public class DogTest{
	public static void main(String[] args){
	
		//实例化
		Dog d = new Dog();
		
		//给成员变量赋值
		d.color = "yellow";
		d.age = 8; 
		d.name = "xiaohei";
		System.out.println(d.color +"------"+ d.age +"------"+ d.name);
		
		//使用方法
		d.jump();
		d.run();
	}
}