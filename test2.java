package test;

class Car{
	String name;
	String color;
	boolean gasoline;

	Car(String name, String color , boolean gasoline){
		this.name=name;
		this.color=color;
		this.gasoline=gasoline;
	}

	void run() {
		if (gasoline) {
			System.out.println("부릉부릉");
		}
		else {
			System.out.println("덜컹 덜컹");
		}
	}
	void stop(){
		System.out.println("끼이익");
	}
	
}

class Truck extends Car{
	int Ton;

	Truck(String name, String color , boolean gasoline, int ton){
		super(name,color,gasoline);
		this.Ton=ton;
	}

	void run() {
		System.out.println("우당탕 쿵탕");
	}

	void convey() {
		System.out.println("짐을 실어 나른다.");
	}

}

public class test2 {

	public static void main(String[] args) {

		Car mycar = new Car("제네시스","빨강",true);	
		Car yourcar = new Truck("봉고","파랑",true,1500);
		
//		TestCar(mycar);
//		TestCar(yourcar);
		
		mycar.run();
		yourcar.run();			
	}
}
