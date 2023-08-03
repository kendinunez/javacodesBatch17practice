package Class4;


import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        //Creating the object of the Scanner class so that we can reuse the logic from
        //This class which is already written for us by java developers
        Scanner input=new Scanner(System.in);
        //Taking an input from the user and storing in int a name variable
        String name = input.next();
        if(name.equals("Ashgar")){
            System.out.println("Java instructor");
        }else{
            System.out.println("I don't know you");
        }
       // System.out.println("Hello "+name);

    }
}
