package com.teachmeskills.lesson9.homework.task3.card.impl;

public interface IBankCard {
    void transfer(IBankCard card, double amount);

    int getId();

    void transfer(AbstractCard toCard, double transferAmount);
}
