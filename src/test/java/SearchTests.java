import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void successfulSearchTest() throws InterruptedException {
        open("https://www.bing.com/");
        $("[name=q").setValue("selenide").pressEnter();
        $("[id=b_results]").shouldHave(text("https://selenide.org"));
    }
}

