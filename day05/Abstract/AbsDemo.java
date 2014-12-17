/*
如果一个方法没有方法体，那么，该方法必须定义为抽象方法。
	关健字：abstract。

	抽象类的特点：
		A:类或者方法都必须用abstract修饰。
		B:具体类的在继承抽象类的时候    要么：本身也是抽象类。
										要么：重写抽象类中的所有抽象方法。
		C:抽象类不能实例化.	要想使用，必须按照多态的方式。
		D:成员特点
			a:成员变量				可以是变量，也可以是常量。
			b:构造方法				有构造方法，但是不能实例化。
			  构造方法有什么用呢?	用于子类访问父类数据的初始化。
			c:成员方法：			可以有抽象方法，也可以有非抽象方法。

	抽象类的好处：
		A:强制要求子类必须实现某些功能。(抽象方法)
		B:提高代码复用性。(非抽象方法)

*/
public abstract class AbsDemo{
	
	public abstract void run();
	
/* 	//abstract不能和static共存 
	//public abstract static void main(String[] args){
		//抽象类：不能直接实例化对象
		//AbsDemo abs = new AbsDemo();
		
	}
*/

}