import java.util.*;
public class WeiShu{
	public static void main(String[] args){
		System.out.println("请输入一个1-9999之间的数"); 
	    
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		System.out.println("这个数字的位数是"+st.length());
		StringBuffer b = new StringBuffer();
		b.append(st);//append()在字符串序列之后添加新的内容
		b.reverse();//将StringBuffer实例的字符序列变成其倒序的字符序列
		if(st.equals(b.toString())){   //toString()方法就是把对象转换成String类型
			System.out.println(st + "是回文数");
		}else{
			System.out.println(st + "不是回文数");
		}	
	}
}