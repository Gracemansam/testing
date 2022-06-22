public class Main2 {
    public static void main(String [] args){
        Bankaccount myAccount = new Bankaccount();
        myAccount.withdrawAmount(100.00);
        myAccount.depositAmount(50);
        myAccount.withdrawAmount(100);
        myAccount.depositAmount(90);
        myAccount.withdrawAmount(100);

        Vipperson sam = new Vipperson();
        System.out.println(sam.getName());
        Vipperson person = new Vipperson("Graceman", 1000000.00, "email@decagon.dev");
        System.out.println(person.getName());


    }
}
