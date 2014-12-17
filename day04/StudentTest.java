//测试Student的成员变量和成员方法
public class StudentTest{
	public static void main(String[] args){
		//类名 变量名 = new 类名();
		Student s = new Student();//创建一个学生对象
		
		//使用成员变量
		//System.out.println("s.name");//null
		//System.out.println("s.age");//0
		  System.out.println(s.name +"-----"+ s.age);
			
		//给成员变量赋值
		s.name = "yonh";
		
		s.age = 20;
		System.out.println(s.name +"-----"+ s.age);
		
		//调用方法
		s.study();
		s.eat("蛋炒饭");
	}
}