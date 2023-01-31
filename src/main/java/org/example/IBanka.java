package org.example;

public interface IBanka {
    void connect();
    void payment(double price, String cardNumber, String expireDate, String cvc);
}
