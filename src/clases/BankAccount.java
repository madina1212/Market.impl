package clases;

import enums.Bank;

public class BankAccount {
    private Bank bank;
    private double bankAccount;

    public BankAccount(Bank bank, double bankAccount) {
        this.bank = bank;
        this.bankAccount = bankAccount;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public double getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(double bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "BankAccount-" +
                "\n bank: " + bank +
                "\n bankAccount: " + bankAccount ;
    }
}
