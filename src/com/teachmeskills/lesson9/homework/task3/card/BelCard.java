package com.teachmeskills.lesson9.homework.task3.card;

public class BelCard extends AbstractCard{
    public static final double LIMIT = 2000;

    public BelCard(long number, int cvc, double balance, int id, String currency) {
        super(number, cvc, balance, id, currency);
    }

    @Override
    public double getCommissionRate() {
        return 0.02;  // 2% commission rate for BelCard
    }

    @Override
    public double getExchangeRate(String currency) {
        if (currency.equals("BYN")) {
            return 0.85;  // Exchange rate for USD to BelCard's currency
        } else {
            return 1;  // No need for conversion as both currencies are the same
        }
    }

    @Override
    public void Transfer(IBankCard card, double amount) {

    }

    @Override
    public int getId() {
        return id;
    }
}
