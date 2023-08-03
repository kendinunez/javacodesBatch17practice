package Class4;

import java.util.Scanner;

public class HwCredit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String creditCard= scanner.next();
        if(creditCard.equals("Yes")){
            System.out.println("What is the balance in your credit card?");
            double balance=scanner.nextDouble();
            if(balance>=1000){
                System.out.println("You have to pay immediately");
            }else{
                System.out.println("You can spend more!");
            }}else{
            System.out.println("Would you like to apply for a credit card?");
        }
    }
}
