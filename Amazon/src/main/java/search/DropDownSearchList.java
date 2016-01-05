package search;

import CommonAPI.Base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by H on 12/31/2015.
 */
public class DropDownSearchList extends Base {

    public List<String> getDropDownList(String locator){
        List<String> list = new ArrayList<String>();
        list = getElementTexts(locator);
        return list;

    }

}
