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

    public double getBalance() {
        return balance;
    }

    @Override
    public void transfer(AbstractCard toCard, double transferAmount) {
        // Проверяем, что на первой карте достаточно денег для перевода
        if (this.balance >= transferAmount) {
            // Вычитаем сумму перевода из баланса текущей карты
            this.balance -= transferAmount;

            // Прибавляем сумму перевода к балансу карты, на которую переводим
            toCard.balance += transferAmount;
        } else {
            System.out.println("Not enough balance on the card to transfer");
        }
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

