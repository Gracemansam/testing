import java.util.Scanner;

public class Person {
    private  static Scanner input = new Scanner(System.in);

    public static void main (String[] args){
        humanBeing person = new humanBeing();
            System.out.print("What is  your first name: ");
            String fName = input.nextLine();
            person.setFirstName(fName);
            System.out.print("What is  your last name: ");
            String lName = input.nextLine();
            person.setLastName(lName);
            System.out.print("What is  your age: ");
            int yourAge = input.nextInt();
            person.setAge(yourAge);
            System.out.print("What is  your height: ");
            float yourHeight = input.nextFloat();
            person.setHeight(yourHeight);
            person.getFullName();
            System.out.println("Hey " + person.getFullName() + " Your age is "+ person.getAge() + " and you height is " + person.getHeight());

            humanBeing sam = new humanBeing();
            sam.setFirstName("samuel");
            sam.getFirstName();
        System.out.println(sam.getFirstName());
    }
}

