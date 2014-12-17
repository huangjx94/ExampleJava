public class Sub extends Base{
	String str;//子类特有的属性

	void sub_show(){
		System.out.println("sub类特有的方法");
	}
	
	void show(){
		System.out.println("子类复写了父类的方法sub class");
	}
	
	public static void main(String[] args){
		//向上转型：默认基类引用 指向 子类对象
		//可以访问基类特有属性，被子类复写的方法，不能访问子类新增的属性
/* 		Base b = new Sub();
		
		System.out.println(b.a);
		b.base_show();
		b.show(); 
*/
 
		
		//向下转型：子类的引用 指向 父类对象 
		Base b = new Sub();			//Base b1 = new Base(); 
		Sub s = (Sub)b;				//if(b1 instanceof Sub){
									//Sub s1 = (Sub) b1 ;  }
		//访问父类的属性
		System.out.println(s.a);
		s.base_show();
		
		//访问子类的属性
		s.sub_show();
		
		//子类复写父类的方法 
		s.show();
		
		//基类的引用不可以访问子类的对象和方法 
		/* base.str = "name";
		base.sub_show(); */
		
		
	}
}


