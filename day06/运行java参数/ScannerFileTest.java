import java.util.Scanner;
import java.io.File;
public class ScannerFileTest{
	public static void main(String[] args)throws Exception{
		//��һ��File������ΪScanner�Ĺ�����������Scanner��ȡ�ļ�����
		
		// File file = new File("ScannerFileTest.java");	
		// Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(new File("ScannerFileTest.java"));		
		System.out.println("ScannerFileTest.java�ļ��������£�");
		//�ж��Ƿ�����һ��
		while(sc.hasNextLine()){
			//����ļ�����һ��
			System.out.println(sc.nextLine());
		}
	}
}

//����Scanner����ʱ����һ��File������Ϊ�����������ó��򽫻��ȡScannerFileTest.java�ļ��е�����

//�漰�ļ����룬���ܷ����ļ�IO����쳣������������ throws Exception����main�����������κ��쳣��

// Scanner sc = new Scanner(System.in);
// File fl = new File("ScannerFileTest.java");	