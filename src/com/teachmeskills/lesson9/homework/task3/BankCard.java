package com.teachmeskills.lesson9.homework.task3;

public interface BankCard {
    void transfer(BankCard card, double amount);

    double getBalance();

    int getId();
}
