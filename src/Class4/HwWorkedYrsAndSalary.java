package Class4;

import java.util.Scanner;

public class HwWorkedYrsAndSalary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Write numbers of worked years");
        int years=scanner.nextInt();
        System.out.println("Write the annual salary");
        double annualSalary=scanner.nextDouble();
        if(years>=5){
            System.out.println("User is eligible for bonus");
            if(annualSalary>5000){
                System.out.println("Bonus=5000");
            }else{
                System.out.println("Bonus=3000");
            }}else{
            System.out.println("Not eligible for bonus");
        }
    }
}
