public class CeShi{
	public static void main(String[] args){
		byte b1=3;
		byte b2 = 4;
		//byte b3 = b1+b2;  //error
		byte b3 = (byte)(b1+b2);
		byte b4 = 3 + 4;
		
		byte b = (byte)130;
		byte bb = (byte)300;
		System.out.println(b);  //-126
		System.out.println(bb); //44
		
		short s = 1;
		//s = s + 1;  //error
		s = (short)(s + 1);
		short s2 = 2;		
		s2 += 1;
	/* 	
		int a =-16;
		System.out.println(a>>2);//-4
		System.out.println(a<<2);//-64
		 */
		//获取三个数的最大值 
		int n = 10;
		int m = 20;
		int c = 15;
		
		/* //先比较前两个数,获取最大值
		int temp = (a>b)?a:b;
		//获取前两个数的最大值，在和第三个比较 
		int max = (temp>c)?temp:c;
		System.out.println(max); */
		
		int max = (n>m)?(n>c?n:c):(m>c?m:c);
		System.out.println(max);	
		
		int a1 = 10;
		int b0 = 20;
		int c1 = 30;
		
		if(a1>b0){
			//a1
				if(a1>c1){
				//a1
					System.out.println(a1);
				}else{
				//c1
					System.out.println(c1);
				}
		}else{
			//b0
				if(b0>c1){
				//b0
					System.out.println(b0);
				}else{
				//c1
					System.out.println(c1);
			}
		}		
	}
}
