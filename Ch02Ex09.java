/**
* Class <code>Car</code> presents a car. 
* @author Mikhail Firulin
* @version 1.0
*/
public class Car {
  private final double consumption; /* Fuel consumption (litres per kilometre) */
  private final double tank; /* Max volume of the tank (litres) */
  private double fuel; /* Amount of fuel in the tank (litres) */
  private double coordinate; /* Distance from the origin of coordinates (kilometres) */
  
  /**
  * Create a car with predefined volume of the tank and fuel consumption
  * @param tank Max volume of the tank (litres)
  * @param consumption Fuel consumption (litres per kilometre)
  */
  public Car(double tank, double consumption) {
  	this.tank = tank;
    this.consumption = consumption;
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
    if (this.fuel + fuel > tank)
      this.fuel = tank;
    else
  	  this.fuel += fuel;
  }
  
  /**
  * Move a car to distance or until fuel ends.
  * @param distance Distance to move (kilometres)
  */
  public void move(double distance) {
    double expectedConsumption = distance * consumption;
    
    if(expectedConsumption > fuel) {
      coordinate += fuel / consumption;
      fuel = 0;
    }
    else {
  	  coordinate += distance;
      fuel -= expectedConsumption;
    }
      
  }
  
  public static void main(String[] args) {
  	Car car = new Car(50, 0.1);
    car.refuel(50);
    System.out.println(car.getCoordinate());
    System.out.println(car.getFuel());
    car.move(100);
    System.out.println(car.getCoordinate());
    System.out.println(car.getFuel());
    car.refuel(100);
    car.move(1600);
    System.out.println(car.getCoordinate());
    System.out.println(car.getFuel());
  }
}
