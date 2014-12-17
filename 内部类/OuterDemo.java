/* class Body{
		class Heart{
			public void operator(){
				System.out.println("心脏搭桥");
			}	
		}
		public void method(){
			Heart h = new Heart();
			if(你是胸外科医生){
				h.operator();
			}else{
			System.out.println("你走");
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