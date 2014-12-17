/*
	从键盘录入两个数据，并对这两个数据求和。
	
	步骤：
		1、导包
		2、创建对象
		3、接受键盘录入数据
		4、对接收的两个变量求和
		5、输出结果		
*/
import java.util.Scanner;//把Scanner类导过来 

public class CeShi2{
	public static void main(String[] args){
		//封装键盘录入数据
		Scanner sc =new Scanner(System.in);
		 
		 System.out.println("请输入第一个数据：");
		int firstNumber = sc.nextInt();
		
		System.out.println("请输入第二个数据：");
		int secondNumber = sc.nextInt();
		
		boolean flag = (firstNumber == secondNumber ); //?true:false;
		System.out.println(flag);
		
		//对接收的变量求和
		int sum = firstNumber + secondNumber;
		System.out.println("请输入两个数据的和："+sum);
		
		/* System.out.println("请输入第一个数据:");
		int a= sc.nextInt();//sc调用nextInt方法。从键盘录入数据，然后把结果赋值给前面的变量 
		System.out.println("请输入第二个数据:");
		int b = sc.nextInt();		
		System.out.println("请输入第三个数据:");
		int c = sc.nextInt();
		
		int temp = (a>b)?a:b;
		int max = (temp>c)?temp:c;
		System.out.println("输出的最大值是："+max); */
		 
	}
}