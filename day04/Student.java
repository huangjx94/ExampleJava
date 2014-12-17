/*
   学生：
       属性：姓名，年龄,...
	   行为：学习，吃饭，...
	   
	转换为Java中的类
	
	学生类：
	成员变量：姓名，年龄
	成员方法：学习，吃饭
	
	类：class定义即可
	
	成员变量：
			定义在类中，方法外的变量
			
	成员方法：
			说过的函数，去掉static即可.
			
*/
public class Student{
	//姓名
	String name;
	//年龄
	int age;
	
	//学习的方法
	public void study(){
		System.out.println("好好学习");
	}
	
	//吃饭的方法
	public void eat(String type){
		System.out.println("吃"+type );
	}
}