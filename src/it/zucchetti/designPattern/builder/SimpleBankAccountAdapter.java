package it.zucchetti.designPattern.builder;

public class SimpleBankAccountAdapter extends SimpleBankAccountBuilder implements BankAccountInterface, SimpleBankAccountBuilderInterface {

    public SimpleBankAccountAdapter(long accountNumber) {
        super(accountNumber);
    }

    @Override
    public void incomingOperation(double amount) throws Exception {
    }

    @Override
    public void outgoingOperation(double amount) throws Exception {

    }
}
