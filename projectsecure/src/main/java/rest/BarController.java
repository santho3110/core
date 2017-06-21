package rest;

import model.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.BarService;
import service.IBarService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by srajasi on 6/2/2017.
 */
@RestController
@RequestMapping("bar")
public class BarController {

    @Autowired
    BarService barService;

    @GetMapping
    @PreAuthorize ("hasRole('ROLE_WRITE')")
    public List<Drink> getDrinks(){
        System.out.println("Getting Drinks ;)");
        return barService.drinksList();
    }

}
