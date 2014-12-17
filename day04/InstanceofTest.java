public class InstanceofTest{
	public static void main(String[]args){
		Person p = new Person("android",12);
		
		if(p instanceof Person){
			System.out.println("p是人类");
		}else{
			System.out.println("不是人类");
		}
	}
}