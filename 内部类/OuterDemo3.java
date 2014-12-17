/*
	局部内部类
	
	为什么内部类访问局部变量，必须被final修饰？
		1、防止在使用后数据发生改变。
		2、加final是为了延长变量的生命周期。
*/

class Outer{
	public void method(){
	final int num = 100;
	
		class Inner{
			public void show(){
			System.out.println("show"+ num);
			}
		}
		Inner i = new Inner();
		i.show();
	}
}

public class OuterDemo3{
	public static void main(String[] args){
		Outer o = new Outer();
		o.method();
	}
}