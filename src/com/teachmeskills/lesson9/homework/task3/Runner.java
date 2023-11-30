package com.teachmeskills.lesson9.homework.task3;

import com.teachmeskills.lesson9.homework.task3.banktransfer.BankTransfer;
import com.teachmeskills.lesson9.homework.task3.card.AbstractCard;
import com.teachmeskills.lesson9.homework.task3.card.Belcard;
import com.teachmeskills.lesson9.homework.task3.card.Mastercard;
import com.teachmeskills.lesson9.homework.task3.client.Client;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // создание клиента и его карт
        Client client = new Client("John", "Brown", "er930193", "01.01.01");
        AbstractCard card1 = new Belcard(123456789, 111, 1000.13, 111, "BYN");
        AbstractCard card2 = new Mastercard(987654321, 222, 2543.09, 222, "EUR");
        client.addCard(card1);
        client.addCard(card2);

        System.out.print("Enter the card id to transfer from: ");
        int fromCardId = scanner.nextInt();
        System.out.print("Enter the card id to transfer to: ");
        int toCardId = scanner.nextInt();
        System.out.print("Enter the transfer amount: ");
        double transferAmount = scanner.nextDouble();

        // нахождение карт для перевода по id
        AbstractCard fromCard = client.findCardById(fromCardId);
        AbstractCard toCard = client.findCardById(toCardId);

        // проверка наличия карт и выполнение перевода
        if (fromCard != null && toCard != null) {
            // выполнение перевода
            BankTransfer.cardTransfer(fromCard, toCard, transferAmount);
        } else {
            System.out.println("Transfer failed! Invalid card id.");
        }

        // вывод информации о клиенте и его картах
        System.out.println("Client: " + client.getFullName());
        System.out.println("Number of cards: " + client.getNumberOfCards());
        for (AbstractCard card : client.getCards()){
            if (card != null){
                System.out.println("Card: " + card.getNumber());
                System.out.println("Balance before transfer: " + card.getBalance());
                System.out.println("Balance after transfer: " + card.getBalance());
            }
        }
    }
}
