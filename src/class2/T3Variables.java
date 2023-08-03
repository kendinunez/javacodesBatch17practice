package class2;

public class T3Variables {
    public static void main(String[] args) {
        String name="Kendi";
        String lastName="Nunez";
        String city="Clinton";
        String state="Maryland";
        String phoneNumber="+1-346-333-4526";
        System.out.println("My Name is "+name+" and my last name is "+lastName);
        System.out.println("I Live in "+city+" and state "+state);
        System.out.println("And my phone number is "+phoneNumber);
        city="Houston";
        state="Texas";
        phoneNumber="123-456-7890";
        System.out.println("My name is "+name);
        System.out.println("I moved to new city "+city+" and new state "+state);
        System.out.println("My new phone number is "+phoneNumber);
    }
}
