package amazon;

import CommonAPI.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by H on 12/29/2015.
 */
public class Retail extends Base {
    @Test
    public void home(){
        typeByCss("#twotabsearchtextbox", "Paulo Coelho");
    }
}
