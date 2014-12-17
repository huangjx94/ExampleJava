public class Class{
	//类变量
	static String str = getStaticVar();
	//类方法
	private static String  getStaticVar(){
		System.out.println("static方法=类方法");
		return " Static变量";
	}
	//实例变量
	int var ;
	//实例方法
	private int getIntVar(){
		System.out.println("实例方法");
		return 123;
	}
	
	//静态代码块
	//在加载这个类的时候就执行   而且只执行一次
	
	static {
		System.out.println("static代码块中");
	}
	
	// 非静态代码块
	// 每次构建对象都会执行 
	// 可以代替构造方法
	
	{
		System.out.println("非静态代码块");
	}
	
	//构造方法
	public Class(){
		System.out.println("构造方法");
	}
	
	public static void main(String[] args){
		System.out.println("进入main");
		Class cl = new Class();
		System.out.println("退出main");
	
	}
	
}