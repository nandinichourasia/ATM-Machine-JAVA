package ATMmachine;

import java.util.*;

class ATM {

    int pin = 2345;
    int balance = 0;

    public void checkpin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Pin: ");
        int enteredPin = sc.nextInt();
        if (enteredPin == pin) {
            menu();
        } else {
            System.out.println("You entered the wrong pin , Try Again");
            checkpin();
        }
    }

    public void menu() {

        System.out.println("Press 1 for Checking Balance");
        System.out.println("Press 2 for Withdrawing Amount");
        System.out.println("Press 3 for Depositing Amount");
        System.out.println("Press 4 to EXIT!");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            showBalance();
            menu();
        } else if (choice == 2) {
            Withdraw();
        } else if (choice == 3) {
            deposit();
        } else if (choice == 4) {
            return;
        } else {
            System.out.println("Please Enter a correct choice!!");
        }

    }

    public void showBalance() {
        System.out.println("Your current Balance is: " + balance);
        menu();
    }

    public void Withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much you want to withdraw: ");
        int wd = sc.nextInt();
        if(wd>balance){
            System.out.println("Insufficient Balance!");
        }
        else{
            balance -= wd;
            System.out.println("Withdraw successful!");
        }
        menu();
    }

    public void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How much you want to deposit: ");
        int depo  = sc.nextInt();
        balance += depo;
        System.out.println("Deposit Successful!");
        menu();
    }
}

public class ATMClass {
    public static void main(String args[]) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
