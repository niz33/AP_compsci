import java.util.Objects;
import java.util.Scanner;
import java.io.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BMI {
    static Scanner scanner = new Scanner(System.in);

    static boolean usingImperial;

    static double weight;
    static double height;
    static double BMI;

    public static void convert_to_metric(){
        height*=0.3048;
        weight*=0.453592;
    }

    public static void main(String[] args) {
        System.out.println("============BMI CALCULATOR============");
        System.out.println("Do you want to use imperial measureents instead of metric? (Y/N)");
        usingImperial=(Objects.equals(scanner.nextLine(), "Y"));
        System.out.println("Please input your height (in meters or feet) followed by your weight (in kilograms or pounds):");
        height=scanner.nextDouble();
        weight=scanner.nextDouble();
        if(usingImperial){
            convert_to_metric();
        }
        System.out.println("You BMI value is "+(BMI=weight/height/height)+".");
        if(BMI<18.5){
            System.out.println("You are underweight!");
        }
        if(BMI>30){
            System.out.println("You are fat!");
        }
        else if(BMI>25){
            System.out.println("You are overweight!");
        }
    }
}
