package gem.javase;

class Person{
	String name;
	int age;
	
	public Person(){}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
		public String toString(){
			return "name:" + name + "\t age:" + age;
			//return "复写了object的toString方法";
	}
	
	//同一类对象 属性?(属性是否相同)
	public boolean equals(Object obj){
		//是否指向同一对象？
		if(this == obj){
			return true;
		}
		//是否是同一对象？
		boolean res = obj instanceof Person;
		if(res){	//同类
			Person b = (Person)obj;
			if(this.name == b.name && this.age == b.age){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
}



public class Test{
	public static void main(String[] args){
		 Test t = new Test();// System.out.println(t.getClass());
		
		//直接打印对象时，会默认调用toString方法
			System.out.println(t);
			System.out.println(t.toString());
		
			Person p = new Person("gem",8);
			Person p1 = new Person("john",20);
			Person p2 = p1;
	
			System.out.println(p.equals(p1));	//false
			//System.out.println("equals:" + p.equals(p1) + "\t ==" + (p == p1));
			System.out.println(p2.equals(p1));	//true
			//System.out.println("equals:" + p2.equals(p1) + "\t ==" + (p2 == p1));
			//System.out.println(p);
			//System.out.println(p.toString);
			
			Inner in = new Inner();
			System.out.println(p.equals(in));
	}
}
class Inner{
}