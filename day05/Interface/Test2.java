public class Test2{
	public static void main(String[] args){
		Mobile T2 = new Mobile(1456,"锤子2.0");
		
		T2.info();
		
		T2.call();
		T2.sendMessage();
		
		//Wifi
		T2.open();
		T2.close();
		//接口名 直接访问 常量 
		System.out.println("wifi:" + Wifi.ssid + "密码:"+ Wifi.pass);
		//System.out.println("Wifi:" + T2.ssid + "密码:"+ T2.pass);
		
		//USB
		T2.read();
		T2.write();
		System.out.println("USB标准:" +USB.version);
		//System.out.println("USB标准:" + T2.version);
	}
}