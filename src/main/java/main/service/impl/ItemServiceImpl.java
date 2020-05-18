package main.service.impl;

import main.entity.Item;
import main.repository.ItemRepository;
import main.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public List<Item> getItemWithQuantityOverTwenty() {
        return itemRepository.getItemWithQuantityOverTwenty();
    }

    @Override
    public List<Item> getItemWithQuantityOver(int minQuantityThreshold) {
        return itemRepository.getItemWithQuantityOver(minQuantityThreshold);
    }

    @Override
    public List<Item> getItemWithNameLike(String regex) {
        return itemRepository.getItemWithNameLike(regex);
    }

    @Override
    public List<Item> findByQuantity(Integer quantity) {
        return itemRepository.findByQuantity(quantity);
    }

    @Override
    public List<Item> findByQuantityBetween(Integer min, Integer max) {
        return itemRepository.findByQuantityBetween(min, max);
    }

    @Override
    public List<Item> findByQuantityGreaterThanEqualOrderByQuantityDesc(Integer min) {
        return itemRepository.findByQuantityGreaterThanEqualOrderByQuantityDesc(min);
    }

    @Override
    public void saveItem(Item item) {
        itemRepository.save(item);

    }
}
