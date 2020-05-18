package main.controller;

import main.entity.Item;
import main.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    ItemService itemService;

    @RequestMapping("/")
    public List<Item> index() {
        System.out.println("controller");


        //return itemService.getItemWithQuantityOverTwenty();
        // return  itemService.findByQuantity(20);
        //return itemService.findByQuantityBetween(20, 60);
        return itemService.findByQuantityGreaterThanEqualOrderByQuantityDesc(50);
    }

    @RequestMapping("/quantity_treshold")
    public List<Item> quantityTreshold(@RequestParam(name = "quantity") int quantity) {
        System.out.println("controller");


        return itemService.getItemWithQuantityOver(quantity);
    }

    @RequestMapping("/find_by_name")
    public List<Item> findByName() {
        //String regexName="soc__";
        String regexName = "s%";
        List<Item> itemsWithNameLike = itemService.getItemWithNameLike(regexName);
        return itemsWithNameLike;
    }
}
