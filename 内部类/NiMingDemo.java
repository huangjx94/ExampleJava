/*
匿名内部类
		格式：
			new 类名或者接口名(){
			重写类或者接口的方法
			};
			
			理解:本质是继承了类或者实现了接口的子类匿名对象。

*/

abstract class Fu{
	public abstract void show();
}

class Outer{
	public void method(){
/* 		new Fu(){
			public void show(){
				System.out.println("show");
			}
		}; 
*/
		//如何使用show方法
		new Fu(){
			public void show(){
				System.out.println("show");
			}
		};show()
		
	}
}
public class NiMingDemo{
	public static void main(String[] args){
		Outer o = new Outer();
		o.method();
	}
}