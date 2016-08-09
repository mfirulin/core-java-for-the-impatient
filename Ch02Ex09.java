/**
* Class <code>Car</code> presents a car. 
* @author Mikhail Firulin
* @version 1.0
*/

public class Car {
  private final double fuelСonsumption; /* Litres per kilometre */
  private double fuel; /* Amount of fuel in the tank (litres) */
  private double coordinate; /* Distance from the origin of coordinates (kilometres) */
  
  /**
  * Create a car with predefined fuel consumption
  * @param fuelConsumption Fuel consumption (litres per kilometre)
  */
  public Car(double fuelConsumption) {
  	this.fuelConsumption = fuelConsumption;
  }
  
  /**
  * Get amount of fuel in the tank (litres).
  * @return Amount of fuel in the tank (litres)
  */
  public double getFuel() {
  	return fuel;
  }
  
  /**
  * Get distance from the origin of coordinates (kilometres).
  * @return distance from the origin of coordinates (kilometres)
  */
  public double getCoordinate() {
  	return coordinate;
  }
  
  /**
  * Add fuel
  * @param fuel Amount of fuel to add (litres)
  */
  public void refuel(double fuel) {
  	this.fuel += fuel;
  }
  
  /**
  * Move a car 
  * @param distance Distance to move (kilometres)
  */
  public void move(double distance) {
  	coordinate += distance;
    fuel -= distance * fuelConsumption;
  }
  
  public static void main(String[] args) {
  	Car car = new Car(0.08);
    car.refuel(50);
    System.out.println(car.getFuel());
    car.move(100);
    System.out.println(car.getCoordinate());
  }
}
