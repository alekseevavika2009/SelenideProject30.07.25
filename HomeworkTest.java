import jdk.internal.jimage.BasicImageReader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomeworkTest {

@Test
    public void testSelenideCollection() {

    Selenide.open("http://demoblaze.com");

    SelenideElement nokiaLumia1520 = Selenide.element(By.text("Nokia lumia 1520"));
        nokiaLumia1520.click();
    SelenideElement addToCartButton = Selenide.element(Selectors.byTagAndText("button", "Add to cart");
            addToCartButton.click();
            Selenide.confirm();
    Selenide.open("http://demoblaze.com");

    SelenideElement iphone6 = Selenide.element(By.text("Iphone 6 32gb"));
        iphone6.click();
    SelenideElement addToCartButton = Selenide.element(Selectors.byTagAndText("button", "Add to cart");
    addToCartButton.click();
        Selenide.confirm();
    Selenide.open("http://demoblaze.com");

    SelenideElement sonyVaio17 = Selenide.element(By.text("Sony vaio i7"));
        iphone6.click();
    SelenideElement addToCartButton = Selenide.element(Selectors.byTagAndText("button", "Add to cart");
        addToCartButton.click();
        Selenide.confirm();
    Selenide.open("http://demoblaze.com/cart.html");

    SelenideElement priceTotal = Selenide.element(By.xpath("td[3]"));
    System.out.println("Цена всех товаров в корзине : " + priceTotal);

    SelenideElement placeOrderButton = Selenide.element(Selectors.byTagAndText("button", "Place order");
    placeOrderButton.click();
    SelenideElement purchaseButton = Selenide.element(Selectors.byTagAndText("button", "Purchase");
    purchaseButton.click();

}
}
