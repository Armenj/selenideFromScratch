import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement searchButton = $x("//input[@type='text']");

    public SearchPage clickOnSearch(String searchString){
        searchButton.setValue(searchString);
        searchButton.sendKeys(Keys.ENTER);
        return new SearchPage();
    }




}
