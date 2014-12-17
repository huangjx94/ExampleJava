class Outer{
	int a = 145;
	private String str = "geminno";
	
	void run(){
		String local_var = "局部变量";
		final int num =1145;
		
		//局部内部类
		//public class Inner{	//error
		//static class Inner{	//error
		//不能用访问修饰符修饰
		class Inner{
			String str = "inner class";
			int a = 666;
			//static String var = "static war"; //不能定义静态变量
			final static String var = "static war";	
			
			void inner_run(){
			//System.out.println("内部类成员方法"+ local_var);//不能访问局部local_war
			System.out.println("内部类：成员方法"+num);
			System.out.println(a + "\t" + str);
			System.out.println(a + "\t" + Outer.this.str);
			
			Inner in = new Inner();
			in.inner_run();
			}
		}
	}
}


public class LocalInner{
	public static void main(String[] args){
		Outer o = new Outer();
		o.run();
	}
}