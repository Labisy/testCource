package ru.stepchenkov.test.demoqa;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.stepchenkov.test.core.BaseTestSetup;
import ru.stepchenkov.test.demoqa.pages.MainPage;
import ru.stepchenkov.test.readProperties.ConfigurationProvider;

class StartTests extends BaseTestSetup {

    @Test
    void checkTextBox() {
        var response = new MainPage()
                .getElementPage()
                .getTextBox()
                .createFullTicket(
                        ConfigurationProvider.NAME,
                        ConfigurationProvider.EMAIL,
                        ConfigurationProvider.ADDRESS,
                        ConfigurationProvider.PERMANENT_ADDRESS)
                .findTicket();

        Assertions.assertThat(response)
                .isNotNull()
                .isEqualTo(ConfigurationProvider.getFullTicket());
    }

}
