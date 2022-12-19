/**
 * class- Lab01- simple bank accounts
 * @author Klara Makek
 * @version 07.09.2022.
 */

public class Lab01 {
    public static void main(String[] args) throws Exception {

        //making 3 accounts as variables 
        Account acc1 = new Account();
        Account acc2 = new Account();
        Account acc3 = new Account();
        
        // first account
        acc1.initialize("Jane"); // adding name of the owner using .initialize 
        acc1.deposit(100);  // adding money on the account by using .deposit
        acc1.withdraw(40);  // takeing money from the account by using . withdraw
        acc1.withdraw(20); // takeing money from the account by using . withdraw
        System.out.print("Acc1" + " "); //printing Owner and overall balance of the account
        acc1.print();

        acc2.initialize("Fred"); // adding name of the owner using .initialize 
        acc2.deposit(200); // adding money on the account by using .deposit
        acc2.deposit(60); // adding money on the account by using .deposit
        acc2.withdraw(125); // takeing money from the account by using . withdraw
        System.out.print("Acc2" + " "); //printing Owner and overall balance of the account
        acc2.print();

        acc3.initialize("George"); // adding name of the owner using .initialize 
        acc3.deposit(50); // adding money on the account by using .deposit
        acc3.withdraw(0); // takeing money from the account by using . withdraw
        System.out.print("Acc3" + " "); //printing Owner and overall balance of the account
        acc3.print();
        


    }

}
