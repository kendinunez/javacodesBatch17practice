package Class4;

import java.util.Scanner;

public class HwCityAndTemp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter City");
        String city= input.next();

        System.out.println("Enter Temperature");
        double tempFare=input.nextDouble();
        double tempCel=((tempFare-32)*5/9);
        System.out.println("The temperature in the city of "+city+ " is "+tempFare);
    }
}
