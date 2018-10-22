package carsandfractions;

/*  Idris Sadiq

    This class contains methods for adding two fractions as well as checking if 
    two fractions are equal. The process in which this is done is by simplifying 
    the input using a least common denominator then performing the desired 
    operation
*/

public class Fractions {
    int numerator, denominator;
    
    public Fractions(int n, int d){ // Fractions class constructor
        if(d == 0)
            throw new ArithmeticException();
        else{
            numerator = n;
            denominator = d;
            // Store fraction in simplified form
            // Check if 2 is LCD
            if((numerator % 2 == 0) && (denominator % 2 ==0)){
                while((numerator % 2 == 0) && (denominator % 2 ==0)){
                    numerator = numerator / 2;
                    denominator = denominator / 2;
                }
            }
            // Check if 3 is LCD
            if((numerator % 3 == 0) && (denominator % 3 ==0)){
                while((numerator % 3 == 0) && (denominator % 3 ==0)){
                    numerator = numerator / 3;
                    denominator = denominator / 3;
                }
            }
            // Check if 5 is LCD
            if((numerator % 5 == 0) && (denominator % 5 ==0)){
                while((numerator % 5 == 0) && (denominator % 5 ==0)){
                    numerator = numerator / 5;
                    denominator = denominator / 5;
                }
            }
        }
    }
    
    public int getNume(){
        return numerator;
    }
    
    public int getDenom(){
        return denominator;
    }
    
    public void setNume(int n){
        numerator = n;
    }
    
    public void setDenom(int d){
        if(d == 0)
            throw new ArithmeticException();
        else
            denominator = d;
    }
    
    public Fractions add(Fractions a){
        int num1 = numerator;
        int denom1 = denominator;
        int num2 = a.getNume();
        int denom2 = a.getDenom();
        
        // Calculate numerator and denominator product sums
        int finalNume = (num1 * denom2) + (num2 * denom1);
        int finalDenom = denom1 * denom2;
        System.out.println("Your fraction is: " + finalNume + "/" + finalDenom);
        
        // Factor fraction by using least common denominator
        // Check if 2 is LCD
        if((finalNume % 2 == 0) && (finalDenom % 2 ==0)){
            while((finalNume % 2 == 0) && (finalDenom % 2 ==0)){
                finalNume = finalNume / 2;
                finalDenom = finalDenom / 2;
            }
        }
        // Check if 3 is LCD
        if((finalNume % 3 == 0) && (finalDenom % 3 ==0)){
            while((finalNume % 3 == 0) && (finalDenom % 3 ==0)){
                finalNume = finalNume / 3;
                finalDenom = finalDenom / 3;
            }
        }
        // Check if 5 is LCD
        if((finalNume % 5 == 0) && (finalDenom % 5 ==0)){
            while((finalNume % 5 == 0) && (finalDenom % 5 ==0)){
                finalNume = finalNume / 5;
                finalDenom = finalDenom / 5;
            }
        }
        
        System.out.println("Your factored fraction is: " + finalNume + "/" + finalDenom);
        return new Fractions(finalNume, finalDenom);
        
    }
    
    public boolean equals(Fractions a){
        if((numerator == a.getNume()) && (denominator == a.getDenom()))
            return true;
        else
            return false;
    }
    
    public String toString(){
        return "(" + numerator + "/" + denominator + ")";
    }
    
    
}
