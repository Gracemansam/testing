import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Simple calculator for Decagon Loan repayment
        int principal ;
        final int rate = 15;
        double time;
        double result;
        double totalMoneyToDecagon;
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name: ");
        String studentName = input.nextLine();
        System.out.print("How much do you borrow from decagon: ");
        principal = input.nextInt();
        System.out.print("How many years do you plan to pay back: ");
        time = input.nextDouble();
        result = (double)(principal * rate * time/100);
        totalMoneyToDecagon = (double)principal + result;
        System.out.println("Hello " + studentName + " You are to pay N" + totalMoneyToDecagon + " to decagon" );



    }
}