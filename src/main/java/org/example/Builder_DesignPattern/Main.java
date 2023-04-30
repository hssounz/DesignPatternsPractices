package org.example.Builder_DesignPattern;

import org.example.Builder_DesignPattern.dao.AccountRepositoryImpl;

public class Main {
    public static void main(String[] args) {

        AccountRepositoryImpl accountRepository = new AccountRepositoryImpl();
        accountRepository.sampleData();
        accountRepository.findAll().forEach(System.out::println);
    }
}
