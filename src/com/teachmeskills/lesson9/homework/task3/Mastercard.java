package com.teachmeskills.lesson9.homework.task3;

public class Mastercard extends AbstractCard{
    public static final double LIMIT = 5000;

    public Mastercard(long number, int cvc, double balance, int id, String currency) {
        super(number, cvc, balance, id, currency);
    }

    @Override
    public double getCommissionRate() {
        return 0.025;  // 2.5% commission rate for Mastercard
    }

    @Override
    public double getExchangeRate(String currency) {
        if (currency.equals("EUR")) {
            return 1.1;  // Exchange rate for EUR to Mastercard's currency
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
