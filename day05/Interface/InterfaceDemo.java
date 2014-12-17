 interface GrandFather{
	int age =75;			//public static final 
	void study();			//public abstract 
	}
	
interface GrandMother{
	double height = 165.0;	//public static final
	 void show();			//public abstract 
	}

interface Father extends GrandFather,GrandMother{
	String name = "john";	//public static final 
	 void eat();			//public abstract 
	}

class Son implements Father {
	public void eat(){}

	public void show(){}

	public void study(){}
}

public class InterfaceDemo{
	public static void main(String[] args) {
		
	}
}
 
 
  
