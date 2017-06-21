package service;

import model.Drink;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by srajasi on 6/5/2017.
 */
public interface IBarService {

    public List<Drink> drinksList();

}
