package it.zucchetti.designPattern.builder;

public interface BankAccountInterface {

    void incomingOperation(double amount) throws Exception;
    void outgoingOperation(double amount) throws Exception;

}
