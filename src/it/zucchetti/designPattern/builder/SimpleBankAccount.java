package it.zucchetti.designPattern.builder;

public class SimpleBankAccount {
    private final long accountNumber;
    private String name;
    private boolean enabled;
    private double balance;
    private double bankCredit;


    public SimpleBankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public SimpleBankAccount(long accountNumber, String name) {
        this(accountNumber);
        this.name = name;
    }

    public SimpleBankAccount(long accountNumber, String name, boolean enabled) {
        this(accountNumber,name);
        this.enabled = enabled;
    }

    public SimpleBankAccount(long accountNumber, String name, boolean enabled, double balance, double bankCredit) {
        this(accountNumber,name,enabled);
        this.balance = balance;
        this.bankCredit = bankCredit;
    }
    public boolean doOperationBalance(double operationAmount){
        if (!this.enabled){
            return false;
        }
        if (balance + operationAmount < 0){
            return false;
        }
        balance += operationAmount;
        return true;
    }
}
