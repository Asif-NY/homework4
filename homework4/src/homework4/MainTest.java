package homework4;

public class MainTest {

	public static void main(String[] args) {
		
		oop o = new oop();
		o.display();
		
		
		oop2 o2 = new oop2 ();
		o2.display();
		System.out.println(o2.add(10, 20));
		System.out.println(o2.add(10.5, 20.5)); //polymorphism
		
		Encap e = new Encap();
		e.setName("Asif Tanvir");
		System.out.println("Name: "+e.getName());
		
		MotorCar m = new Toyota();
		m.run();
	}

}
