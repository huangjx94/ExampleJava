public class Sub extends Base{
	String str;//�������е�����

	void sub_show(){
		System.out.println("sub�����еķ���");
	}
	
	void show(){
		System.out.println("���ิд�˸���ķ���sub class");
	}
	
	public static void main(String[] args){
		//����ת�ͣ�Ĭ�ϻ������� ָ�� �������
		//���Է��ʻ����������ԣ������ิд�ķ��������ܷ�����������������
/* 		Base b = new Sub();
		
		System.out.println(b.a);
		b.base_show();
		b.show(); 
*/
 
		
		//����ת�ͣ���������� ָ�� ������� 
		Base b = new Sub();			//Base b1 = new Base(); 
		Sub s = (Sub)b;				//if(b1 instanceof Sub){
									//Sub s1 = (Sub) b1 ;  }
		//���ʸ��������
		System.out.println(s.a);
		s.base_show();
		
		//�������������
		s.sub_show();
		
		//���ิд����ķ��� 
		s.show();
		
		//��������ò����Է�������Ķ���ͷ��� 
		/* base.str = "name";
		base.sub_show(); */
		
		
	}
}


