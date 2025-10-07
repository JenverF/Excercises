package com.pluralsight.workbook2.OOP;

import java.time.LocalDate;

public class TextMessageApp {
    static void main() {
        TextMessage txt = new TextMessage();
        txt.setSenderNumber("+31611111111");
        txt.setReceiverNumber("+31622222222");
        txt.setBody("On my way!");
        txt.setSentOn(LocalDate.now());
        txt.display();

        TextMessage txt2 = new TextMessage("+414141", "+676767", "Lol", LocalDate.now());
        txt2.display();
    }
}
