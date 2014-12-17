abstract class USB{
	public abstract void read();
	public abstract void write();
	
}

/* class USB_KEY extends USB{
	//特有
	
	//义务
	//重写
	} 
*/
interface Wifi{
	void open();
	void close();
}

public class NiMing{
	public static void main(String[] args){
		//匿名内部类==特殊的局部内部类==子类对象
		//usb
		USB udisk = new USB(){
			public void read(){	
				System.out.println("读取U盘");
			}
			public void write(){	
				System.out.println("写U盘");
			}
		};
		udisk.read();
		udisk.write();
		
		//wifi 
		Wifi w = new Wifi(){
			public void open(){	
				System.out.println("打开Wifi");
			}
			public void close(){	
				System.out.println("关闭Wifi");
			}
		} ;
		w.open();
		w.close();
	}
}