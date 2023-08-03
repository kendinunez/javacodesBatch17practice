package Class4;

import java.util.Scanner;

public class HwLoan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter the amount of loan needed");
        double loanValue=scanner.nextDouble();
        if(loanValue<=200000){
            System.out.println("We will lend you the money");
        }
        else {
            System.out.println("We reject your loan");
        }
    }
}
