package class3;

public class E7IfElseStatement {
    public static void main(String[] args) {

        double accountBalance=1000;
        double price=1000;
        if(accountBalance>=price){ //800>=1000 false
            System.out.println("You can buy this item");
        }else {
            System.out.println("You need to save more");
        }
    }
}
