package com.teachmeskills.lesson9.homework.task3.client;

import com.teachmeskills.lesson9.homework.task3.card.AbstractCard;

public class Client {
    private String firstName;
    private String lastName;
    private String passportNumber;
    private String birthDate;
    private AbstractCard[] cards;
    private int numberOfCards;

    public Client(String firstName, String lastName, String passportNumber, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.birthDate = birthDate;
        this.cards = new AbstractCard[100];
        this.numberOfCards = 0;
    }

    public void AddCard(AbstractCard card) {
        cards[numberOfCards] = card;
        numberOfCards++;
    }

    public AbstractCard FindCardById(int cardId) {
        for (AbstractCard card : cards) {
            if (card != null && card.getId() == cardId) {
                return card;
            }
        }
        return null;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }

    public AbstractCard[] getCards() {
        return cards;
    }
}
