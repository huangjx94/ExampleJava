import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardIntest{
	public static void main(String[] args)throws Exception{
		//��System.in�ֽ���Ϊ����������һ��BufferedReader����
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(InputStreamReader);
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		//���ж�ȡ��������
		while((line = br.readLine()) != null){
			System.out.println("�û����������ǣ�"+ line);
		}
	}
}


