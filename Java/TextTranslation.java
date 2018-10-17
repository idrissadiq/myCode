package texttranslation;

/* Idris Sadiq

** 03/19/2017

** This program scans a text file for "Canadianisms"; specifically words that 
   end in "bre", "tre", or "eh", and translates them into "Americanisms". After 
   the words are translated, the program generates an output file containing the 
   translated words. When running this program please make sure that the file
   you wish to scan is located in the same folder that your java project is
   running in
*/

import java.util.*;
import java.io.*;

public class TextTranslation {

    public static void main(String[] args) 
    throws FileNotFoundException {  // Exception for nonextistent file
        long fileSize;
        int totalTokens = 0;
        int breTokens = 0;
        int treTokens = 0;
        int ehTokens = 0;
        String next;
        String result = "";
        String newFileName = "translated.txt";  // Name of output file
        
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter file to translate: ");
        String inputFile = console.next();  // Store input file name
        File f = new File(inputFile);
        Scanner fileRead = new Scanner(f);
        fileSize = f.length();  // Store size of file
        System.out.print(inputFile + " contains: " + fileSize + " byte(s)");
        System.out.println();
        
        // Count and correct each Canadianism token  
        while(fileRead.hasNext()){
            next = fileRead.next();
            totalTokens++;
            if(next.endsWith("bre")){
                next = next.replaceAll("bre", "ber");
                breTokens++;
            }
            else if(next.endsWith("tre")){
                next = next.replaceAll("tre", "ter");
                treTokens++;
            }
            else if(next.matches("eh")){
                next = next.replaceAll("eh", "");
                ehTokens++;
            }
            result = result + next + " "; // Store each corrected string
            
        }
        System.out.println("The program counted a total of " + totalTokens + " token(s): ");
        System.out.println(breTokens + " - bre token(s)");
        System.out.println(treTokens + " - tre token(s)");
        System.out.println(ehTokens + " - eh token(s)");
        
        // Create output file and write result to file
        PrintStream newFile = new PrintStream(new File(newFileName));
        newFile.print(result);
    }
}