package carsandfractions;

/*  Idris Sadiq

    This class contains methods to simulate functionalities commonly found in a 
    car. Methods include filling the tank, using gas (driving), fuel check, and 
    a toString method to display all the information related to the car
*/

public class Car {
    String make, model;
    int year;
    double MPG, fuelCapacity, fuelRemaining, milesDriven;
    
    // Car constructor
    public Car(String carMake, String carModel, double carMPG, int carYear, double carMilesDriven, double carFuelCapacity, double carFuelRemaining){
        make = carMake;
        model = carModel;
        MPG = carMPG;
        year = carYear;
        milesDriven = carMilesDriven;
        fuelCapacity = carFuelCapacity;
        fuelRemaining = carFuelRemaining;
    }
    // Methods defined for Car
    public void fillTank(double g){
        if(fuelRemaining < fuelCapacity){
            fuelRemaining += g;
            if(fuelRemaining > fuelCapacity)
                fuelRemaining = fuelCapacity;
            System.out.printf("You have added %.2f gallons of gas\n", g);
        }
        else
            System.out.println("The tank is already full !");
    }
    
    public void drive(double m){
        double gasUsed;
        milesDriven += m;
        gasUsed = (m / MPG);
        fuelRemaining = fuelRemaining - gasUsed;
        System.out.printf("You drove %.2f miles and used %.2f gallons of gas\n", m, gasUsed);
    }
    
    @Override 
    public String toString(){
        return "(Make: " + make + ", Model: " + model + ", MPG: " + MPG + ", Year: " + year + ", Miles: " + milesDriven + ", Fuel Limit(gallons): " + fuelCapacity + ", Current Fuel(gallons): " + fuelRemaining + ")";
    }
    
    public double getFuelRemaining(){
        return fuelRemaining;
    }
}
