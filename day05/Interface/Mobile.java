public class Mobile implements USB,Wifi{
	private int num;
	private String brand;//品牌 
	
	//构造函数
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
		System.out.println("品牌："+brand);
		System.out.println("编码："+num);
	}
	
	public void call(){
		System.out.println("打电话");
	}
	
	public void sendMessage(){
		System.out.println("发短信");
	}
	
	//实现类义务：实现接口【所有】的抽象方法
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