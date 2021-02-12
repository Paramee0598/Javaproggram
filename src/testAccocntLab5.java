/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bravo
 */
import java.util.Scanner;

public class testAccocntLab5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temp;
        AccocntLab5 account = new AccocntLab5(1122, 20000);
        account.setAnnualInterestRate(4.5);
        System.out.println("ID : " + account.getId());
        System.out.println("Balance : " + account.getBalance());
        System.out.println("Annual Interest Rate " + account.getAnnualInterestRate());
        System.out.println("Monthly Interest Rate : " + account.getMonthlyInterestRate());
        System.out.println("Interest : " + account.getMonthlyInterest());
        System.out.println("Created Date : " + account.getDate());
        System.out.println("-----------------------------------------------------");
        System.out.print("Withdraw : ");
        temp = input.nextDouble();  //input
        account.withdraw(temp);
        System.out.println("Balance : " + account.getBalance());
        System.out.print("Deposit : ");
        temp = input.nextDouble(); //input
        account.deposit(temp);
        System.out.println("Balance : " + account.getBalance());
        System.out.println("Interest : " + account.getMonthlyInterest());

    }
}
