public class ArgTest{
	public static void main(String[] args){
		//���args����ĳ���
		System.out.println(args.length);
		//����args�����ÿ��Ԫ��
		//foreach ѭ����ʽ:	for(type variableName : array|collection){
		//					variableName�Զ���������ÿ��Ԫ��
		//	}
		// for(int i=0;i<args.length;i++){
			// System.out.println(args[i]);
		   for(String arg : args){
			  System.out.println(arg);
		 }  
	}
}


//����java ArgTest.java    			����� 	0

//����java ArgTest java Spring  	�����	2
//											java
//											Spring

//����java ArgTest "java Spring" 	�����	1
//											java Spring

/* 			for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		} */