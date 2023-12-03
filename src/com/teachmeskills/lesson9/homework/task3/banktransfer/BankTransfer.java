package com.teachmeskills.lesson9.homework.task3.banktransfer;

import com.teachmeskills.lesson9.homework.task3.card.AbstractCard;
import com.teachmeskills.lesson9.homework.task3.card.BelCard;
import com.teachmeskills.lesson9.homework.task3.card.MasterCard;
import com.teachmeskills.lesson9.homework.task3.card.VisaCard;

public class BankTransfer {
    // Метод для перевода суммы с одной карты на другую
    public static void CardTransfer(AbstractCard fromCard, AbstractCard toCard, double amount) {
        // Проверка наличия суммы для перевода на карте fromCard
        if (fromCard.getBalance() >= amount) {
            // Проверка лимитов для карты fromCard
            if (fromCard instanceof BelCard && amount <= BelCard.LIMIT) {
                fromCard.Withdraw(amount);  // Списание суммы с карты fromCard
                // Конвертация суммы, если валюта карты fromCard отличается от валюты карты toCard
                if (!fromCard.getCurrency().equals(toCard.getCurrency())) {
                    amount = amount * fromCard.getExchangeRate(toCard.getCurrency());
                }
                toCard.Deposit(amount);  // Зачисление суммы на карту toCard
                // Расчет и учет комиссии
                double commission = amount * fromCard.getCommissionRate();
                fromCard.Withdraw(commission);
                System.out.println("Transfer successful!");
            } else if (fromCard instanceof MasterCard && amount <= MasterCard.LIMIT) {
                // Аналогичные проверки и действия для карт типа MasterCard
            } else if (fromCard instanceof VisaCard && amount <= VisaCard.LIMIT) {
                // Аналогичные проверки и действия для карт типа VisaCard
            } else {
                System.out.println("Transfer failed! Amount exceeds the limit for the card.");
            }
        } else {
            System.out.println("Transfer failed! Insufficient balance.");
        }
    }
}
