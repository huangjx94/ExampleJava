class Outer{
	int a = 145;
	private String str = "geminno";
	
	void run(){
		String local_var = "�ֲ�����";
		final int num =1145;
		
		//�ֲ��ڲ���
		//public class Inner{	//error
		//static class Inner{	//error
		//�����÷������η�����
		class Inner{
			String str = "inner class";
			int a = 666;
			//static String var = "static war"; //���ܶ��徲̬����
			final static String var = "static war";	
			
			void inner_run(){
			//System.out.println("�ڲ����Ա����"+ local_var);//���ܷ��ʾֲ�local_war
			System.out.println("�ڲ��ࣺ��Ա����"+num);
			System.out.println(a + "\t" + str);
			System.out.println(a + "\t" + Outer.this.str);
			
			Inner in = new Inner();
			in.inner_run();
			}
		}
	}
}


public class LocalInner{
	public static void main(String[] args){
		Outer o = new Outer();
		o.run();
	}
}