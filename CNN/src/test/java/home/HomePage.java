package home;

import CommonAPI.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by H on 12/29/2015.
 */
public class HomePage extends Base{
    @Test
    public void navigateTabs(){
        clickByCss("#search-button");
    }

}
