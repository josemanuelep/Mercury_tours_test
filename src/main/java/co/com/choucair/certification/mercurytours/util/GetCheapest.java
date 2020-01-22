package co.com.choucair.certification.mercurytours.util;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

public class GetCheapest {

    private GetCheapest() {
        //Default constructor
    }

    public static WebElementFacade flight(List<WebElementFacade> listPrices) {

        TreeMap<String, WebElementFacade> treeMap = new TreeMap<>();

        for (int i = 0; i < listPrices.size(); i++) {
            treeMap.put(listPrices.get(i).getValue().split("\\$")[2], listPrices.get(i));
        }
        NavigableMap<String, WebElementFacade> ranking = treeMap.descendingMap();
        String lastIndex = ranking.firstKey();
        return ranking.get(lastIndex);
    }


}
