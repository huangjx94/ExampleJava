/*
	�Ӽ���¼���������ݣ�����������������͡�
	
	���裺
		1������
		2����������
		3�����ܼ���¼������
		4���Խ��յ������������
		5��������		
*/
import java.util.Scanner;//��Scanner�ർ���� 

public class CeShi2{
	public static void main(String[] args){
		//��װ����¼������
		Scanner sc =new Scanner(System.in);
		 
		 System.out.println("�������һ�����ݣ�");
		int firstNumber = sc.nextInt();
		
		System.out.println("������ڶ������ݣ�");
		int secondNumber = sc.nextInt();
		
		boolean flag = (firstNumber == secondNumber ); //?true:false;
		System.out.println(flag);
		
		//�Խ��յı������
		int sum = firstNumber + secondNumber;
		System.out.println("�������������ݵĺͣ�"+sum);
		
		/* System.out.println("�������һ������:");
		int a= sc.nextInt();//sc����nextInt�������Ӽ���¼�����ݣ�Ȼ��ѽ����ֵ��ǰ��ı��� 
		System.out.println("������ڶ�������:");
		int b = sc.nextInt();		
		System.out.println("���������������:");
		int c = sc.nextInt();
		
		int temp = (a>b)?a:b;
		int max = (temp>c)?temp:c;
		System.out.println("��������ֵ�ǣ�"+max); */
		 
	}
}