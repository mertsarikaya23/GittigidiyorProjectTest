import TESTMETHODS.TestPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class MainTestClass extends TestPage
{
    @Test
    public void run()
    {
        userRegistration();
        login();
        searchProduct();
        addBasket();
        assertMethod();
        addAdress();

    }
}
