package com.teachmeskills.lesson9.homework.task3;

public class Visacard extends AbstractCard{
    public static final double LIMIT = 10000;

    public Visacard(long number, int cvc, double balance, int id, String currency) {
        super(number, cvc, balance, id, currency);
    }

    @Override
    public double getCommissionRate() {
        return 0.03;  // 3% commission rate for Visacard
    }

    @Override
    public double getExchangeRate(String currency) {
        if (currency.equals("USD")) {
            return 1.05;  // Exchange rate for USD/EUR to Visacard's currency
        } else {
            return 1;  // No need for conversion as both currencies are the same
        }
    }

    @Override
    public void transfer(BankCard card, double amount) {

    }

    @Override
    public int getId() {
        return id;
    }
}
