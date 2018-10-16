package cityarea;

/* Idris Sadiq

** 02/10/2017

** This program generates the area, in square ft., of a city. The city's
   length and width are provided by the user. The program will also generate the 
   area of a "City Hall" which is pre-defined as 10% of the city's total area. 
   Lastly, the program asks the user for the desired number of houses in the city 
   and, based on the remaining space, the program will generate the area of each 
   equally sized house that can fit within the city limits
*/

import java.util.*;

public class CityArea {

    public static void main(String[] args) {
        // Prompt user for input
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the desired width of the city (must be >= 10): ");
        int width = console.nextInt();
        System.out.println();
        System.out.println("Please enter the desired length of the city (must be >= 10): ");
        int length = console.nextInt();
        System.out.println();
        System.out.println("Please enter the number of houses you wish to have in your city (must be > 0): ");
        int numHouses = console.nextInt();
        
        System.out.println();
        System.out.println("Calculating . . . ");
        System.out.println();
        
        int areaCity = getArea(width, length);
        System.out.println("The area of your city is " + areaCity + " sq. ft");
        
        double areaCityHall = getCityHallArea(length, width);
        System.out.println("The area of City Hall will be " + areaCityHall + " sq. ft");
        
        System.out.println("With the remaining space in your city, ");
        double areaHouse = getAreaPerHouse(numHouses, areaCity, areaCityHall);
        System.out.println("the area per house will be " + areaHouse + " sq. ft");
    }
    // Method to calculate city area
    public static int getArea(int width, int length){
        int areaOfCity = (width * length);
        return areaOfCity;
    }
    // Method to calculate city hall area
    public static double getCityHallArea(int length, int width){
        double newLength = (length * 0.1);
        double newWidth = (width * 0.1);
        double areaOfCityHall = (newLength * newWidth);
        return areaOfCityHall;
    }
    // Method to calculate how many houses can fit in remaining space
    public static double getAreaPerHouse(int numberOfHouses, int areaTotal, double areaOfCityHall){
        double areaPerHouse = ((areaTotal - areaOfCityHall) / numberOfHouses);
        return areaPerHouse;
    }
    
}
