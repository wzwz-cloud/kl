package Bankacc;

public class LLBankDriver {
    public static void main(String[] args) {
        LLBankAccount[] customers = new LLBankAccount[30];

        customers[0] = new LLBankAccount("Carolye", 100);
        customers[1] = new LLBankAccount("Shyam", 1012);

        customers[0].deposit(5000);
        customers[1].deposit(1000);

        customers[0].withdraw(4000);
        customers[1].withdraw(15000); 

        customers[0].addInterest();
        customers[1].addInterest();

        customers[0].display();
        customers[1].display();
    }
}

