package ru.stepchenkov.test.readProperties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import ru.stepchenkov.test.demoqa.pages.elementsPage.elements.textbox.entity.Ticket;

public interface ConfigurationProvider {

    Config config = getConfig();

    private static Config getConfig() {
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("application.conf");
    }

    static Ticket getFullTicket() {
        return Ticket.builder()
                .name(config.getString("element.textBox.ticket.full.name"))
                .email(config.getString("element.textBox.ticket.full.email"))
                .address(config.getString("element.textBox.ticket.full.address"))
                .permanentAddress(config.getString("element.textBox.ticket.full.permanentAddress"))
                .build();
    }

    static Ticket getHalfTicket() {
        return Ticket.builder()
                .name(config.getString("element.textBox.ticket.full.name"))
                .email(config.getString("element.textBox.ticket.full.email"))
                .build();
    }

    String URL = config.getString("url");
    String NAME = config.getString("element.textBox.ticket.full.name");
    String EMAIL = config.getString("element.textBox.ticket.full.email");
    String ADDRESS = config.getString("element.textBox.ticket.full.address");
    String PERMANENT_ADDRESS = config.getString("element.textBox.ticket.full.permanentAddress");
    String YES = config.getString("element.radioButton.yes");
    String IMPRESSIVE = config.getString("element.radioButton.impressive");
}
