 interface Assaultable{
	//抽象方法
	public abstract void attack();
}

interface Mobile{
	//抽象方法
	public abstract void move();
}

abstract class Weapon implements Assaultable,Mobile{
	
	
	public void attack(){
		System.out.println("attack");
	}
	
	public void move(){
		System.out.println("move");
	}
}

class Tank extends Weapon {

	public void attack(){
		System.out.println("Tank attack");
	}
	public void move(){
		System.out.println("Tank move");
	}
}

class Flighter extends Weapon {

	public void attack(){
		System.out.println("Flighter attack");
	}
	
	public void move(){
		System.out.println("Flighter move");
	}
}

class WarShip extends Weapon {
	
	public void attack(){
		System.out.println("WarShip attack");
	}
	
	public void move(){
		System.out.println("WarShip move");
	}
	
}

class Arrmy{
	Weapon[] w;
	int max = 0;
	
	public Arrmy(int max){
		w =new Weapon[max];
	}
	void addWeapon(Weapon wa){
		if(max < w.length){
		w[max] = wa;
		max++;
		}else{
		System.out.println("武器已满");
		return;
		}
	}
	
	void attackAll(){
		for(int i = 0;i<w.length;i++){
			if(w[i]!=null){
				w[i].attack();
		}
	}
}
	void moveAll(){
		for(int i = 0;i<w.length;i++){
			if(w[i]!=null){
			w[i].move();
		}
	}
	}

}

public class ArrmyTest{
	public static void main(String[] args) {
		Arrmy a = new Arrmy(3);
		//Weapon d = new Tank();  向上转型
		//a.addWeapon(d)
		a.addWeapon(new Tank());
		a.addWeapon(new Flighter());
		a.addWeapon(new WarShip());
		
		a.attackAll();
		a.moveAll();
		
	}
}


