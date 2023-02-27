package org.example;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("+79991112200","iPhone11", 200);
        phone.toString();
        phone.receiveCall("Мой номер ");
        phone.sendMessage();
    }
}