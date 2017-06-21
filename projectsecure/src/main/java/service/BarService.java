package service;

import model.Drink;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by srajasi on 6/5/2017.
 */
@Component
public class BarService {
    public List<Drink> drinksList() {
        List<Drink> drinks = new ArrayList<Drink>(10);
        drinks.add(new Drink("101","Apple crush", "Fresh Juice", "Pale Wight"));
        drinks.add(new Drink("102","Lemon Mint", "Fresh Juice", "Mint Green"));
        drinks.add(new Drink("103","Twister", "Liquor", "Orange"));
        drinks.add(new Drink("104","Black Grape", "Fresh Juice", "Violate"));
        return drinks;
    }
}
