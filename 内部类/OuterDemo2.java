//如果一个内部类是静态的，测试类想要直接访问，创建对象的格式为：        外部类名.内部类名 变量 = new 外部类名.内部类名

//成员内部类常见修饰符  	private  保证数据的安全性
//							static  方便调用
class Outer{
	static class Inner{
		public void show(){
			System.out.println("show");
		}
		
		public static void show2(){
			System.out.println("show2");
		}
		
	}
 	public void method(){
		Inner in = new Inner();
		in.show();
		in.show2();
	} 
 }
 
 
public class OuterDemo2{
	public static void main(String[] args){
		//如何调用show方法
		//Outer o = new Outer();
		//o.method();
		
		//创建对象
		//错误做法
		//Outer.Inner oi = new Outer().new Inner();
		
		//外部类名.内部类名 变量 = new 外部类名.内部类名
		Outer.Inner oi =new Outer.Inner();
		oi.show();
		oi.show2();
		
		//更简单调用show2
		Outer.Inner.show2();
		
	}
}