/* class Body{
		class Heart{
			public void operator(){
				System.out.println("�������");
			}	
		}
		public void method(){
			Heart h = new Heart();
			if(���������ҽ��){
				h.operator();
			}else{
			System.out.println("����");
			}
		}
}
			Body.Heart bh = new Body().new Heart();
			bh.operator
			Body b = new Body();
			b.method();
 */
 
 class Outer{
	private class Inner{
		public void show(){
			System.out.println("show");
		}
	}
	public void method(){
		Inner in = new Inner();
		in.show();
	}
 }
 
 
public class OuterDemo{
	public static void main(String[] args){
		// Outer.Inner oi = new Outer().new Inner();
		// oi.show();
		Outer o = new Outer();
		o.method();
	}
}