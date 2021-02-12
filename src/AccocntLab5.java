/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bravo
 */
import java.util.Date;

public class AccocntLab5 {

    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private final Date dateCreated = new Date();

    //Constructor-
    public AccocntLab5() {

    }

    public AccocntLab5(int id, double initialBalance) {
        if (initialBalance <= 0) {
            System.out.println("Something went Wrong");
        } else {
            this.id = id;
            this.balance = initialBalance;
        }
    }

    //Getter-
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDate() {
        return dateCreated;
    }

    //Setter-
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 12;
    }

    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    public void withdraw(double withdraw) {
        if (withdraw > this.balance || withdraw < 0) {
            System.out.println("ERROR::WTIHDRAW");
            System.exit(0);
        } else {
            this.balance -= withdraw;
        }
    }

    public void deposit(double deposit) {
        if (deposit < 0) {
            System.out.println("ERROR::DEPOSIT");
            System.exit(0);
        } else {
            this.balance += deposit;
        }
    }
}
