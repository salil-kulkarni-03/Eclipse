
public class Car {
	private String model;
	private String[] features;
	
	
	//var-args can only be the last argument of the method
	public Car(String model, String...features) {
		this.model = model;
		this.features = features;
	}

	public void specs() {
		System.out.println("Features of " + model);
		for(String f  : features) {
			System.out.println(f);
		}
	}
	
	public static void main(String[] args) {
		String model = new String("abc");
		String features[] = {"fast","cheap"};
		Car c = new Car(model,features);
		c.specs();
		Car astor = new Car("MG Astor","Keyless","ABS");
		astor.specs();
	}
}
