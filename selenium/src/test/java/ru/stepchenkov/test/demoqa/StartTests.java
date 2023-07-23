package ru.stepchenkov.test.demoqa;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.stepchenkov.test.core.BaseTestSetup;
import ru.stepchenkov.test.demoqa.pages.MainPage;
import ru.stepchenkov.test.readProperties.ConfigurationProvider;

import java.util.List;

class StartTests extends BaseTestSetup {

    @Test
    void checkTextBox() {
        var response = new MainPage()
                .getElementPage()
                .textBox()
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

    @Test
    void checkBox() {
        var checkBoxPage = new MainPage()
                .getElementPage()
                .checkBox();
        checkBoxTesting(checkBoxPage.clickHomeCheckBox(), true, true, true);
        checkBoxTesting(checkBoxPage.clickDocumentsInHome(), false, false, false);
        checkBoxTesting(checkBoxPage.clickDesktopInHome(), false, false, false);
        checkBoxTesting(checkBoxPage.clickDownloadInHome(), false, false, false);
    }

    private void checkBoxTesting(List<Boolean> list, boolean... value) {
        Assertions.assertThat(list)
                .isNotNull()
                .hasSize(3)
                .containsExactlyInAnyOrder(value[0], value[1], value[2]);
    }
}
