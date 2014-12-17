import java.util.Scanner;
import java.io.File;
public class ScannerFileTest{
	public static void main(String[] args)throws Exception{
		//将一个File对象作为Scanner的构造器函数，Scanner读取文件内容
		
		// File file = new File("ScannerFileTest.java");	
		// Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(new File("ScannerFileTest.java"));		
		System.out.println("ScannerFileTest.java文件内容如下：");
		//判断是否还有下一行
		while(sc.hasNextLine()){
			//输出文件的下一行
			System.out.println(sc.nextLine());
		}
	}
}

//创建Scanner对象时传入一个File对象作为参数，表明该程序将会读取ScannerFileTest.java文件中的内容

//涉及文件输入，可能发生文件IO相关异常；主程序声明 throws Exception表明main方法不处理任何异常。

// Scanner sc = new Scanner(System.in);
// File fl = new File("ScannerFileTest.java");	