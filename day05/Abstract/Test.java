public class Test{
	public static void main(String[] args){
/* 		Shape s= new Circle("��ɫ",5.0);
		System.out.println(s.getType());
		System.out.println(s.calPerimeter());
		
		Shape s2 = new Triangle("��ɫ",3.0,4.0,5.0);
		System.out.println(s2.getType());
		System.out.println(s2.calPerimeter()); 
*/
		
		Shape s1 = new Circle();
		Circle c = (Circle)s1;
		
		/* c.setRadius(6.0); */
		s1.setColor("��ɫ");
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		
	}
}