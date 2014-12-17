/*	
	狗：
		属性：颜色，年龄，名字
		行为：跑，跳

		转换为Java中的类
		
	手机类:
		成员变量：颜色，年龄，名字
		成员方法：跑，跳
*/

public class Dog{
	//颜色
	String color ;
	//年龄
	int age;
	//名字
	String name;
	
	//定义一个jump方法
	public void jump(){
		System.out.println("正在执行jump方法");
	}
	//定义一个run方法，run方法需要借助jump方法
	public void run(){
		//使用this引用调用run()方法
		this.jump();
		System.out.println("正在执行run方法");
	}
	
}