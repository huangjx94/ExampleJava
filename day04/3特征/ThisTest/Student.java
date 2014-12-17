public class Student{
	String name;
	//构造方法
	public Student(String name){
		this.name = name;
	}
	
	//成员方法
	Student get(){
		return this;
	}
	
	public static void main(String[] args){
		Student s1 = new Student("geminno");
		Student s2 = new Student("gemptc");
		
		System.out.println(s1);//返回该对象当前的字符串地址
		System.out.println(s1.get().name);
		
		System.out.println(s2);
		System.out.println(s2.get().name);
	}
}