/*
	猫类：
		成员变量：年龄，颜色，品种
		成员方法：叫

*/

//Cat  某中品种的猫 

public class Cat{
	//属性
	
	//品种
	static String type; //类变量：  不依赖于对象       类名.类变量
    //年龄	
	int age;            //实例变量：依赖于对象 对象引用.实例变量  
	//颜色
	String color;                   
	
	//静态代码块
	static{//使命：初始化 类变量
		type = "sssssss";
		//age = 123;      //不能实例变量
		//color = "sds";  //不能实例变量
		System.out.println("我是在static代码块中");
	}
	
	//方法
	Cat(){
	  
	}
	
	Cat(int age,String color){
		this.type = "heimao";  	
		this.age = age;
		this.color = color;
	}
	
	//实例方法:可以访问类变量  this代表调用者的引用
	void bark(){
		this.type = "baimao";
		System.out.println("barking");
	}
	
	//类方法：不能访问实例变量-----不依赖对象，
	static void bark1(){  
		//没有对象，多以不能访问实例变量、实例方法
		//只能访问类变量、局部变量
		//type = "laomao";
		//static和abstract不能同时存在
		System.out.println("类方法");
	}
	
}