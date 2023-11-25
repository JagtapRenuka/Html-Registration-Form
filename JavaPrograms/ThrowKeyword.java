import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        shop();
    }
    public static void shop(){
        try{
            pay();
            System.out.println("shopping completed");
        }
        catch(Exception ex){
            System.out.println("shopping not completed");
            System.out.println("Exception sent by pay() and accepted by shop()");
        }
        finally{
            System.out.println("this has to print");
        }
    }
    public static void pay(){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter amount");
            int amt=sc.nextInt();
            System.out.println("Payment successful in INR "+amt);
        }
        catch(Exception ex){
            System.out.println("Payment is not successful");
            throw ex;
        }
    }
}
