import java.util.Scanner;

public class IT24102928Lab7Q3 {

    private static final double dis = 5.0;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for(int i = 1;i<6;i++){
            System.out.println("Customer "+i);
            System.out.print("Enter total bill amount: ");
            double bill = in.nextDouble();
            System.out.print("Enter mode of payment(C for cash, O for other): ");
            String inp = in.next();
            String pay_mode = inp.toLowerCase();

            if (pay_mode.equals("c")){
                double discount = bill*(dis/100);
                double ammount_to_pay = bill-discount;
                System.out.println("Discount is: "+discount);
                System.out.println("Amount paid: "+ammount_to_pay+"\n");
            }else if (pay_mode.equals("o")){
                System.out.println("No Discount applicable");
                System.out.println("Amount paid: "+bill+"\n");
            }else{
                System.out.println("Payment mode is Not Valid\n");
            }
        }
    }
}