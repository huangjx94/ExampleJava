/*
	�ֲ��ڲ���
	
	Ϊʲô�ڲ�����ʾֲ����������뱻final���Σ�
		1����ֹ��ʹ�ú����ݷ����ı䡣
		2����final��Ϊ���ӳ��������������ڡ�
*/

class Outer{
	public void method(){
	final int num = 100;
	
		class Inner{
			public void show(){
			System.out.println("show"+ num);
			}
		}
		Inner i = new Inner();
		i.show();
	}
}

public class OuterDemo3{
	public static void main(String[] args){
		Outer o = new Outer();
		o.method();
	}
}