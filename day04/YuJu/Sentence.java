import java.util.Scanner;

public class Sentence{
	public static void main(String[] args){
/* 		if����ʽ1��       			if����ʽ2��
		if(�Ƚϱ��ʽ){					if(�Ƚϱ��ʽ){
			�����							�����
		}								}else{
											�����1	
										}
										
		if����ʽ3��					if����ʽ4��
		if(�Ƚϱ��ʽ1){       			if(�Ƚϱ��ʽ1){
			�����1							�����1
		}else if(�Ƚϱ��ʽ2){			}else if(�Ƚϱ��ʽ2){
			�����2							�����2
		}else if(�Ƚϱ��ʽ3){			}else if(�Ƚϱ��ʽ3){
			�����3							�����3
		}								}
		...								...
		else if(�Ƚϱ��ʽn){			else if(�Ƚϱ��ʽn){
			�����n							�����n
		}								}else{
											�����n+1
										}	
										
		ִ�����̣�
			���ȱȽϱ��ʽ1�����䷵��ֵ�ǣ�
				true��ִ�������1
				false���ͼ���ִ�бȽϱ��ʽ2�����䷵��ֵ�ǣ�
					true��ִ�������2
					false���ͼ���ִ�бȽϱ��ʽ3�����䷵��ֵ�ǣ�
						...
				(������бȽϱ��ʽ����������ִ�������n+1)			
*/
		
		//�ж����������Ƿ����
/*  	int a = 10;
		int b = 20;
		if(a==b){
			System.out.println("�������");
		}else{
			System.out.println("���ݲ����");
		}
*/

/*  Scanner sc = new Scanner(System.in);
	System.out.println("������һ��int���͵�ֵ��");
	int x = sc.nextInt();
	 
	int  y;
	 if(x>=3){
		y = 2*x+1;
	 }else if(x<3 && x>=-1){
		y=2*x;
	 }else {
		y=2*x-1;
	 }
		System.out.println("y��ֵ�ǣ�" + y); 	
*/
		
	Scanner sc = new Scanner(System.in);
	System.out.println("�������·ݣ�");
	int month = sc.nextInt();
	
	/* if(month==3||month==4||month==5 ){
		System.out.println("��");
	}else if(month==6||month==7||month==8 ){
		System.out.println("��");
	}else if(month==9||month==10||month==11){
		System.out.println("��");
	}else if(month==1||month==2||month==12){
		System.out.println("��");
	}else{
		System.out.println("�·�¼������")��
	}		 */
	if(month<1 || month>12){
		System.out.println("¼���·�����");
	}else if(month>=3 && month<=5 ){
		System.out.println("��");
	}else if(month>=6 && month<=8 ){
		System.out.println("��");
	}else if(month>=9&&month<=11){
		System.out.println("��");
	}else{
		System.out.println("��");
	}
  }
}