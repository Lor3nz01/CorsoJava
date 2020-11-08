package it.zucchetti.designPattern.builder;

public interface SimpleBankAccountBuilderInterface {

    SimpleBankAccountBuilderInterface withName(String name);
    SimpleBankAccountBuilderInterface isEnabled(boolean enabled);
    SimpleBankAccountBuilderInterface withBalance(double balance);
    SimpleBankAccountBuilderInterface bankCredit(double bankCredit);
    SimpleBankAccount getResult();
}
