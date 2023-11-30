package com.teachmeskills.lesson9.homework.task3.card;

public interface IBankCard {
    void transfer(IBankCard card, double amount);

    double getBalance();

    int getId();
}
