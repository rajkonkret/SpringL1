package main.service;

import main.entity.Item;

import java.util.List;

public interface ItemService {

    public void saveItem(Item item);

    public List<Item> getItemWithQuantityOverTwenty();

    public List<Item> getItemWithQuantityOver(int minQuantityThreshold);

    public List<Item> getItemWithNameLike(String regex);

    public List<Item> findByQuantity(Integer quantity);

    public List<Item> findByQuantityBetween(Integer min, Integer max);

    public List<Item> findByQuantityGreaterThanEqualOrderByQuantityDesc(Integer min);

}
