import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args){
        System.out.print("Guess a number between 1 and 100 :");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number % 5 ==0 && number % 3 ==0){
            System.out.println("Fizzbuzz");
        } else if (number % 5 == 0) {
            System.out.println("Fizz");

        } else if (number % 3 == 0) {
            System.out.println("Buzz");

        }else {
            System.out.println(number);
        }

    }
}
