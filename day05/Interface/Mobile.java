public class Mobile implements USB,Wifi{
	private int num;
	private String brand;//Ʒ�� 
	
	//���캯��
	public Mobile(){}
	
	public Mobile(int num,String brand){
		this.num = num;
		this.brand = brand;
	}
	public void setNum(int num){
		this.num = num;
	}
	
	public int getNum(){
		return num;
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	public String getBrand(){
		return brand;
	}
	
	//info()
	public void info(){
		System.out.println("Ʒ�ƣ�"+brand);
		System.out.println("���룺"+num);
	}
	
	public void call(){
		System.out.println("��绰");
	}
	
	public void sendMessage(){
		System.out.println("������");
	}
	
	//ʵ��������ʵ�ֽӿڡ����С��ĳ��󷽷�
	//USB
	public void read(){
		System.out.println("Read USB");
	} 
	
	public void write(){
		System.out.println("Write USB");
	} 
	
	//Wifi
	public void open(){
		System.out.println("Open Wifi");
	} 
	
	public void close(){
		System.out.println("Close Wifi");
	} 
}