package ru.stepchenkov.test.util;

import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.entity.textBox.Ticket;

public class ResponseConverter {

    public static Ticket getNormalTiket(String name, String email, String address, String permanentAddress) {
        return Ticket.builder()
                .name(getTrueValue(name))
                .email(getTrueValue(email))
                .address(getTrueValue(address))
                .permanentAddress(getTrueValue(permanentAddress))
                .build();
    }

    public static Ticket getNormalTiket(String name, String email) {
        return Ticket.builder()
                .name(getTrueValue(name))
                .email(getTrueValue(email))
                .build();
    }

    private static String getTrueValue(String value) {
        return value.split(":")[1];
    }
}
