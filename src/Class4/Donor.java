package Class4;

public class Donor {
    public static void main(String[] args) {
        double age=19;
        double weight=140;

        if(age>=18){
            System.out.println("She is eligible");
            if(weight>110){
                System.out.println("She is eligible");
            }else{
                System.out.println("We cannot accept such a patient");
            }
        }

    }
}
