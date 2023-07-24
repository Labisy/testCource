package ru.stepchenkov.test.util;

import org.assertj.core.api.Assertions;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.TextBox;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.entity.textBox.Ticket;
import ru.stepchenkov.test.readProperties.ConfigurationProvider;

public final class TextBoxUtil {

    public static Ticket getNormalTicket(String name, String email, String address, String permanentAddress) {
        return Ticket.builder()
                .name(getTrueValue(name))
                .email(getTrueValue(email))
                .address(getTrueValue(address))
                .permanentAddress(getTrueValue(permanentAddress))
                .build();
    }

    public static Ticket getNormalTicket(String name, String email) {
        return Ticket.builder()
                .name(getTrueValue(name))
                .email(getTrueValue(email))
                .build();
    }

    private static String getTrueValue(String value) {
        return value.split(":")[1];
    }

    public static void testFullTicket(TextBox textBox) {
        var response = textBox.createFullTicket(
                        ConfigurationProvider.NAME,
                        ConfigurationProvider.EMAIL,
                        ConfigurationProvider.ADDRESS,
                        ConfigurationProvider.PERMANENT_ADDRESS)
                .findTicket();

        checkTicket(response, ConfigurationProvider.getFullTicket());
    }

    private static void checkTicket(Ticket response, Ticket expected) {
        Assertions.assertThat(response)
                .isNotNull()
                .isEqualTo(expected);
    }
}
