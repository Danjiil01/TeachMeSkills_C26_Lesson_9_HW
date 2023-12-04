package com.teachmeskills.lesson9.homework.task3.card.impl;

public class MasterCard extends AbstractCard {
    public static final double LIMIT = 5000;

    public MasterCard(long number, int cvc, double balance, int id, String currency) {
        super(number, cvc, balance, id, currency);
    }

    @Override
    public double getCommissionRate() {
        return 0.025;  // 2.5% commission rate for MasterCard
    }

    @Override
    public double getExchangeRate(String currency) {
        if (currency.equals("EUR")) {
            return 1.1;  // Exchange rate for EUR to MasterCard's currency
        } else {
            return 1;  // No need for conversion as both currencies are the same
        }
    }

    @Override
    public void transfer(IBankCard card, double amount) {

    }

    @Override
    public int getId() {
        return id;
    }
}
