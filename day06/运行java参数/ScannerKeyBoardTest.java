import java.util.Scanner;
public class ScannerKeyBoardTest{
	public static void main(String[] args){
		//System.in�����׼���룬���Ǽ�������
		Scanner sc = new Scanner(System.in);
		//sc.useDelimiter("\n");
		//�ж��Ƿ�����һ��������
		while(sc.hasNext()){
			//���������
			System.out.println("����¼��������ǣ�" + sc.next());
		}
	}
}