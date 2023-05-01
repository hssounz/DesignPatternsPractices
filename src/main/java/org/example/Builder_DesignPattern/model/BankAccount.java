package org.example.Builder_DesignPattern.model;

public class BankAccount implements Cloneable {
    private Long accountId;
    private double balance;
    private String currency;
    private AccountType type;
    private AccountStatus status;
    private Customer customer;
    public static class AccountBuilder {
        private BankAccount bankAccount = new BankAccount();

        public AccountBuilder balance(double balance){
            bankAccount.balance = balance;
            return this;
        }
        public AccountBuilder customer(Customer customer){
            bankAccount.customer = customer;
            return this;
        }
        public AccountBuilder currency(String currency){
            bankAccount.currency = currency;
            return this;
        }
        public AccountBuilder accountType(AccountType type){
            bankAccount.type = type;
            return this;
        }
        public AccountBuilder accountStatus(AccountStatus status){
            bankAccount.status = status;
            return this;
        }
        public BankAccount build(){
            return this.bankAccount;
        }
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public Long getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public AccountType getType() {
        return type;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", customer=" + customer +
                '}';
    }

    @Override
    public BankAccount clone() throws CloneNotSupportedException {
        BankAccount bankAccount = (BankAccount) super.clone();
        bankAccount.setCustomer(bankAccount.getCustomer().clone());
        return bankAccount;
    }
}
