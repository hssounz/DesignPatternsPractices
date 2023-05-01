package org.example.Builder_DesignPattern;

import org.example.Builder_DesignPattern.model.AccountStatus;
import org.example.Builder_DesignPattern.model.BankAccount;
import org.example.Builder_DesignPattern.model.Customer;

public class Main2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        /**
         * Testing Prototype Pattern
         */
        System.out.println("PROTOTYPE PATTERN : CLONE");
        BankAccount bankAccount1 = BankDirector.bankAccountBuilder()
                .accountStatus(AccountStatus.CREATED)
                .balance(500)
                .customer(new Customer(1L, "Hassen"))
                .currency("TD")
                .build();
        BankAccount bankAccount2 = bankAccount1.clone();
        System.out.println(bankAccount1);
        System.out.println(bankAccount2);

        bankAccount2.getCustomer().setName("Hassen 2");
        System.out.println("*****************************************************************************************");
        System.out.println(bankAccount1);
        System.out.println(bankAccount2);

    }
}
