package Class4;

import java.util.Scanner;

public class HwDMV {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter your age");
        double age=scanner.nextDouble();
        if(age>=18){
            System.out.println("I will issue a driver's license");
        }else{
            System.out.println("I offer you to get a learner's permit");
        }
    }
}
