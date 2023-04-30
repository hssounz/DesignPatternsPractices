package org.example.Builder_DesignPattern;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.Builder_DesignPattern.dao.AccountRepositoryImpl;
import org.example.Builder_DesignPattern.model.AccountType;
import org.example.Builder_DesignPattern.model.BankAccount;
import org.example.Builder_DesignPattern.util.JsonSerializer;

import java.util.List;

public class Main {
    public static void main(String[] args) throws JsonProcessingException{
        JsonSerializer<BankAccount> bankAccountJsonSerializer = new JsonSerializer<>();
        AccountRepositoryImpl accountRepository = new AccountRepositoryImpl();

        accountRepository.sampleData();

            accountRepository.findAll().stream().map(
                    account -> {
                        try {
                            return bankAccountJsonSerializer.toJson(account);
                        } catch (JsonProcessingException e) {
                            throw new RuntimeException(e);
                        }
                    }
            ).forEach(System.out::println);

            accountRepository
                    .searchAccounts(bankAccount -> bankAccount
                            .getType()
                            .equals(AccountType.SAVING))
                    .stream()
                    .map(bankAccount -> {
                        try {
                            return bankAccountJsonSerializer.toJson(bankAccount);
                        } catch (JsonProcessingException e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .forEach(System.out::println);


    }
}
