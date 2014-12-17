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
			//return "��д��object��toString����";
	}
	
	//ͬһ����� ����?(�����Ƿ���ͬ)
	public boolean equals(Object obj){
		//�Ƿ�ָ��ͬһ����
		if(this == obj){
			return true;
		}
		//�Ƿ���ͬһ����
		boolean res = obj instanceof Person;
		if(res){	//ͬ��
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
		
		//ֱ�Ӵ�ӡ����ʱ����Ĭ�ϵ���toString����
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