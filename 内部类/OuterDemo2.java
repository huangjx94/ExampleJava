//���һ���ڲ����Ǿ�̬�ģ���������Ҫֱ�ӷ��ʣ���������ĸ�ʽΪ��        �ⲿ����.�ڲ����� ���� = new �ⲿ����.�ڲ�����

//��Ա�ڲ��ೣ�����η�  	private  ��֤���ݵİ�ȫ��
//							static  �������
class Outer{
	static class Inner{
		public void show(){
			System.out.println("show");
		}
		
		public static void show2(){
			System.out.println("show2");
		}
		
	}
 	public void method(){
		Inner in = new Inner();
		in.show();
		in.show2();
	} 
 }
 
 
public class OuterDemo2{
	public static void main(String[] args){
		//��ε���show����
		//Outer o = new Outer();
		//o.method();
		
		//��������
		//��������
		//Outer.Inner oi = new Outer().new Inner();
		
		//�ⲿ����.�ڲ����� ���� = new �ⲿ����.�ڲ�����
		Outer.Inner oi =new Outer.Inner();
		oi.show();
		oi.show2();
		
		//���򵥵���show2
		Outer.Inner.show2();
		
	}
}