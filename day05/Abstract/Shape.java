//抽象类【只能被继承】----->子类：实现所有抽象方法---- >对象
//不完整类					完整类

public abstract class Shape{
	//抽象类的组成
	{
	System.out.println("执行Shape的初始化块...");
	}
	//图形的颜色
	private String color;
	
	//定义一个计算周长的抽象方法:没有{}
	public abstract double calPerimeter();
	//定义一个返回形状的抽象方法
	public abstract String getType();
	//定义Shape构造器，不适用于创建Shape对象；用于被子类调用
	public Shape(){}
	public Shape(String color){
		System.out.println("执行Shape的构造器...");
		this.color = color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	
} 