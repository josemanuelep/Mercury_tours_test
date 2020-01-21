package co.com.choucair.certification.mercurytours.util;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

public class GetCheapest {

    public static WebElementFacade flight(List<WebElementFacade> listPrices) {

        TreeMap<String, WebElementFacade> tree_map = new TreeMap<>();

        for (int i = 0; i < listPrices.size(); i++) {
            tree_map.put(listPrices.get(i).getAttribute("value").split("\\$")[2], listPrices.get(i));
        }
        NavigableMap<String, WebElementFacade> ranking = tree_map.descendingMap();

        return ranking.get(ranking.lastKey());
    }


}
