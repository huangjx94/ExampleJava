//成员变量初始化工作？  ====构造函数
public class CatTest{
	public static void main(String[] args){
		//类变量:1.不依赖于对象，类的所有实例共享 2.优先于对象存在 
		//       3.没有生成任何实例就能访问4.直接使用类名来访问:类.字段
		System.out.println("Cat.type=" + Cat.type);
		Cat.type = "波斯猫"; 
		System.out.println("Cat.type=" + Cat.type);
		
		//类方法
		Cat.bark1();
	
		/* Cat.age = 123;
		Cat.bark(); */
		
	
		Cat c = new Cat(10,"yellow");
		Cat c1 = new Cat(13,"black");
		
		//使用对象引用访问 类方法
		c.bark1();   //this===c
		c1.bark1();	//this===c1
/*		
		 //类变量	
		System.out.println("c.type=" + Cat.type);
		System.out.println("Cat.type=" + Cat.type);
		System.out.println("c1.type=" + Cat.type);
		
		//实例变量:依赖于对象
		System.out.println("c.age=" + c.age);
		System.out.println("c1.age=" +c1.age);
		
		
*/
		
		
	}
}