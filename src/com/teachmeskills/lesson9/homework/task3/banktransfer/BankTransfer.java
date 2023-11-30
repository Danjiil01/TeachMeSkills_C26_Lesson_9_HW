package com.teachmeskills.lesson9.homework.task3.banktransfer;

import com.teachmeskills.lesson9.homework.task3.card.AbstractCard;
import com.teachmeskills.lesson9.homework.task3.card.Belcard;
import com.teachmeskills.lesson9.homework.task3.card.Mastercard;
import com.teachmeskills.lesson9.homework.task3.card.Visacard;

public class BankTransfer {
    // Метод для перевода суммы с одной карты на другую
    public static void cardTransfer(AbstractCard fromCard, AbstractCard toCard, double amount) {
        // Проверка наличия суммы для перевода на карте fromCard
        if (fromCard.getBalance() >= amount) {
            // Проверка лимитов для карты fromCard
            if (fromCard instanceof Belcard && amount <= Belcard.LIMIT) {
                fromCard.withdraw(amount);  // Списание суммы с карты fromCard
                // Конвертация суммы, если валюта карты fromCard отличается от валюты карты toCard
                if (!fromCard.getCurrency().equals(toCard.getCurrency())) {
                    amount = amount * fromCard.getExchangeRate(toCard.getCurrency());
                }
                toCard.deposit(amount);  // Зачисление суммы на карту toCard
                // Расчет и учет комиссии
                double commission = amount * fromCard.getCommissionRate();
                fromCard.withdraw(commission);
                System.out.println("Transfer successful!");
            } else if (fromCard instanceof Mastercard && amount <= Mastercard.LIMIT) {
                // Аналогичные проверки и действия для карт типа Mastercard
            } else if (fromCard instanceof Visacard && amount <= Visacard.LIMIT) {
                // Аналогичные проверки и действия для карт типа Visacard
            } else {
                System.out.println("Transfer failed! Amount exceeds the limit for the card.");
            }
        } else {
            System.out.println("Transfer failed! Insufficient balance.");
        }
    }

    public static void transfer(AbstractCard fromCard, AbstractCard toCard, double transferAmount) {
    }
}
