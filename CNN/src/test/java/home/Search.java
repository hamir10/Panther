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
    String path = "CNN\\data\\file1.xls";


    @Test
    public void searchItems() throws IOException{

        String [][] itemLocator = dr.fileReader(path);

        for(int i=1; i<=itemLocator.length; i++) {
            typeBycssThenEnter(itemLocator[i][0], itemLocator[i][1]);
        }
    }
}
