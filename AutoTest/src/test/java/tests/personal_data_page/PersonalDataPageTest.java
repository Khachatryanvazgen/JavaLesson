package tests.personal_data_page;

import org.testng.annotations.Test;
import pages.base.BasePage;
import tests.base.BaseTest;
import static constants.Constant.Urls.REALT_HOME_PAGE;

public class PersonalDataPageTest extends BaseTest {
@Test
    public void checkPersonalDataPage(){
    basePage.openPage(REALT_HOME_PAGE);

    personalData
            .fillInName("Vazgenwwwwwwwwww");


    }
}
