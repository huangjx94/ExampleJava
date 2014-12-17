public class ArgTest{
	public static void main(String[] args){
		//输出args数组的长度
		System.out.println(args.length);
		//遍历args数组的每个元素
		//foreach 循环格式:	for(type variableName : array|collection){
		//					variableName自动迭代访问每个元素
		//	}
		// for(int i=0;i<args.length;i++){
			// System.out.println(args[i]);
		   for(String arg : args){
			  System.out.println(arg);
		 }  
	}
}


//运行java ArgTest.java    			输出： 	0

//运行java ArgTest java Spring  	输出：	2
//											java
//											Spring

//运行java ArgTest "java Spring" 	输出：	1
//											java Spring

/* 			for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		} */