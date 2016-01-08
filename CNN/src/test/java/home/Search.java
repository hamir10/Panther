package home;

import news.CnnBase;
import org.testng.annotations.Test;
import util.DataReader;
import CommonAPI.Base;
import java.io.IOException;


/**
 * Created by H on 1/5/2016.
 */
public class Search extends Base{

    DataReader dr = new DataReader();
    String path = "CNN\\data\\file1.sxc";


    @Test
    public void searchItems() throws IOException{

        String [][] itemLocator = dr.fileReader(path);
        typeBycssThenEnter(itemLocator[1][0], itemLocator[1][1]);
        typeBycssThenEnter(itemLocator[2][0], itemLocator[2][1]);
        typeBycssThenEnter(itemLocator[3][0], itemLocator[3][1]);
        typeBycssThenEnter(itemLocator[4][0], itemLocator[4][1]);
    }
}
