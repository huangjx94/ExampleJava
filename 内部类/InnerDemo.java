class Outer{
	int a = 123;
	private String str = "�ⲿ��ı���";
	
	//��Ա�ڲ���
	//�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա������˽��
	//�ڲ��಻�����徲̬����
	class Inner{
		//static int a;		//eeror
		String str = "�ڲ���ı���";
		void run(){
			String str = "�ֲ�����";
			System.out.println("�ڲ���run()");
			System.out.println(a);
			System.out.println(str);    		//�ֲ�����
			System.out.println(this.str);		//�ڲ���ı���
			System.out.println(Outer.this.str);	//�ⲿ��ı��� 
		}
	}
	
	//��Ա����
	void run(){
		System.out.println("�ⲿ��run()");
		Inner in =new Inner();
		in.run();
	} 	
	
	static void static_run(){
		System.out.println("�ⲿ��static_run()");
		Outer.Inner oi = new Outer().new Inner();
		oi.run();
	
	}
}

public class InnerDemo{
	public static void main(String[] args){
		// Outer.Inner oi = new Outer().new Inner();
		// oi.run();
		
		//�ⲿ��ʹ��
		Outer o = new Outer();
		o.run();
		o.static_run();
		
/* 		//��Ա�ڲ���
		// Outer o = new Outer();
		// Outer.Inner oi = o.new Inner();
		// oi.run();
		Outer.Inner oi = new Outer().new Inner();
		//Outer.Inner oi = (new Outer()).new Inner();
		oi.run(); 
*/
	}	
}