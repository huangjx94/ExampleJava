//�����ࡾֻ�ܱ��̳С�----->���ࣺʵ�����г��󷽷�---- >����
//��������					������

public abstract class Shape{
	//����������
	{
	System.out.println("ִ��Shape�ĳ�ʼ����...");
	}
	//ͼ�ε���ɫ
	private String color;
	
	//����һ�������ܳ��ĳ��󷽷�:û��{}
	public abstract double calPerimeter();
	//����һ��������״�ĳ��󷽷�
	public abstract String getType();
	//����Shape���������������ڴ���Shape�������ڱ��������
	public Shape(){}
	public Shape(String color){
		System.out.println("ִ��Shape�Ĺ�����...");
		this.color = color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	
} 