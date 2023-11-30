package com.teachmeskills.lesson9.homework.task3.card;

public abstract class AbstractCard implements IBankCard {
    private long cardNumber;
    private int cvc;
    private double balance;
    public int id;
    private String currency;

    // Конструктор
    public AbstractCard(long cardNumber, int cvc, double balance, int id, String currency) {
        this.cardNumber = cardNumber;
        this.cvc = cvc;
        this.balance = balance;
        this.id = id;
        this.currency = currency;
    }

    public long getNumber() {
        return cardNumber;
    }

    public int getCvc() {
        return cvc;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }


    // Абстрактный метод для получения комиссии для каждого типа карты
    public abstract double getCommissionRate();

    // Абстрактный метод для получения курса обмена для каждого типа карты
    public abstract double getExchangeRate(String currency);

}

