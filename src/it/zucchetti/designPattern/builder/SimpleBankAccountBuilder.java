package it.zucchetti.designPattern.builder;

public class SimpleBankAccountBuilder implements SimpleBankAccountBuilderInterface{
    private final long accountNumber;
    private String name;
    private boolean enabled;
    private double balance;
    private double bankCredit;

    public SimpleBankAccountBuilder(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public SimpleBankAccountBuilderInterface withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public SimpleBankAccountBuilderInterface isEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public SimpleBankAccountBuilderInterface withBalance(double balance) {
        this.balance = balance;
        return this;
    }

    @Override
    public SimpleBankAccountBuilderInterface bankCredit(double bankCredit) {
        this.bankCredit = bankCredit;
        return this;
    }

    @Override
    public SimpleBankAccount getResult() {
        return new SimpleBankAccount(this.accountNumber,this.name,this.enabled,this.balance,this.bankCredit);
    }

}
