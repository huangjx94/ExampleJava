public class Test2{
	public static void main(String[] args){
		Mobile T2 = new Mobile(1456,"����2.0");
		
		T2.info();
		
		T2.call();
		T2.sendMessage();
		
		//Wifi
		T2.open();
		T2.close();
		//�ӿ��� ֱ�ӷ��� ���� 
		System.out.println("wifi:" + Wifi.ssid + "����:"+ Wifi.pass);
		//System.out.println("Wifi:" + T2.ssid + "����:"+ T2.pass);
		
		//USB
		T2.read();
		T2.write();
		System.out.println("USB��׼:" +USB.version);
		//System.out.println("USB��׼:" + T2.version);
	}
}