package amazon;

import CommonAPI.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import search.DropDownSearchList;

import java.util.List;

/**
 * Created by H on 12/29/2015.
 */
public class
Retail extends DropDownSearchList {
    @Test
    public void home(){
        List<String> searchItems = getDropDownList("#searchDropdownBox");
        typeBycssThenEnter("#twotabsearchtextbox", "Paulo Coelho");
    }
}
