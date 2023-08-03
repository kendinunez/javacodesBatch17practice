package Class4;

public class T2 {
    public static void main(String[] args) {
        double mortgageRate=4.1;
        double mortgagePrice=40000;

        if(mortgageRate>4.5){
            System.out.println("User will not buy a house");
        }else{
            System.out.println("User will consider buying");
            if(mortgagePrice>50000){
                System.out.println("User will take a loan");
            }else{
                System.out.println("User will pay cash");
            }
        }

    }
}
