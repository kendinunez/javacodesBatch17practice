package Class4;

public class Task2 {
    public static void main(String[] args) {
        double mortgageRate=4;
        double housePrice=40000;

        if(mortgageRate>4.5){
            System.out.println("User will not buy a house");
        }else{
            System.out.println("Consider buying");
            if(housePrice>40000){
                System.out.println("User will ake loan");
            } else{
                System.out.println("User will pay cash");
            }
        }
    }
}
