import java.util.Scanner;
public class ScannerLongTest{
	public static void main(String[] args){
		//System.in代表标准输入，就是键盘输入
		Scanner sc = new Scanner(System.in);
		//sc.useDelimiter("\n");
		//判断是否还有下一个long整数
		while(sc.hasNextLong()){
			//输出输入项
			System.out.println("键盘录入的内容是：" + sc.nextLong());
		}
	}
}

//输入的数若不是Long型。则会跳出。