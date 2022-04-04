import org.junit.Assert;
import org.junit.Test;

public class SimpleTest extends BaseTest{
    private final static String URL = "https://appleinsider.ru/";
    private final static String SearchText = "Чем iPhone 13 отличается от iPhone 12";
    private final static String Expected_Words = "iphone-13";

    @Test
    public void checkHrefArticle(){
        MainPage mainPage = new MainPage();
        SearchPage searchPage = new SearchPage();
        openWebsite(URL);
        mainPage.clickOnSearch(SearchText);
        String href = searchPage.getHrefFromFirstArticle();
        Assert.assertTrue(href.contains("iphone-13"));
    }

    @Test
    public void checkHrefArticleTiny(){
        openWebsite(URL);
        Assert.assertTrue(new MainPage()
                .clickOnSearch(SearchText)
                .getHrefFromFirstArticle()
                .contains(Expected_Words));
    }
}
