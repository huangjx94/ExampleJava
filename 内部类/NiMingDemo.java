/*
�����ڲ���
		��ʽ��
			new �������߽ӿ���(){
			��д����߽ӿڵķ���
			};
			
			���:�����Ǽ̳��������ʵ���˽ӿڵ�������������

*/

abstract class Fu{
	public abstract void show();
}

class Outer{
	public void method(){
/* 		new Fu(){
			public void show(){
				System.out.println("show");
			}
		}; 
*/
		//���ʹ��show����
		new Fu(){
			public void show(){
				System.out.println("show");
			}
		};show()
		
	}
}
public class NiMingDemo{
	public static void main(String[] args){
		Outer o = new Outer();
		o.method();
	}
}