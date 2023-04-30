package org.example.Builder_DesignPattern;

import org.example.Builder_DesignPattern.model.BankAccount;

public class BankDirector {
    public static BankAccount.AccountBuilder bankAccountBuilder(){
        return new BankAccount.AccountBuilder();
    }
}
