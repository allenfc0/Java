package collectionAndJavaIO;

public class Car {
	
	private String car;
	private double mpg;
	private int cylinders;
	private double displacement;
	private double horsepower;
	private double weight;
	private double acceleration;
	private int model;
	private String origin;
	
	public Car() {
		this.car = "";
		this.mpg = 0;
		this.cylinders = 0;
		this.displacement = 0;
		this.horsepower = 0;
		this.weight = 0;
		this.acceleration = 0;
		this.model = 0;
		this.origin = "";
	}
	
	//All getter methods
	public String getCar() {
		return this.car;
	}
	
	public double getMPG() {
		return this.mpg;
	}
	
	public int getCylinders() {
		return this.cylinders;
	}
	
	public double getDisplacement() {
		return this.displacement;
	}
	
	public double getHorsepower() {
		return this.horsepower;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public double getAcceleration() {
		return this.acceleration;
	}
	
	public int getModel() {
		return this.model;
	}
	
	public String getOrigin() {
		return this.origin;
	}
	
	
	//All setter methods
	public void setCar(String a) {
		this.car = a;
	}
		
	public void setMPG(double a) {
		this.mpg = a;
	}
		
	public void setCylinders(int a) {
		this.cylinders = a;
	}
	
	public void setDisplacement(double a) {
		this.displacement = a;
	}
	
	public void setHorsepower(double a) {
		this.horsepower = a;
	}
		
	public void setWeight(double a) {
		this.weight = a;
	}
	
	public void setAcceleration(double a) {
		this.acceleration = a;
	}
	
	public void setModel(int a) {
		this.model = a;
	}
		
	public void setOrigin(String a) {
		this.origin = a;
	}
	
		
}

























