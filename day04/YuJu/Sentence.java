import java.util.Scanner;

public class Sentence{
	public static void main(String[] args){
/* 		if语句格式1：       			if语句格式2：
		if(比较表达式){					if(比较表达式){
			语句体							语句体
		}								}else{
											语句体1	
										}
										
		if语句格式3：					if语句格式4：
		if(比较表达式1){       			if(比较表达式1){
			语句体1							语句体1
		}else if(比较表达式2){			}else if(比较表达式2){
			语句体2							语句体2
		}else if(比较表达式3){			}else if(比较表达式3){
			语句体3							语句体3
		}								}
		...								...
		else if(比较表达式n){			else if(比较表达式n){
			语句体n							语句体n
		}								}else{
											语句体n+1
										}	
										
		执行流程：
			首先比较表达式1，看其返回值是：
				true：执行语句体1
				false：就继续执行比较表达式2，看其返回值是：
					true：执行语句体2
					false：就继续执行比较表达式3，看其返回值是：
						...
				(如果所有比较表达式都不成立，执行语句体n+1)			
*/
		
		//判断两个数据是否相等
/*  	int a = 10;
		int b = 20;
		if(a==b){
			System.out.println("数据相等");
		}else{
			System.out.println("数据不相等");
		}
*/

/*  Scanner sc = new Scanner(System.in);
	System.out.println("请输入一个int类型的值：");
	int x = sc.nextInt();
	 
	int  y;
	 if(x>=3){
		y = 2*x+1;
	 }else if(x<3 && x>=-1){
		y=2*x;
	 }else {
		y=2*x-1;
	 }
		System.out.println("y的值是：" + y); 	
*/
		
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入月份：");
	int month = sc.nextInt();
	
	/* if(month==3||month==4||month==5 ){
		System.out.println("春");
	}else if(month==6||month==7||month==8 ){
		System.out.println("夏");
	}else if(month==9||month==10||month==11){
		System.out.println("秋");
	}else if(month==1||month==2||month==12){
		System.out.println("冬");
	}else{
		System.out.println("月份录入有误")；
	}		 */
	if(month<1 || month>12){
		System.out.println("录入月份有误");
	}else if(month>=3 && month<=5 ){
		System.out.println("春");
	}else if(month>=6 && month<=8 ){
		System.out.println("夏");
	}else if(month>=9&&month<=11){
		System.out.println("秋");
	}else{
		System.out.println("冬");
	}
  }
}