abstract class USB{
	public abstract void read();
	public abstract void write();
	
}

/* class USB_KEY extends USB{
	//����
	
	//����
	//��д
	} 
*/
interface Wifi{
	void open();
	void close();
}

public class NiMing{
	public static void main(String[] args){
		//�����ڲ���==����ľֲ��ڲ���==�������
		//usb
		USB udisk = new USB(){
			public void read(){	
				System.out.println("��ȡU��");
			}
			public void write(){	
				System.out.println("дU��");
			}
		};
		udisk.read();
		udisk.write();
		
		//wifi 
		Wifi w = new Wifi(){
			public void open(){	
				System.out.println("��Wifi");
			}
			public void close(){	
				System.out.println("�ر�Wifi");
			}
		} ;
		w.open();
		w.close();
	}
}