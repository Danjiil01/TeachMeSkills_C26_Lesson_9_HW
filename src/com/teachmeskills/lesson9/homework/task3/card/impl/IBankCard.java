package com.teachmeskills.lesson9.homework.task3.card.impl;

public interface IBankCard {
    void Transfer(IBankCard card, double amount);

    int getId();

    void Transfer(AbstractCard toCard, double transferAmount);
}