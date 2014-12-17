class Outer{
	int a = 123;
	private String str = "外部类的变量";
	
	//成员内部类
	//内部类可以直接访问外部类的成员，包括私有
	//内部类不允许定义静态变量
	class Inner{
		//static int a;		//eeror
		String str = "内部类的变量";
		void run(){
			String str = "局部变量";
			System.out.println("内部类run()");
			System.out.println(a);
			System.out.println(str);    		//局部变量
			System.out.println(this.str);		//内部类的变量
			System.out.println(Outer.this.str);	//外部类的变量 
		}
	}
	
	//成员方法
	void run(){
		System.out.println("外部类run()");
		Inner in =new Inner();
		in.run();
	} 	
	
	static void static_run(){
		System.out.println("外部类static_run()");
		Outer.Inner oi = new Outer().new Inner();
		oi.run();
	
	}
}

public class InnerDemo{
	public static void main(String[] args){
		// Outer.Inner oi = new Outer().new Inner();
		// oi.run();
		
		//外部类使用
		Outer o = new Outer();
		o.run();
		o.static_run();
		
/* 		//成员内部类
		// Outer o = new Outer();
		// Outer.Inner oi = o.new Inner();
		// oi.run();
		Outer.Inner oi = new Outer().new Inner();
		//Outer.Inner oi = (new Outer()).new Inner();
		oi.run(); 
*/
	}	
}