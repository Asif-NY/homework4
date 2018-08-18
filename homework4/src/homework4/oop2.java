package homework4;
    //inheritance
public class oop2 extends oop {

	@Override 
	public void display() {
		System.out.println("Hello America");
		super.display();
	}
	
	public int add (int a, int b) {
		return a + b;
	}
	
	//overload 

	public double add (double a, double b) {
		return a + b;
	}
		
}


	

